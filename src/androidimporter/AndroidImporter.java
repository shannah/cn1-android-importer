/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package androidimporter;

import com.codename1.android.AndroidLayoutImporter;
import com.codename1.android.AndroidProjectImporter;
import com.codename1.android.AndroidStringImporter;
import com.codename1.impl.javase.JavaSEPort;
import com.codename1.io.Util;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Display;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.xml.sax.SAXException;

/**
 *
 * @author shannah
 */
public class AndroidImporter {

    public static String ucFirst(String str) {
        if (str.length() > 0) {
            return str.substring(0,1).toUpperCase() + str.substring(1);
        }
        return str;
    }
    
    public static String toCamelCase(String str) {
        String[] nameParts = str.split("[^0-9a-zA-Z]");
        StringBuilder sb = new StringBuilder();
        sb.append(nameParts[0]);
        for (int i=1; i<nameParts.length; i++) {
            String part = nameParts[i];
            if (part.length() > 0) {
                sb.append(part.substring(0,1).toUpperCase()).append(part.substring(1));
            }
        }
        return sb.toString();
    }
    
    
    public static void main(String[] args) throws ParseException  {
        Options opts = new Options()
                .addOption("i", "android-resource-dir", true, "Android project res directory path")
                .addOption("o", "cn1-project-dir", true, "Path to the CN1 output project directory.")
                .addOption("r", "cn1-resource-file", false, "Path to CN1 output .res file.  Defaults to theme.res in project dir")
                .addOption("p", "package", true, "Java package to place GUI forms in.")
                .addOption("h", "help", false, "Usage instructions");

        CommandLineParser parser = new DefaultParser();
        
        CommandLine line = parser.parse(opts, args);
        
        if (line.hasOption("help")) {
            showHelp(opts);
            System.exit(0);
        }
        args = line.getArgs();
            
        
        
        if (args.length < 1) {
            System.out.println("No command provided.");
            showHelp(opts);
            System.exit(0);
        }
        
        switch (args[0]) {
            case "import-project" : {
                
                
                if (!line.hasOption("android-resource-dir") || !line.hasOption("cn1-project-dir") || !line.hasOption("package")) {
                    System.out.println("Please provide android-resource-dir, package, and cn1-project-dir options");
                    showHelp(opts);
                    System.exit(1);
                }
                File resDir = findResDir(new File(line.getOptionValue("android-resource-dir")));
                if (resDir == null || !resDir.isDirectory()) {
                    System.out.println("Failed to find android resource directory from provided value");
                    showHelp(opts);
                    System.exit(1);
                }
                
                File projDir = new File(line.getOptionValue("cn1-project-dir"));
                File resFile = new File(projDir, "src" + File.separator + "theme.res");
                if (line.hasOption("cn1-resource-file")) {
                    resFile = new File(line.getOptionValue("cn1-resource-file"));
                }
                
                JavaSEPort.setShowEDTViolationStacks(false);
                JavaSEPort.setShowEDTWarnings(false);
                JFrame frm = new JFrame("Placeholder");
                frm.setVisible(false);
                Display.init(frm.getContentPane());
                JavaSEPort.setBaseResourceDir(resFile.getParentFile());
                try {
                    System.out.println("About to import project at "+resDir.getAbsolutePath());
                    System.out.println("Codename One Output Project: "+projDir.getAbsolutePath());
                    System.out.println("Resource file: "+resFile.getAbsolutePath());
                    System.out.println("Java Package: "+line.getOptionValue("package"));
                    AndroidProjectImporter.importProject(resDir, projDir, resFile, line.getOptionValue("package"));
                    Runtime.getRuntime().exec(new String[]{"/usr/local/apache-ant/bin/ant", "init"}, new String[]{}, resFile.getParentFile().getParentFile());
                    System.exit(0);
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    System.exit(0);
                }
                break;
            }
                
            default: 
                System.out.println("Unknown command "+args[0]);
                showHelp(opts);
                break;
                
        }
        
        
    }
    
    private static void showHelp(Options opts) {
        HelpFormatter help = new HelpFormatter();
        help.printHelp("java -jar AndroidImporter.jar import-project [options]", opts);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main_old(String[] args) throws Exception {
        // TODO code application logic here
        
        JavaSEPort.setShowEDTViolationStacks(false);
        JavaSEPort.setShowEDTWarnings(false);
        JFrame frm = new JFrame("Placeholder");
        frm.setVisible(false);
        Display.init(frm.getContentPane());
        
        
        
        File k9MailResFolder = new File("test_inputs/k9mail/src/main/res");
        File k9MailLayout = new File(k9MailResFolder, "layout");
        File resDest = new File(new File("AndroidImporterTestBed/src"), "theme.res");
        JavaSEPort.setBaseResourceDir(resDest.getParentFile());
        
        
        for (File folder : k9MailResFolder.listFiles()) {
            if (!folder.getName().startsWith("values")) {
                continue;
            }
            String locale = "en";
            if (folder.getName().contains("-")) {
                locale = folder.getName().substring(folder.getName().indexOf("-")+1);
            }
            File stringsFile = new File(folder, "strings.xml");
            if (!stringsFile.exists()) {
                continue;
            }
            AndroidStringImporter.importStrings(stringsFile, resDest, locale, null);
        }
        
        for (File input : k9MailLayout.listFiles()) {
            if (input.getName().endsWith(".xml")) {
                String baseName = ucFirst(toCamelCase(input.getName().replaceFirst("\\.xml$", "")));
                String guiName = baseName+".gui";
                String javaName = baseName+".java";
                
                
                File dest = new File(new File("AndroidImporterTestBed/res/guibuilder/com/codename1/k9tests"), guiName);
                if (!dest.getParentFile().exists()) {
                    dest.getParentFile().mkdirs();
                }
                
                File javaDest = new File(new File("AndroidImporterTestBed/src/com/codename1/k9tests"), javaName);
                if (!javaDest.getParentFile().exists()) {
                    javaDest.getParentFile().mkdirs();
                }
                
                
                AndroidLayoutImporter.importLayout(input, dest, resDest, null);
                
                /*
                GenerateGuiSources gen = new GenerateGuiSources();
                gen.setGuiDir(new File("AndroidImporterTestBed/res/guibuilder"));
                gen.setSrcDir(new File("AndroidImporterTestBed/src"));
                String javaSource = gen.generateFullSource(dest);
                
                try (FileOutputStream fos = new FileOutputStream(javaDest)) {
                    fos.write(javaSource.getBytes("UTF-8"));
                }*/
                
                
                
            }
        }
        
        Runtime.getRuntime().exec(new String[]{"/usr/local/apache-ant/bin/ant", "init"}, new String[]{}, resDest.getParentFile().getParentFile());
        System.exit(0);
        
        //AndroidLayoutImporter.importLayout(new File(args[0]), new File(args[1]));
    }
    
    private static File findResDir(File resDir) {
        System.out.println("Checking dir "+resDir+" to see if it is an android res directory....");
        if (resDir == null || !resDir.exists() || !resDir.isDirectory()) {
            return null;
        }
        if ("res".equals(resDir.getName())) {
            return resDir;
        }
        File parent = resDir.getParentFile();
        while (parent != null && !"res".equals(parent.getName())) {
            parent = parent.getParentFile();
        }
        if (parent != null && "res".equals(parent.getName())) {
            return parent;
        }
        
        for (File child : resDir.listFiles()) {
            if (child.getName().startsWith(".") || !child.isDirectory()) {
                continue;
            }
            File out = findResDir(child);
            if (out != null) {
                return out;
            }
            
        }
        return null;
    }
    
}

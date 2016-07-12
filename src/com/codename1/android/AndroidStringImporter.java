/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.android;

import com.codename1.ui.util.EditableResources;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author shannah
 */
public class AndroidStringImporter {
    private final EditableResources res;
    private final File inputFile, resourceFile;
    private final Document inputDOM;
    private final String locale;
    private boolean saveResourceFile = true;
    
    private AndroidStringImporter(File inputFile, File resourceFile, String locale, EditableResources res) throws ParserConfigurationException, SAXException, IOException {
        this.inputFile = inputFile;
        this.resourceFile = resourceFile;
        if (res != null) {
            this.res = res;
        } else {
            this.res = new EditableResources();
            if (resourceFile.exists()) {
                try (FileInputStream fis = new FileInputStream(resourceFile)){
                    this.res.openFileWithXMLSupport(resourceFile);
                }
            }
        }
        if (locale == null) {
            File parentDir = inputFile.getParentFile();
            if (parentDir.getName().startsWith("values-")) {
                locale = parentDir.getName().substring(parentDir.getName().indexOf("-")+1);
            } else {
                locale = "en";
            }
        }
        this.locale = locale;
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        

        inputDOM = builder.parse(inputFile);
    }
    
    public void execute() throws FileNotFoundException, IOException {
        NodeList l = inputDOM.getElementsByTagName("string");
        List<String> resourceNames = Arrays.asList(res.getL10NResourceNames());

        String id = "strings";
        if (!resourceNames.contains(id)) {
            Hashtable h = new Hashtable();
            h.put(locale, new Hashtable<String,String>());
            res.setL10N(id, h);
        }
        
        Map<String,String> strings = res.getL10N(id, locale);
        if (strings == null) {
            res.addLocale(id, locale);
            strings = res.getL10N(id, locale);
        }
        int len = l.getLength();
        System.out.println("Importing "+len+" strings for locale "+locale+" into "+resourceFile.getAbsolutePath());
        for (int i=0; i<len; i++) {
            Element string = (Element)l.item(i);
            strings.put(string.getAttribute("name"), string.getTextContent());
        }
        
        if (saveResourceFile) {
            try (FileOutputStream fos = new FileOutputStream(resourceFile)){
                res.save(fos);
            }
        }
        
    }
    
    public static void importStrings(File inputFile, File resourceFile, String locale, EditableResources res) throws ParserConfigurationException, SAXException, IOException {
        AndroidStringImporter importer = new AndroidStringImporter(inputFile, resourceFile, locale, res);
        System.out.println("Importing strings from "+inputFile.getAbsolutePath()+" into "+resourceFile.getAbsolutePath());
        importer.saveResourceFile = res == null;
        importer.execute();
    }
    
    public static void importProjectStrings(File inputResourceDir, File resourceFile) throws ParserConfigurationException, SAXException, IOException {
        EditableResources res = new EditableResources();
        if (resourceFile.exists()) {
            try (FileInputStream fis = new FileInputStream(resourceFile)){
                res.openFileWithXMLSupport(resourceFile);
            }
        }
        
        for (File dir : inputResourceDir.listFiles()) {
            if (dir.getName().startsWith("values")) {
                for (File xmlFile : dir.listFiles()) {
                    
                    if (xmlFile.getName().equals("strings.xml")) {
                        importStrings(xmlFile, resourceFile, (String)null, res);
                    }
                }
            }
        }
        
        try (FileOutputStream fos = new FileOutputStream(resourceFile)){
            res.save(fos);
        }
        
        
        System.out.println("To use imported strings, you should add the following inside your app's init() method:");
        System.out.println("UIManager.getInstance().setBundle(theme.getL10N(\"strings\", L10NManager.getInstance().getLocale()));");
    }
}

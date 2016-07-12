/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.android;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
 *
 * @author shannah
 */
public class AndroidProjectImporter {
    private final File inputResourceDir;
    private final File outputProjectDir;
    private final File outputResourceFile;
    private final String outputLayoutsJavaPackage;
    
    private AndroidProjectImporter(File inputResourceDir, File outputProjectDir, File outputResourceFile, String outputLayoutsJavaPackage) {
        this.inputResourceDir = inputResourceDir;
        this.outputProjectDir = outputProjectDir;
        this.outputResourceFile = outputResourceFile;
        this.outputLayoutsJavaPackage = outputLayoutsJavaPackage;
    }
    
    public void execute() throws IOException, ParserConfigurationException, SAXException, FileNotFoundException, TransformerException, TransformerConfigurationException, AndroidLayoutImporter.UnsupportedElementException {
        if (outputResourceFile.exists()) {
            // If the resource file exists, let's back it up
            int index = 0;
            File bakFile = new File(outputResourceFile.getParentFile(), outputResourceFile.getName()+".bak");
            while (bakFile.exists()) {
                bakFile = new File(outputResourceFile.getParentFile(), outputResourceFile.getName()+".bak"+index);
                index++;
            }
            
            System.out.println("Backing up "+outputResourceFile+" to "+bakFile);
            Files.copy(outputResourceFile.toPath(), bakFile.toPath(), StandardCopyOption.COPY_ATTRIBUTES);
        }
        AndroidStringImporter.importProjectStrings(inputResourceDir, outputResourceFile);
        AndroidImageImporter.importImages(inputResourceDir, outputResourceFile);
        AndroidLayoutImporter.importProjectLayouts(inputResourceDir, outputProjectDir, outputResourceFile, outputLayoutsJavaPackage);
    }
    
    public static void importProject(File inputResourceDir, File outputProjectDir, File outputResourceFile, String outputLayoutsJavaPackage) throws IOException, ParserConfigurationException, SAXException, FileNotFoundException, TransformerException, TransformerConfigurationException, AndroidLayoutImporter.UnsupportedElementException {
        AndroidProjectImporter im = new AndroidProjectImporter(inputResourceDir, outputProjectDir, outputResourceFile, outputLayoutsJavaPackage);
        im.execute();
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.android;

import com.codename1.ui.Display;
import com.codename1.ui.util.EditableResources;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author shannah
 */
public class AndroidImageImporter {
    private final File inputResDir;
    private final String resourceName;
    private final File outputResourceFile;
    private final EditableResources res;
    private boolean saveResourceFile;
    
    private AndroidImageImporter(File inputResDir, String resourceName, File outputResourceFile, EditableResources res) throws IOException {
        this.resourceName = resourceName;
        this.inputResDir = inputResDir;
        this.outputResourceFile = outputResourceFile;
        if (res != null) {
            this.res = res;
        } else {
            this.res = new EditableResources();
            if (outputResourceFile.exists()) {
                try (FileInputStream fis = new FileInputStream(outputResourceFile)){
                    this.res.openFile(fis);
                }
            }
        }
        
        if (!inputResDir.exists() || !inputResDir.isDirectory()) {
            throw new RuntimeException("The inputResDir specified does not exist or is not a directory: "+inputResDir.getAbsolutePath());
        }
        
    }
    
    
    public void execute() throws IOException {
        if (res.containsResource(resourceName)) {
            System.out.println("Not importing "+resourceName+" because one by the same name already exists in "+this.outputResourceFile);
            return;
        }
        List<File> images = new ArrayList<File>();
        
        for (File dir : inputResDir.listFiles()) {
            if (dir.getName().startsWith("drawable")) {
                for (File image : dir.listFiles()) {
                    if (image.getName().equals(resourceName)) {
                        images.add(image);
                    }
                }
            }
        }
        
        if (images.isEmpty()) {
            throw new RuntimeException("No resources found that match "+resourceName);
        }
        
        
        EditableResources.MultiImage multi = new EditableResources.MultiImage();
        com.codename1.ui.EncodedImage[] encImages = new com.codename1.ui.EncodedImage[images.size()];
        int[] dpis = new int[images.size()];

        int index = 0;
        for (File image : images) {
            String density = "xhdpi";
            String parentName = image.getParentFile().getName();
            if (parentName.startsWith("drawable-")) {
                density = parentName.substring(parentName.indexOf("-")+1);
            }
            int dpi = 0;
            switch (density) {
                case "ldpi":
                    dpi = Display.DENSITY_LOW;
                    break;
                case "mdpi":
                    dpi = Display.DENSITY_MEDIUM;
                    break;
                case "hdpi":
                    dpi = Display.DENSITY_HIGH;
                    break;
                case "xhdpi":
                    dpi = Display.DENSITY_VERY_HIGH;
                    break;
                case "xxhdpi":
                    dpi = Display.DENSITY_HD;
                    break;
                case "xxxhdpi":
                    dpi = Display.DENSITY_2HD;
                    break;
                default:
                    throw new RuntimeException("Unknown density for image "+density);
            }

            byte[] bytes = new byte[(int)image.length()];
            try (FileInputStream ifis = new FileInputStream(image)) {
                ifis.read(bytes);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AndroidImageImporter.class.getName()).log(Level.SEVERE, null, ex);
                // This shouldn't happen because we "found" the file already
                throw new RuntimeException(ex);
            }
            dpis[index] = dpi;
            encImages[index] = com.codename1.ui.EncodedImage.create(bytes);
            index++;
        }

        multi.setDpi(dpis);
        multi.setInternalImages(encImages);
        if (res.containsResource(resourceName)) {
            res.remove(resourceName);
        }
        res.setMultiImage(resourceName, multi);
        
        if (saveResourceFile) {
            try (FileOutputStream fos = new FileOutputStream(outputResourceFile)) {
                res.save(fos);
            }
        }
    }
    
    public static void importImage(File inputResDirectory, String resourceName, File outputResourceFile, EditableResources res) throws IOException {
        AndroidImageImporter im = new AndroidImageImporter(inputResDirectory, resourceName, outputResourceFile, res);
        System.out.println("Importing resource "+resourceName+" into "+outputResourceFile);
        im.saveResourceFile = res == null;
        im.execute();
    }
    
    public static void importImages(File inputResDirectory, File outputResourceFile) throws IOException {
        Set<String> resourceNames = new HashSet<String>();
        for (File dir : inputResDirectory.listFiles()) {
            if (dir.getName().startsWith("drawable")) {
                for (File image : dir.listFiles()) {
                    if (image.getName().endsWith(".png") || image.getName().endsWith(".jpg")) {
                        resourceNames.add(image.getName());
                    }
                }
            }
        }
        
        EditableResources res = new EditableResources();
        if (outputResourceFile.exists()) {
            try (FileInputStream fis = new FileInputStream(outputResourceFile)){
                res.openFile(fis);
            }
        }
        
        for (String resourceName : resourceNames) {
            
            importImage(inputResDirectory, resourceName, outputResourceFile, res);
            System.gc();
        }
        if (res != null) {
            try (FileOutputStream fos = new FileOutputStream(outputResourceFile)) {
                res.save(fos);
            }
        }
    }
}

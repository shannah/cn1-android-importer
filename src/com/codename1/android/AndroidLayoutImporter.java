/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.android;

import com.codename1.ui.Component;
import com.codename1.ui.Display;
import com.codename1.ui.EncodedImage;
import com.codename1.ui.Image;
import com.codename1.ui.plaf.Border;
import com.codename1.ui.plaf.Style;
import com.codename1.ui.util.EditableResources;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author shannah
 */
public class AndroidLayoutImporter {
    private static String NS_ANDROID = "http://schemas.android.com/apk/res/android";
    
    private final File outputFile, inputFile, outputResourceFile;
    private final Document inputDOM, outputDOM;
    private final File androidResourceDirectory;
    private final EditableResources outputResources;
    private boolean suppressUnsupportedElementExceptions=true;
    private final String themeName = "Theme";
    private boolean saveResourceFile = true;
    
    private String get(Element el, String att, String defaultValue) {
        if (el.getOwnerDocument() == inputDOM && !el.hasAttributeNS(NS_ANDROID, att)) {
            return defaultValue;
        } else if (el.getOwnerDocument() != inputDOM && !el.hasAttribute(att)) {
            return defaultValue;
        }
        
        String val = el.getOwnerDocument() == inputDOM ? el.getAttributeNS(NS_ANDROID, att) : el.getAttribute(att);
        if (val == null) {
            return defaultValue;
        }
        return val;
    }
    private String getNS(Element el, String att, String defaultValue) {
        if (!el.hasAttributeNS(NS_ANDROID, att)) {
            return defaultValue;
        }
        
        String val = el.getAttributeNS(NS_ANDROID, att);
        if (val == null) {
            return defaultValue;
        }
        return val;
    }
    
    private int get(Element el, String att, int defaultValue) {
        String val = el.getOwnerDocument() == inputDOM ? el.getAttributeNS(NS_ANDROID, att) :  el.getAttribute(att);
        if (val == null) {
            return defaultValue;
        }
        int out = defaultValue;
        try {
            out = Integer.parseInt(val);
        } catch (Exception ex){}
        return out;
    }
    
    private double get(Element el, String att, double defaultValue) {
        String val = el.getOwnerDocument() == inputDOM ? el.getAttributeNS(NS_ANDROID, att) : el.getAttribute(att);
        if (val == null) {
            return defaultValue;
        }
        double out = defaultValue;
        try {
            out = Double.parseDouble(val);
        } catch (Exception ex){}
        return out;
    }
    
    private void convertFrameLayout(Element inputSrcElement, Element out) {
        out.setAttribute("type", "Container");
        out.setAttribute("layout", "BorderLayout");
    }

    private void convertCoordinatorLayout(Element inputSrcElement, Element out) {
        out.setAttribute("type", "Form");
    }

    private void convertAppBarLayout(Element inputSrcElement, Element out) {
        out.setAttribute("type", "Container");
        out.setAttribute("layout", "BoxLayout");
        out.setAttribute("boxLayoutAxis", "X");
    }

    private void convertToolbar(Element inputSrcElement, Element out) {
        out.setAttribute("layout", "BoxLayout");
        out.setAttribute("boxLayoutAxis", "X");
    }

    private void convertFloatingActionButton(Element inputSrcElement, Element out) {
        convertButton(inputSrcElement, out);
        
    }

    
    /**
     * Tries to append a child somewhere in the outputEl document.  This allows for elements 
     * to be placed into the document in other parts of the tree.
     * @param srcParent The source parent.
     * @param dstParent The destination parent
     * @param srcChild The source child element
     * @param dstChild The destination child element (to be inserted into the dst dom somewhere)
     * @return True if insertion took place.  False otherwise.  If false, then dstChild will just be inserted into 
     *  the parent in the same structure as the source document.
     */
    private boolean appendChild(Element srcParent, Element dstParent, Element srcChild, Element dstChild) {
        
        return false;
    }

    private void convertInclude(Element inputSrcElement, Element out) throws IOException, ParserConfigurationException, SAXException, UnsupportedElementException {
        String layout = inputSrcElement.getAttribute("layout");
        if (layout.indexOf("@layout/") == 0) {
            String layoutPath = layout.substring(layout.indexOf("/")+1);
            File layoutFile = androidResourceDirectory == null ? new File(inputFile.getParentFile(), layoutPath+".xml") : new File(androidResourceDirectory, "layout/"+layoutPath+".xml");
            if (!layoutFile.exists()) {
                throw new IOException("Failed to load include "+inputSrcElement+" from "+layout);
            }
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document includedDOM = builder.parse(layoutFile);
            
            convertElement(includedDOM.getDocumentElement(), out);
            
        }
        
    }

    private static void applyBoxLayoutY(Element el) {
        el.setAttribute("layout", "BoxLayout");
        el.setAttribute("boxLayoutAxis", "Y");
    }
    
    private static void applyBoxLayoutX(Element el) {
        el.setAttribute("layout", "BoxLayout");
        el.setAttribute("boxLayoutAxis", "X");
    }
    
    
    
    private void convertCollapsingToolbarLayout(Element inputSrcElement, Element out) {
        applyBoxLayoutY(out);
    }

    private void convertNestedScrollView(Element inputSrcElement, Element out) {
        applyBoxLayoutY(out);
        out.setAttribute("scrollableY", "true");
    }

    private void convertListView(Element inputSrcElement, Element out) {
        out.removeAttribute("layout");
        out.setAttribute("type", "List");
        
    }

    private void convertProgressBar(Element inputSrcElement, Element out) {
        out.removeAttribute("layout");
        out.setAttribute("type", "Slider");
    }

    private String parseText(String text) {
        if (text.startsWith("@string/")) {
            return text.substring(text.indexOf("/")+1);
        }
        return text;
    }
    
    private void convertTextView(Element inputSrcElement, Element out) {
        out.removeAttribute("layout");
        if ("true".equals(inputSrcElement.getAttributeNS(NS_ANDROID, "editable"))) {
            if ("true".equals(inputSrcElement.getAttributeNS(NS_ANDROID, "singleLine"))) {
                out.setAttribute("type", "TextField");
            } else {
                out.setAttribute("type", "TextArea");
            }
        } else {
            if ("true".equals(inputSrcElement.getAttributeNS(NS_ANDROID, "singleLine"))) {
                out.setAttribute("type", "Label");
            } else {
                out.setAttribute("type", "SpanLabel");
            }
        }
        if (inputSrcElement.hasAttributeNS(NS_ANDROID, "text")) {
            out.setAttribute("text", parseText(inputSrcElement.getAttributeNS(NS_ANDROID, "text")));
            if (out.getAttribute("type").equals("SpanLabel") && out.getAttribute("text").length() < 30) {
                
                out.setAttribute("type", "Label");
            }
        }
        
    }

    private void setAllStyles(String uiid, String key, Object value) {
        outputResources.setThemeProperty(themeName, uiid+"."+key, value);
        outputResources.setThemeProperty(themeName, uiid+".sel#"+key, value);
        outputResources.setThemeProperty(themeName, uiid+".press#"+key, value);
        outputResources.setThemeProperty(themeName, uiid+".dis#"+key, value);
    }
    
    private class NumberWithUnit {
        final String value;
        final byte unit;
        NumberWithUnit(String value, byte unit) {
            this.value = value;
            this.unit = unit;
        }
    }
    
    private NumberWithUnit parseNumber(String coord) {
        if (coord.startsWith("@dimen/")) {
            String dimenName = coord.substring(coord.indexOf("/")+1);
            coord = getDimensionByName(dimenName);
            if (coord == null) {
                throw new RuntimeException("Could not find dimension named "+dimenName);
            }
            return parseNumber(coord);
        } else if (coord.startsWith("?android:")) {
            System.out.println("Encoutered coordinate "+coord+" that references an android theme.  Ignoring and setting to 0");
            return new NumberWithUnit("0", Style.UNIT_TYPE_PIXELS);
        } else if (coord.endsWith("dp") || coord.endsWith("dip")) {
            String numericPortion = coord.substring(0, coord.indexOf("d"));
            double dcoord = Double.parseDouble(numericPortion);
            double mmcoord = dcoord / 160.0 * 25.4;
            int iMmcoord = (int)Math.round(mmcoord);
            if (mmcoord > 0 && iMmcoord == 0) {
                iMmcoord = 1;
            }
            return new NumberWithUnit(String.valueOf(iMmcoord), Style.UNIT_TYPE_DIPS);
        } else if (coord.endsWith("pt")) {
            String numericPortion = coord.substring(0, coord.indexOf("p"));
            double dcoord = Double.parseDouble(numericPortion);
            double mmcoord = dcoord / 72.0 * 25.4;
            int iMmcoord = (int)Math.round(mmcoord);
            if (mmcoord > 0 && iMmcoord == 0) {
                iMmcoord = 1;
            }
            return new NumberWithUnit(String.valueOf(iMmcoord), Style.UNIT_TYPE_DIPS);
        } else if (coord.endsWith("px")) {
            String numericPortion = coord.substring(0, coord.indexOf("p"));
            return new NumberWithUnit(numericPortion, Style.UNIT_TYPE_PIXELS);
        } else if (coord.endsWith("in")) {
            String numericPortion = coord.substring(0, coord.indexOf("i"));
            double dcoord = Double.parseDouble(numericPortion);
            double mmcoord = dcoord * 25.4;
            int iMmcoord = (int)Math.round(mmcoord);
            if (mmcoord > 0 && iMmcoord == 0) {
                iMmcoord = 1;
            }
            return new NumberWithUnit(String.valueOf(iMmcoord), Style.UNIT_TYPE_DIPS);
        } else if (coord.endsWith("mm")) {
            String numericPortion = coord.substring(0, coord.indexOf("m"));
            return new NumberWithUnit(numericPortion, Style.UNIT_TYPE_DIPS);
        } else if (coord.endsWith("sp")) {
            String numericPortion = coord.substring(0, coord.indexOf("s"));
            double dcoord = Double.parseDouble(numericPortion);
            double mmcoord = dcoord / 160.0 * 25.4;
            int iMmcoord =(int)Math.round(mmcoord);
            if (mmcoord > 0 && iMmcoord == 0) {
                iMmcoord = 1;
            }
            return new NumberWithUnit(String.valueOf(iMmcoord), Style.UNIT_TYPE_DIPS);
        } else {
            try {
                Integer.parseInt(coord);
                return new NumberWithUnit(coord, Style.UNIT_TYPE_PIXELS);
            } catch (NumberFormatException ex) {
                throw new RuntimeException("Failed to parse number "+coord+".", ex);
            }
            
        }
    }
    
    private String getDimensionByName(String name) {
        File dimensionsXml = new File(new File(this.androidResourceDirectory, "values"), "dimensions.xml");
        if (dimensionsXml.exists()) {
            try {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                factory.setNamespaceAware(true);
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document includedDOM = builder.parse(dimensionsXml);
                Element root = includedDOM.getDocumentElement();
                NodeList dimens = root.getElementsByTagName("dimen");
                int len = dimens.getLength();
                for (int i=0; i<len; i++) {
                    Element el = (Element)dimens.item(i);
                    if (get(el, "name", null) != null && get(el, "name", "").equals(name)) {
                        return el.getTextContent().trim();
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(AndroidLayoutImporter.class.getName()).log(Level.SEVERE, null, ex);
                throw new RuntimeException("Failed to parse dimensions.xml file", ex);
            } 
        }
        return null;
    }
    
    public static byte[] toPng(BufferedImage b) {
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ImageIO.write(b, "png", bo);
            bo.close();
            return bo.toByteArray();
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    
    Border createImageBorder(String imageName) {
        Image im = outputResources.getImage(imageName);
        if (im == null) {
            return null;
        }
        EncodedImage eim = null;
        if (im instanceof EncodedImage) {
            eim = (EncodedImage)im;
        } else {
            eim = EncodedImage.createFromImage(im, imageName.endsWith(".jpg"));
        }
        
        BufferedImage center = new BufferedImage(1, im.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = (Graphics2D)center.createGraphics();
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.CLEAR));
        g2.fillRect(0, 0, im.getWidth(), im.getHeight());
        g2.dispose();
        
        EncodedImage placeholder = EncodedImage.create(toPng(center));
        
        outputResources.setImage("TransparentPlaceholer"+center.getWidth()+"x"+center.getHeight()+".png", placeholder);
        
        return Border.createHorizonalImageBorder(eim, placeholder, placeholder);
    }
    
    
    private int convertToPixels(String value) {
        NumberWithUnit u = parseNumber(value);
        switch (u.unit) {
            case Style.UNIT_TYPE_DIPS:
                return (int)Math.round(Double.parseDouble(u.value) / 25.4 * 160.0);
            case Style.UNIT_TYPE_PIXELS:
                return (int)Math.round(Double.parseDouble(u.value));
            case Style.UNIT_TYPE_SCREEN_PERCENTAGE:
                throw new RuntimeException("Convert to pixels from screen percentage not supported yet.");
        }
        throw new RuntimeException("Invalid unit type for value "+value);
    }
    
    private EncodedImage createBlankImage( String widthStr, String heightStr) {
        String name = "BlankImage";
        int width = convertToPixels(widthStr);
        if (width < 1) width = 1;
        int height = convertToPixels(heightStr);
        if (height < 1) {
            height = 1;
        }
        //System.out.println("Creating blank image "+width+"x"+height+" for "+widthStr+"x"+heightStr);
        String imgName = name + width + "x" + height + ".png";
        Image im = outputResources.getImage(imgName);
        if (im != null) {
            if (im instanceof EncodedImage) {
                return (EncodedImage)im;
            } else {
                return EncodedImage.createFromImage(im, false);
            }
        }
        BufferedImage center = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = (Graphics2D)center.createGraphics();
        //g2.setComposite(AlphaComposite.getInstance(AlphaComposite.CLEAR));
        g2.setColor(Color.red);
        g2.fillRect(0, 0, width, height);
        g2.dispose();
        
        EncodedImage placeholder = EncodedImage.create(toPng(center));
        
        EditableResources.MultiImage multiImage = new EditableResources.MultiImage();
        multiImage.setDpi(new int[]{Display.DENSITY_MEDIUM});
        multiImage.setInternalImages(new EncodedImage[]{placeholder});
        
        outputResources.setMultiImage(imgName, multiImage);
        return multiImage.getBest();
    }
    
    private static int styleIndex = 1;
    private void applyStyles(Element inputSrcElement, Element out) {
        String type = out.getAttribute("type");
        String id = "Android"+type + (styleIndex++);
        String selId = id+".sel";
        String unselId = id;
        String pressedId = id+".press";
        String disabledId = id+".dis";
        
        
        
        outputResources.setThemeProperty(themeName, unselId+".derive", type);
        outputResources.setThemeProperty(themeName, selId+"#derive", type+".sel");
        outputResources.setThemeProperty(themeName, pressedId+"#derive", type+".press");
        outputResources.setThemeProperty(themeName, disabledId+"#derive", type+".dis");
        out.setAttribute("uiid", id);
        
        // If there is a width/height specified, we will use 3 piece borders to 
        // force preserved space.
        if ((getNS(inputSrcElement, "width", null) != null ||
                getNS(inputSrcElement, "height", null) != null ||
                getNS(inputSrcElement, "minHeight", null) != null||
                getNS(inputSrcElement, "minWidth", null) != null) && 
                getNS(inputSrcElement, "background", null) == null) {
            // Removing this for now, because using border images just to ensure width is
            // crazy heavy and really shouldn't be necessary... will find a better way.
            /*
            String minWidth = getNS(inputSrcElement, "minWidth", getNS(inputSrcElement, "width", "5dp"));
            String minHeight = getNS(inputSrcElement, "minHeight", getNS(inputSrcElement, "height", "5dp"));
            System.out.println("Creating border with width "+minWidth+" and height "+minHeight+" for id "+id);
            Border border = Border.createHorizonalImageBorder(createBlankImage(minWidth, minHeight), createBlankImage("1dp", minHeight), createBlankImage("1dp", minHeight));
            
            setAllStyles(id, "border", border);
                    */
        }
        
        if (getNS(inputSrcElement, "paddingTop", null) != null || 
                getNS(inputSrcElement, "paddingBottom", null) != null || 
                getNS(inputSrcElement, "paddingLeft", null) != null ||
                getNS(inputSrcElement, "paddingRight", null) != null) {
            String padding = parseNumber(getNS(inputSrcElement, "paddingTop", "0")).value + "," +
                    parseNumber(getNS(inputSrcElement, "paddingBottom", "0")).value + "," +
                    parseNumber(getNS(inputSrcElement, "paddingLeft", "0")).value + "," +
                    parseNumber(getNS(inputSrcElement, "paddingRight", "0")).value;
            
            byte[] paddingUnits = new byte[]{parseNumber(get(inputSrcElement, "paddingTop", "0")).unit,
                    parseNumber(getNS(inputSrcElement, "paddingRight", "0")).unit,
                    parseNumber(getNS(inputSrcElement, "paddingBottom", "0")).unit,
                    parseNumber(getNS(inputSrcElement, "paddingLeft", "0")).unit};
            //System.out.println("Setting padding: "+padding);
            setAllStyles(id, "padding", padding);
            setAllStyles(id, "padUnit", paddingUnits);
        }
        
        if (getNS(inputSrcElement, "marginTop", null) != null || 
                getNS(inputSrcElement, "marginBottom", null) != null || 
                getNS(inputSrcElement, "marginLeft", null) != null ||
                getNS(inputSrcElement, "marginRight", null) != null) {
            String margin = parseNumber(get(inputSrcElement, "marginTop", "0")).value + "," +
                    parseNumber(getNS(inputSrcElement, "marginBottom", "0")).value + "," +
                    parseNumber(getNS(inputSrcElement, "marginLeft", "0")).value + "," +
                    parseNumber(getNS(inputSrcElement, "marginRight", "0")).value;
            
            byte[] marginUnits = new byte[]{parseNumber(get(inputSrcElement, "marginTop", "0")).unit,
                    parseNumber(getNS(inputSrcElement, "marginRight", "0")).unit,
                    parseNumber(getNS(inputSrcElement, "marginBottom", "0")).unit,
                    parseNumber(getNS(inputSrcElement, "marginLeft", "0")).unit};
            //System.out.println("Setting margin "+margin);
            setAllStyles(id, "margin", margin);
            setAllStyles(id, "marUnit", marginUnits);
        }
        
        
        if (get(inputSrcElement, "background", null) != null) {
            // We have a custom background
            String backgroundStr = getNS(inputSrcElement, "background", null);
            if (backgroundStr.startsWith("@drawable/")) {
                try {
                    backgroundStr = backgroundStr.substring(backgroundStr.indexOf("/")+1);
                    List<Element> items = getSelectorElementsForDrawable(backgroundStr);
                    
                    // 
                    
                    if (items != null) {
                        String defaultBackground = null;
                        String pressedBackground = null;
                        String disabledBackground = null;
                        String selectedBackground = null;
                        for (Element item : items) {
                            
                            if (item.hasAttributeNS(NS_ANDROID, "drawable")) {
                                String itemDrawableStr = item.getAttributeNS(NS_ANDROID, "drawable");
                                if (itemDrawableStr.startsWith("@drawable/")) {
                                    itemDrawableStr = itemDrawableStr.substring(itemDrawableStr.indexOf("/")+1);
                                }
                                File itemDrawable = findDrawableResource(itemDrawableStr);
                                if (itemDrawable == null || (!itemDrawable.getName().endsWith(".png") && !itemDrawable.getName().endsWith(".jpg"))) {
                                    // Let's not support nested xml drawables just yet...
                                    // we'll skip this
                                    continue;
                                }
                                if (!outputResources.containsResource(itemDrawable.getName())) {
                                    // If the resource file hasn't imported the image yet, we won't set it here
                                    continue;
                                }
                                
                                
                                
                                if (item.hasAttributeNS(NS_ANDROID, "state_pressed") && "true".equals(item.getAttributeNS(NS_ANDROID, "state_pressed"))) {
                                    pressedBackground = itemDrawable.getName();
                                    //outputResources.setThemeProperty(themeName, pressedId+"#border", createImageBorder(itemDrawable.getName()));
                                } else if (item.hasAttributeNS(NS_ANDROID, "state_enabled") && "false".equals(item.getAttributeNS(NS_ANDROID, "state_enabled"))) {
                                    //outputResources.setThemeProperty(themeName, disabledId+"#border", createImageBorder(itemDrawable.getName()));
                                    disabledBackground = itemDrawable.getName();
                                } else if (item.hasAttributeNS(NS_ANDROID, "state_focused") && "true".equals(item.getAttributeNS(NS_ANDROID, "state_focused"))){
                                    selectedBackground = itemDrawable.getName();
                                } else {
                                    defaultBackground = itemDrawable.getName();
                                    //outputResources.setThemeProperty(themeName, id+".border", createImageBorder(itemDrawable.getName()));
                                }
                            }
                        }
                        
                        if (defaultBackground != null) {
                            if (pressedBackground == null) pressedBackground = defaultBackground;
                            if (selectedBackground == null) selectedBackground = defaultBackground;
                            if (disabledBackground == null) disabledBackground = defaultBackground;
                        }
                        
                        if (defaultBackground != null) {
                            outputResources.setThemeProperty(themeName, id+".border", createImageBorder(defaultBackground));
                        }
                        if (pressedBackground != null) {
                            outputResources.setThemeProperty(themeName, pressedId+"#border", createImageBorder(pressedBackground));
                        }
                        if (selectedBackground != null) {
                            outputResources.setThemeProperty(themeName, selId+"#border", createImageBorder(pressedBackground));
                        }
                        if (disabledBackground != null) {
                            outputResources.setThemeProperty(themeName, disabledId+"#border", createImageBorder(disabledBackground));
                        }
                    }
                } catch (SAXException ex) {
                    Logger.getLogger(AndroidLayoutImporter.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(AndroidLayoutImporter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
            
        }
        
        if (false && (get(inputSrcElement, "drawable", null) != null ||
                get(inputSrcElement, "drawableTop", null) != null ||
                get(inputSrcElement, "drawableRight", null) != null ||
                get(inputSrcElement, "drawableBottom", null) != null ||
                get(inputSrcElement, "drawableLeft", null) != null)) {
            String iconDrawableStr = null;
            int iconPosition = -1;
            if (inputSrcElement.hasAttributeNS(NS_ANDROID, "drawableLeft")) {
                iconDrawableStr = get(inputSrcElement, "drawableLeft", null);
                iconPosition = Component.LEFT;
            } else if (get(inputSrcElement, "drawableRight", null) != null) {
                iconDrawableStr = get(inputSrcElement, "drawableRight", null);
                iconPosition = Component.RIGHT;
            } else if (get(inputSrcElement, "drawableTop", null) != null) {
                iconDrawableStr = get(inputSrcElement, "drawableTop", null); 
                iconPosition = Component.TOP;
            } else if (get(inputSrcElement, "drawableBottom", null) != null) {    
                iconDrawableStr = get(inputSrcElement, "drawableBottom", null);
                iconPosition = Component.BOTTOM;
            }

            if (iconPosition >=0) {
                switch (iconPosition) {
                    case Component.TOP:
                        out.setAttribute("textPosition", String.valueOf(Component.BOTTOM));
                        break;
                    case Component.BOTTOM:
                        out.setAttribute("textPosition", String.valueOf(Component.TOP));
                        break;
                    case Component.LEFT:
                        out.setAttribute("textPosition", String.valueOf(Component.RIGHT));
                        break;
                    case Component.RIGHT:
                        out.setAttribute("textPosition", String.valueOf(Component.LEFT));
                        break;
                }
                String backgroundStr = iconDrawableStr;
                if (backgroundStr.startsWith("@drawable/")) {
                    try {
                        backgroundStr = backgroundStr.substring(backgroundStr.indexOf("/")+1);
                        List<Element> items = getSelectorElementsForDrawable(backgroundStr);
                        if (items != null) {
                            for (Element item : items) {

                                if (item.hasAttributeNS(NS_ANDROID, "drawable")) {
                                    String itemDrawableStr = item.getAttributeNS(NS_ANDROID, "drawable");
                                    if (itemDrawableStr.startsWith("@drawable/")) {
                                        itemDrawableStr = itemDrawableStr.substring(itemDrawableStr.indexOf("/")+1);
                                    }
                                    File itemDrawable = findDrawableResource(itemDrawableStr);
                                    if (itemDrawable == null || (!itemDrawable.getName().endsWith(".png") && !itemDrawable.getName().endsWith(".jpg"))) {
                                        // Let's not support nested xml drawables just yet...
                                        // we'll skip this
                                        continue;
                                    }
                                    if (!outputResources.containsResource(itemDrawable.getName())) {
                                        // If the resource file hasn't imported the image yet, we won't set it here
                                        continue;
                                    }
                                    if (item.hasAttributeNS(NS_ANDROID, "state_pressed") && "true".equals(item.getAttributeNS(NS_ANDROID, "state_pressed"))) {
                                        out.setAttribute("pressedIcon", itemDrawableStr);
                                    } else if (item.hasAttributeNS(NS_ANDROID, "state_enabled") && "false".equals(item.getAttributeNS(NS_ANDROID, "state_enabled"))) {

                                        out.setAttribute("disabledIcon", itemDrawableStr);
                                    } else {
                                        out.setAttribute("icon", itemDrawableStr);
                                    }
                                }
                            }    
                        }
                    } catch (SAXException ex) {
                        Logger.getLogger(AndroidLayoutImporter.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(AndroidLayoutImporter.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        
        // Try to find an existing style that we can merge
        Hashtable<String, Object> theme = outputResources.getTheme(themeName);
        
        String matchingId = findMatchingId(id, theme);
        if (matchingId != null) {
            //System.out.println("Found UIID with identical styles to "+id+".  Removing "+id+" and just using "+matchingId);
            // There is already a UIID that is identical to this one, so let's just
            // use that.
            out.setAttribute("uiid", matchingId);
            
            Set<String> keysToRemove = new HashSet<String>();
            String prefix = id+".";
            for (String key : theme.keySet()) {
                if (key.startsWith(prefix)) {
                    keysToRemove.add(key);
                }
            }
            for (String key : keysToRemove) {
                theme.remove(key);
            }
            outputResources.setTheme(themeName, theme);
        }
    }
    
    private String findMatchingId(String id, Map<String,Object> theme) {
        Set<String> keys = new HashSet<String>();
        String prefix = id+".";
        for (String key : theme.keySet()) {
            if (key.startsWith(prefix)) {
                keys.add(key);
            }
        }
        
        Set<String> possibilities = new HashSet<String>();
        
        // Start with full set of possible matches
        for (String key : theme.keySet()) {
            String cid = key;
            if (cid.contains(".")) {
                cid = cid.substring(0, cid.indexOf("."));
            } 
            possibilities.add(cid);
        }
        
        possibilities.remove(id);
        
        for (String key : keys) {
            if (possibilities.isEmpty()) {
                break;
            }
            String suffix = "";
            if (key.contains(".")) {
                suffix = key.substring(key.indexOf(".")+1);
            }
            
            Object keyVal = theme.get(key);
            
            for (String testKey : theme.keySet()) {
                if (possibilities.isEmpty()) {
                    break;
                }
                if (testKey.startsWith(prefix)) {
                    continue;
                }
                String cid = testKey;
                if (cid.contains(".")) {
                    cid = cid.substring(0, cid.indexOf("."));
                }
                
                if (!possibilities.contains(cid)) {
                    continue;
                }
                
                String cSuffix = "";
                if (testKey.contains(".")) {
                    cSuffix = testKey.substring(testKey.indexOf(".")+1);
                }
                
                //if (!cSuffix.equals(suffix)) {
                //    continue;
                //}
                
                if (!theme.containsKey(prefix+cSuffix)) {
                    // Our ID has no corresponding value
                    // we know that this id is not a posibility
                    //System.out.println("Removing "+cid+" because "+prefix+cSuffix+" not found");
                    possibilities.remove(cid);
                    continue;
                }
                
                if (!theme.containsKey(cid+"."+suffix)) {
                    // this ID doesn't actually contain a matching key
                    possibilities.remove(cid);
                    continue;
                }
                //if (cSuffix.equals(suffix)) {
                //    System.out.println("Checking "+cSuffix+" against "+suffix);
                //
                //} else {
                //    System.out.println("Checking "+cSuffix+" against "+suffix);
                //}
                // At this point the suffix == cSuffix
                if (cSuffix.equals(suffix) && !themeValueEquals(keyVal, theme.get(testKey)) ) {
                    possibilities.remove(cid);
                    continue;
                }
                
                
            }
        
        }
        
        if (!possibilities.isEmpty()) {
            return possibilities.iterator().next();
        }
        return null;
    }
        
       
    
    private boolean themeValueEquals(Object a, Object b) {
        if (a == null && b == null) {
            return true;
        } else if (a == null || b == null) {
            return false;
        }
        if (a instanceof byte[] && b instanceof byte[]) {
            return Arrays.equals((byte[])a, (byte[])b);
        } else {
            return a.equals(b);
        }
    }
    
    
    private void convertButton(Element inputSrcElement, Element out) {
        out.removeAttribute("layout");
        out.setAttribute("type", "Button");
        //System.out.println("Converting button "+inputSrcElement);
        int attlen = inputSrcElement.getAttributes().getLength();
        for (int i=0; i<attlen; i++) {
            Node n = inputSrcElement.getAttributes().item(i);
            //System.out.println("Namespace is "+n.getNamespaceURI());
            //System.out.println("Node "+i+"="+n);
        }
        
        
        //System.out.println("Text is "+inputSrcElement.getAttributeNS(NS_ANDROID, "text"));
        if (inputSrcElement.hasAttributeNS(NS_ANDROID, "text")) {
            out.setAttribute("text", parseText(inputSrcElement.getAttributeNS(NS_ANDROID, "text")));
        }
        
        
        
        
    }

    private List<Element> getSelectorElementsForDrawable(String resourceName) throws SAXException, IOException {
        File drawable = findDrawableResource(resourceName);
        if (drawable != null && drawable.getName().endsWith(".xml")) {
            try {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                factory.setNamespaceAware(true);
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document includedDOM = builder.parse(drawable);
                Element root = includedDOM.getDocumentElement();
                if (root.getTagName().equals("selector")) {
                    NodeList items = root.getElementsByTagName("item");
                    int len = items.getLength();
                    List<Element> out = new ArrayList<Element>();
                    for (int i=0; i<len; i++) {
                        out.add((Element)items.item(i));
                        
                        
                    }
                    return out;
                }
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(AndroidLayoutImporter.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (drawable != null && (drawable.getName().endsWith(".png") || drawable.getName().endsWith(".jpg"))) {
            try {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                factory.setNamespaceAware(true);
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document includedDOM = builder.newDocument();
                
                Element root = includedDOM.createElement("selector");
                Element item = includedDOM.createElement("item");
                item.setAttributeNS(NS_ANDROID, "drawable", resourceName);
                root.appendChild(item);
                includedDOM.appendChild(root);
                List<Element> out = new ArrayList<Element>();
                out.add(item);
                return out;
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(AndroidLayoutImporter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    private void convertScrollView(Element inputSrcElement, Element out) {
        applyBoxLayoutY(out);
        out.setAttribute("scrollableY", "true");
    }

    private void convertEditText(Element inputSrcElement, Element out) {
        convertTextView(inputSrcElement, out);
    }

    private void convertCheckBox(Element inputSrcElement, Element out) {
        convertButton(inputSrcElement, out);
        out.setAttribute("type", "CheckBox");
    }
    
    private void convertOther(Element inputSrcElement, Element out) {
        System.err.println("Unsupported element "+inputSrcElement);
    }

    private void convertView(Element inputSrcElement, Element out) {
        out.setAttribute("type", "Container");
    }

    private void convertMerge(Element inputSrcElement, Element out) {
        
    }

    private void convertRadioGroup(Element inputSrcElement, Element out) {
        convertLinearLayout(inputSrcElement, out);
    }

    private void convertSpinner(Element inputSrcElement, Element out) {
        out.setAttribute("type", "GenericSpinner");
        out.removeAttribute("layout");
    }

    private void convertRelativeLayout(Element inputSrcElement, Element out) {
        out.setAttribute("layout", "BoxLayout");
        out.setAttribute("boxLayoutAxis", "Y");
        out.setAttribute("type", "Container");
    }

    private void convertImageButton(Element inputSrcElement, Element out) {
        convertButton(inputSrcElement, out);
    }

    private void convertImageView(Element inputSrcElement, Element out) {
        out.removeAttribute("layout");
        out.setAttribute("type", "Label");
    }

    private void convertSeekBar(Element inputSrcElement, Element out) {
        out.removeAttribute("layout");
        out.setAttribute("type", "Slider");
    }

    private void convertQuickContactBadge(Element inputSrcElement, Element out) {
        convertImageView(inputSrcElement, out);
    }

    private void convertViewAnimator(Element inputSrcElement, Element out) {
        convertFrameLayout(inputSrcElement, out);
    }

    private void convertViewStub(Element inputSrcElement, Element out) {
        
    }

    private void convertSpace(Element inputSrcElement, Element out) {
        
    }

    private void convertRadioButton(Element inputSrcElement, Element out) {
        convertButton(inputSrcElement, out);
        out.setAttribute("type", "RadioButton");
    }
    
    public static class UnsupportedElementException extends Exception {
        private Element element;
        public UnsupportedElementException(Element e) {
            super("Unsupported element: "+e.getTagName());
            this.element = e;
        }
        
        public Element getElement() {
            return element;
        }
    }
    
    private AndroidLayoutImporter(File inputFile, File outputFile, File outputResourceFile, EditableResources eres) throws SAXException, IOException, ParserConfigurationException {
        
        this.inputFile = inputFile;
        this.outputFile = outputFile;
        this.outputResourceFile = outputResourceFile;
        if (eres != null) {
            this.outputResources = eres;
        } else {
            this.outputResources = new EditableResources();
            if (outputResourceFile.exists()) {
                this.outputResources.openFile(new FileInputStream(outputResourceFile));
            }
        }
        //this.outputResources.setTheme(themeName, new Hashtable());
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        

        inputDOM = builder.parse(inputFile);
        outputDOM = builder.newDocument();
        
        File res = inputFile.getParentFile();
        while (res != null && !"res".equals(res.getName())) {
            res = res.getParentFile();
        }
        androidResourceDirectory = res;
        
    }
    
    
    
    public void execute() throws TransformerConfigurationException, FileNotFoundException, TransformerException, UnsupportedElementException, IOException {
        Element inRoot = inputDOM.getDocumentElement();
        Element dstRoot = convertElement(inputDOM, outputDOM, inRoot);
        if (!dstRoot.hasAttribute("layout")) {
            // We may need to wrap our root
            Element newRoot = outputDOM.createElement("component");
            newRoot.setAttribute("type", "Container");
            applyBoxLayoutY(newRoot);
            
            newRoot.appendChild(dstRoot);
            dstRoot = newRoot;
        }
        dstRoot.setAttribute("name", outputFile.getName().replaceFirst("\\.gui$", ""));
        outputDOM.appendChild(dstRoot);
        
        
        // Use a Transformer for output
        TransformerFactory tFactory =
        TransformerFactory.newInstance();
        Transformer transformer = tFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

        DOMSource source = new DOMSource(outputDOM);
        StreamResult result = new StreamResult(new FileOutputStream(outputFile));
        transformer.transform(source, result);
        
        if (saveResourceFile) {
            try (FileOutputStream fos = new FileOutputStream(outputResourceFile)) {
                outputResources.save(fos);
            }
        }
        
        
    }
    
    
    protected void convertElement(Element inputSrcElement, Element out) throws UnsupportedElementException {
        String id = inputSrcElement.getAttributeNS(NS_ANDROID, "id");
        if (id != null) {
            id = id.substring(id.indexOf("/")+1);
            out.setAttribute("name", id.replaceAll("[^a-zA-Z0-9]", ""));
        }
        
        //out.setAttribute("uiid", "android."+inputSrcElement.getTagName());
        out.setAttribute("type", "Container");
        out.setAttribute("layout", "FlowLayout");
        
        Node inputParentNode = inputSrcElement.getParentNode();
        if (inputParentNode != null && inputParentNode instanceof Element) {
            Element inputParent = (Element)inputParentNode;
            if ("FrameLayout".equals(inputParent.getTagName())) {
                out.setAttribute("layout", "BorderLayout");
                String gravity = inputSrcElement.getAttributeNS(NS_ANDROID, "layout_gravity");
                String layoutConstraint = "CENTER";
                switch (gravity) {
                    case "top":
                        layoutConstraint = "NORTH";
                        break;
                    case "left":
                        layoutConstraint = "WEST";
                        break;
                    case "right":
                        layoutConstraint = "EAST";
                        break;
                    case "bottom":
                        layoutConstraint = "SOUTH";
                        break;
                    case "fill_vertical":
                    case "center_vertical":
                    case "center_horizontal":
                    case "fill_horizontal":
                    case "center":
                    case "fill":
                        
                        layoutConstraint = "CENTER";
                        break;
                    default:
                        layoutConstraint = "CENTER";
                }
                Element layoutConstraintEl = out.getOwnerDocument().createElement("layoutConstraint");
                layoutConstraintEl.setAttribute("value", layoutConstraint);
                out.appendChild(layoutConstraintEl);
            }
        }
        
        switch (inputSrcElement.getTagName()) {
            case "LinearLayout":
                convertLinearLayout(inputSrcElement, out);
                break;
            
            case "android.support.v7.widget.RecyclerView":
                convertRecyclerView(inputSrcElement, out);
                break;
                
            case "FrameLayout":
                convertFrameLayout(inputSrcElement, out);
                break;
                
            case "android.support.design.widget.CoordinatorLayout":
                convertCoordinatorLayout(inputSrcElement, out);
                break;
                
                
            case "android.support.design.widget.CollapsingToolbarLayout":
                convertCollapsingToolbarLayout(inputSrcElement, out);
                break;
                
            case "android.support.design.widget.AppBarLayout":
                convertAppBarLayout(inputSrcElement, out);
                break;
                
            case "android.support.v7.widget.Toolbar":
                convertToolbar(inputSrcElement, out);
                break;
                
            case "android.support.design.widget.FloatingActionButton":
                convertFloatingActionButton(inputSrcElement, out);
                break;
                
            case "include": {
                    try {
                        convertInclude(inputSrcElement, out);
                    } catch (IOException ex) {
                        Logger.getLogger(AndroidLayoutImporter.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ParserConfigurationException ex) {
                        Logger.getLogger(AndroidLayoutImporter.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SAXException ex) {
                        Logger.getLogger(AndroidLayoutImporter.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
                
            case "android.support.v4.widget.NestedScrollView":
                convertNestedScrollView(inputSrcElement, out);
                break;
                
            case "ListView":
                convertListView(inputSrcElement, out);
                break;
                
            case "ProgressBar":
                convertProgressBar(inputSrcElement, out);
                break;
                
                
            case "TextView":
                convertTextView(inputSrcElement, out);
                break;
                
            case "Button":
                convertButton(inputSrcElement, out);
                break;
                
            case "ScrollView":
                convertScrollView(inputSrcElement, out);
                break;
                
            case "EditText":
                convertEditText(inputSrcElement, out);
                break;
                
                
            case "CheckBox":
                convertCheckBox(inputSrcElement, out);
                break;
                
            case "View":
                convertView(inputSrcElement, out);
                break;
                
            case "merge":
                convertMerge(inputSrcElement, out);
                break;
                
            case "RadioGroup":
                convertRadioGroup(inputSrcElement, out);
                break;
              
            case "RadioButton":
                convertRadioButton(inputSrcElement, out);
                break;
                
            case "Spinner":
                convertSpinner(inputSrcElement, out);
                break;
              
            case "RelativeLayout":
                convertRelativeLayout(inputSrcElement, out);
                break;
                
            case "ImageButton":
                convertImageButton(inputSrcElement, out);
                break;
                
            case "ImageView":
                convertImageView(inputSrcElement, out);
                break;
                
            case "SeekBar":
                convertSeekBar(inputSrcElement, out);
                break;
                
            case "QuickContactBadge":
                convertQuickContactBadge(inputSrcElement, out);
                break;
                
                
            case "ViewAnimator":
                convertViewAnimator(inputSrcElement, out);
                break;
                
            case "ViewStub":
                convertViewStub(inputSrcElement, out);
                break;
                 
            case "Space":
                convertSpace(inputSrcElement, out);
                break;
                
            default:
                if (suppressUnsupportedElementExceptions) {
                    this.convertOther(inputSrcElement, out);
                } else {
                    throw new UnsupportedElementException(inputSrcElement);
                }
                
        }
        
        convertChildren(inputSrcElement, out);
        
        if (out.hasAttribute("layout") && "BorderLayout".equals(out.getAttribute("layout"))) {
            // Make sure that border layout children have appropriate constraint
            Set<String> allowable = new HashSet<String>(Arrays.asList(new String[]{"NORTH", "SOUTH", "EAST", "WEST", "CENTER"}));
            Map<String,Element> childMap = new HashMap<String,Element>();
            List<ElementConstraint> childList = getBorderLayoutChildren(out);
            Set<ElementConstraint> used = new HashSet<ElementConstraint>();
            for (ElementConstraint ec : childList) {
                if (ec.constraint != null && allowable.contains(ec.constraint) && !childMap.containsKey(ec.constraint)) {
                    childMap.put(ec.constraint, ec.el);
                    used.add(ec);
                }
            }
            
            childList.removeAll(used);
            
            
            if (!childList.isEmpty()) {
                // We weren't able to place all of the elements in the border layout
                // this is either because we filled all of the slots, or there were two
                // in some slots
                
                // Let's simplify things for now by just adding all of the extras in a 
                // BoxLayout.Y inside the CENTER
                Element center = out.getOwnerDocument().createElement("component");
                center.setAttribute("type", "Container");
                applyBoxLayoutX(center);
                Element centerConstraint = out.getOwnerDocument().createElement("layoutConstraint");
                centerConstraint.setAttribute("value", "CENTER");
                center.appendChild(centerConstraint);
                if (childMap.containsKey("CENTER")) {
                    //System.out.println("Removing center from "+childMap);
                    out.removeChild(childMap.get("CENTER"));
                    center.appendChild(childMap.get("CENTER"));
                }

                for (ElementConstraint ec : childList) {
                    removeLayoutConstraint(ec.el);
                    
                    out.removeChild(ec.el);
                    center.appendChild(ec.el);
                }
                out.appendChild(center);
                    
                
            }
        } else if (out.hasAttribute("layout")) {
            // Not a boxlayout.
            NodeList children = out.getChildNodes();
            int len = children.getLength();
            for (int i=0; i<len; i++) {
                Node n = children.item(i);
                if (n instanceof Element) {
                    removeLayoutConstraint((Element)n);
                }
            }
        }
        
        applyStyles(inputSrcElement, out);
    }
    
    private void removeLayoutConstraint(Element el) {
        NodeList children = el.getChildNodes();
        int len = children.getLength();
        int index = -1;
        for (int i=0; i<len; i++) {
            Node n = children.item(i);
            if ((n instanceof Element) && ((Element)n).getTagName().equals("layoutConstraint")) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            el.removeChild(children.item(index));
        }
    }
    
    private class ElementConstraint {
        final String constraint;
        final Element el;
        ElementConstraint(String constraint, Element el) {
            this.constraint = constraint;
            this.el = el;
        }
    }
    
    private List<ElementConstraint> getBorderLayoutChildren(Element root) {
        List<ElementConstraint> out = new ArrayList<ElementConstraint>();
        NodeList children = root.getChildNodes();
        int len = children.getLength();
        for (int i=0; i<len; i++) {
            Node n = children.item(i);
            if (!(n instanceof Element)) {
                continue;
            }
            Element e = (Element)n;
            Element constraint = null;
            NodeList eChildren = e.getChildNodes();
            int elen = eChildren.getLength();
            for (int j=0; j<elen; j++) {
                Node en = eChildren.item(j);
                if (!(en instanceof Element)) {
                    continue;
                }
                Element ee = (Element)en;
                if (e.getTagName().equals("layoutConstraint")) {
                    constraint = e;
                    break;
                }
            }
            
            ElementConstraint eConstraint = new ElementConstraint(constraint==null?null:constraint.getAttribute("value"), e);
            out.add(eConstraint);
        }
        return out;
    }
    
    protected Element convertElement(Document srcDoc, Document dstDoc, Element inputSrcElement) throws UnsupportedElementException {
        Element out = dstDoc.createElement("component");
        convertElement(inputSrcElement, out);
        return out;
        
    }
    
    
    
    protected Node convertNode(Element srcParent, Element dstParent) {
        return null;
    }
    
    protected void convertChildren(Element inputEl, Element outputEl) throws UnsupportedElementException {
        NodeList childNodes = inputEl.getChildNodes();
        int len = childNodes.getLength();
        for (int i=0; i<len; i++) {
            Node child = childNodes.item(i);
            if (child instanceof Element) {
                Element converted = convertElement(inputEl.getOwnerDocument(), outputEl.getOwnerDocument(), (Element)child);
                if (converted != null) {
                    if (!appendChild(inputEl, outputEl, (Element)child, converted)) {
                        outputEl.appendChild(converted);
                    }
                }
            } else {
                Node n = convertNode(inputEl, outputEl);
                if (n != null) {
                    outputEl.appendChild(n);
                }
            }
        }
    }
    
    
    
    
    private void convertLinearLayout(Element inputEl, Element outputEl) {
        outputEl.setAttribute("type", "Container");
        String orientation = inputEl.getAttributeNS(NS_ANDROID, "orientation");
        outputEl.setAttribute("layout", "BoxLayout");
        if (orientation.equals("vertical")) {
            outputEl.setAttribute("boxLayoutAxis", "Y");
        } else {
            outputEl.setAttribute("boxLayoutAxis", "X");
        }

    }
    
    private void convertRecyclerView(Element inputEl, Element outputEl) {
        
    }
    
    
    
    
    public static void importLayout(File src, File dst, File outputResources, EditableResources res) throws SAXException, IOException, ParserConfigurationException, FileNotFoundException, TransformerException, TransformerConfigurationException, UnsupportedElementException {
        AndroidLayoutImporter importer = new AndroidLayoutImporter(src, dst, outputResources, res);
        System.out.println("Importing layout "+src.getAbsolutePath());
        System.out.println("Destination: "+dst.getAbsolutePath());
        System.out.println("Resource file: "+outputResources.getAbsolutePath());
        importer.saveResourceFile = res == null;
        importer.execute();
    }
    
    public static void importProjectLayouts(File inputResDir, File outputProjectDir, File outputResourceFile, String outputJavaPackage) throws SAXException, IOException, ParserConfigurationException, FileNotFoundException, TransformerException, TransformerConfigurationException, UnsupportedElementException {
        
        
        File outputProjectSrcDir = new File(outputProjectDir, "src");
        if (outputResourceFile == null) {
            
            outputResourceFile = new File(outputProjectSrcDir, "theme.res");
        }
        File outputProjectResDir = new File(outputProjectDir, "res");
        File outputProjectGuibuilderDir = new File(outputProjectResDir, "guibuilder");
        
        File layoutDir = new File(inputResDir, "layout");
        
        String packagePath = outputJavaPackage.replace('.', File.separator.charAt(0));
        
        File xmlPackageDir = new File(outputProjectGuibuilderDir, packagePath);
        xmlPackageDir.mkdirs();
        
        File srcPackageDir = new File(outputProjectSrcDir, packagePath);
        
        
        EditableResources res = new EditableResources();
        if (outputResourceFile.exists()) {
            try (FileInputStream fis = new FileInputStream(outputResourceFile)){
                res.openFile(fis);
            }
        }
        
        for (File input : layoutDir.listFiles()) {
            
            String baseName = ucFirst(toCamelCase(input.getName().replaceFirst("\\.xml$", "")));
            String guiName = baseName+".gui";
            String javaName = baseName+".java";
           
            
            
            File dest = new File(xmlPackageDir, guiName);
            
            File javaDest = new File(srcPackageDir, javaName);
            if (!javaDest.getParentFile().exists()) {
                javaDest.getParentFile().mkdirs();
            }
            
            importLayout(input, dest, outputResourceFile, res);
        }
        try (FileOutputStream fos = new FileOutputStream(outputResourceFile)) {
            res.save(fos);
        }
        
        res.saveXML(outputResourceFile);
        
    }
    
    private static String ucFirst(String str) {
        if (str.length() > 0) {
            return str.substring(0,1).toUpperCase() + str.substring(1);
        }
        return str;
    }
    
    private static String toCamelCase(String str) {
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
    
    private File findDrawableResource(String name) {
        String[] exts = new String[]{".xml", ".png", ".jpg"};
        for (File dir : androidResourceDirectory.listFiles()) {
            if (dir.getName().startsWith("drawable")) {
                for (File drawable : dir.listFiles()) {
                    for (String ext : exts) {
                        if ((name+ext).equals(drawable.getName())) {
                            return drawable;
                        } 
                    }
                }
            }
        }
        return null;
    }
}

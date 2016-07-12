package com.codename1.k9tests;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class RecipientAlternateItem extends Container  {
    public RecipientAlternateItem(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_alternatecontainerheader = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Label gui_alternatecontactphoto = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Label gui_alternateheadername = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_alternateheaderlabel = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_alternateremove = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_alternatecontaineritem = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Label gui_alternateaddresslabel = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_alternateaddress = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui__1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.ui.Container gui_null = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Label gui__2 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_alternatecryptostatus = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setName("RecipientAlternateItem");
        addComponent(gui_alternatecontainerheader);
        gui_alternatecontainerheader.setName("alternatecontainerheader");
        gui_alternatecontainerheader.addComponent(gui_alternatecontactphoto);
        gui_alternatecontainerheader.addComponent(gui_);
        gui_.setName("");
        gui_.addComponent(gui_alternateheadername);
        gui_.addComponent(gui_alternateheaderlabel);
        gui_alternateheadername.setText("");
        gui_alternateheadername.setName("alternateheadername");
        gui_alternateheaderlabel.setText("");
        gui_alternateheaderlabel.setName("alternateheaderlabel");
        gui_alternatecontainerheader.addComponent(gui_alternateremove);
        gui_alternatecontactphoto.setName("alternatecontactphoto");
        gui_.setName("");
        gui_alternateremove.setName("alternateremove");
        addComponent(gui_alternatecontaineritem);
        gui_alternatecontaineritem.setName("alternatecontaineritem");
        gui_alternatecontaineritem.addComponent(gui_alternateaddresslabel);
        gui_alternatecontaineritem.addComponent(gui_alternateaddress);
        gui_alternatecontaineritem.addComponent(gui__1);
        gui__1.setName("_1");
        gui__1.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_null);
        gui_null.addComponent(gui__2);
        gui_null.addComponent(gui_alternatecryptostatus);
        gui__2.setName("_2");
        gui_alternatecryptostatus.setName("alternatecryptostatus");
        gui_alternateaddresslabel.setText("");
        gui_alternateaddresslabel.setName("alternateaddresslabel");
        gui_alternateaddress.setText("");
        gui_alternateaddress.setName("alternateaddress");
        gui__1.setName("_1");
        gui_alternatecontainerheader.setName("alternatecontainerheader");
        gui_alternatecontaineritem.setName("alternatecontaineritem");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

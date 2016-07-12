package com.codename1.k9tests;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class RecipientDropdownItem extends Container  {
    public RecipientDropdownItem(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Label gui_contactphoto = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Label gui_text1 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_text2 = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui__1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.ui.Container gui_null = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Label gui__2 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_contactcryptostatus = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
        setName("RecipientDropdownItem");
        addComponent(gui_contactphoto);
        addComponent(gui_);
        gui_.setName("");
        gui_.addComponent(gui_text1);
        gui_.addComponent(gui_text2);
        gui_text1.setText("");
        gui_text1.setName("text1");
        gui_text2.setText("");
        gui_text2.setName("text2");
        addComponent(gui__1);
        gui__1.setName("_1");
        gui__1.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_null);
        gui_null.addComponent(gui__2);
        gui_null.addComponent(gui_contactcryptostatus);
        gui__2.setName("_2");
        gui_contactcryptostatus.setName("contactcryptostatus");
        gui_contactphoto.setName("contactphoto");
        gui_.setName("");
        gui__1.setName("_1");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

package com.codename1.k9tests;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class AccountSetupAccountType extends Container  {
    public AccountSetupAccountType(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.components.SpanLabel gui_ = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Button gui_imap = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_pop = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_webdav = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setName("AccountSetupAccountType");
        addComponent(gui_);
        addComponent(gui_imap);
        addComponent(gui_pop);
        addComponent(gui_webdav);
        gui_.setText("account_setup_account_type_instructions");
        gui_.setName("");
        gui_imap.setText("account_setup_account_type_imap_action");
        gui_imap.setName("imap");
        gui_pop.setText("account_setup_account_type_pop_action");
        gui_pop.setName("pop");
        gui_webdav.setText("account_setup_account_type_webdav_action");
        gui_webdav.setName("webdav");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

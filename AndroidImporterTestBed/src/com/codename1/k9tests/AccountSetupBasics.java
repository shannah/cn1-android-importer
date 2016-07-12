package com.codename1.k9tests;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class AccountSetupBasics extends Container  {
    public AccountSetupBasics(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Container gui__1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Label gui_accountemail = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_accountpassword = new com.codename1.ui.Label();
    private com.codename1.ui.CheckBox gui_showpassword = new com.codename1.ui.CheckBox();
    private com.codename1.ui.Container gui_accountclientcertificatespinner = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui_foldableadvancedoptions = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.CheckBox gui_accountclientcertificate = new com.codename1.ui.CheckBox();
    private com.codename1.ui.Container gui__2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui__3 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui_divider = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui__4 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Button gui_manualsetup = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_next = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setName("AccountSetupBasics");
        addComponent(gui_);
        gui_.setScrollableY(true);
        gui_.setName("");
        gui_.addComponent(gui__1);
        gui__1.setName("_1");
        gui__1.addComponent(gui_accountemail);
        gui__1.addComponent(gui_accountpassword);
        gui__1.addComponent(gui_showpassword);
        gui__1.addComponent(gui_accountclientcertificatespinner);
        gui__1.addComponent(gui_foldableadvancedoptions);
        gui_foldableadvancedoptions.setName("foldableadvancedoptions");
        gui_foldableadvancedoptions.addComponent(gui_accountclientcertificate);
        gui_accountclientcertificate.setText("account_setup_basics_client_certificate");
        gui_accountclientcertificate.setName("accountclientcertificate");
        gui__1.addComponent(gui__2);
        gui_accountemail.setText("");
        gui_accountemail.setName("accountemail");
        gui_accountpassword.setText("");
        gui_accountpassword.setName("accountpassword");
        gui_showpassword.setText("account_setup_basics_show_password");
        gui_showpassword.setName("showpassword");
        gui_accountclientcertificatespinner.setName("accountclientcertificatespinner");
        gui_foldableadvancedoptions.setName("foldableadvancedoptions");
        gui__2.setName("_2");
        gui__1.setName("_1");
        addComponent(gui__3);
        gui__3.setName("_3");
        gui__3.addComponent(gui_divider);
        gui__3.addComponent(gui__4);
        gui__4.setName("_4");
        gui__4.addComponent(gui_manualsetup);
        gui__4.addComponent(gui_next);
        gui_manualsetup.setText("account_setup_basics_manual_setup_action");
        gui_manualsetup.setName("manualsetup");
        gui_next.setText("next_action");
        gui_next.setName("next");
        gui_divider.setName("divider");
        gui__4.setName("_4");
        gui_.setScrollableY(true);
        gui_.setName("");
        gui__3.setName("_3");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

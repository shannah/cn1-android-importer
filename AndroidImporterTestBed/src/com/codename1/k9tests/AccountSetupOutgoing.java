package com.codename1.k9tests;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class AccountSetupOutgoing extends Container  {
    public AccountSetupOutgoing(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Container gui__1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.components.SpanLabel gui__2 = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Label gui_accountserver = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui__3 = new com.codename1.components.SpanLabel();
    private com.codename1.ui.spinner.GenericSpinner gui_accountsecuritytype = new com.codename1.ui.spinner.GenericSpinner();
    private com.codename1.components.SpanLabel gui__4 = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Label gui_accountport = new com.codename1.ui.Label();
    private com.codename1.ui.CheckBox gui_accountrequirelogin = new com.codename1.ui.CheckBox();
    private com.codename1.ui.Container gui_accountrequireloginsettings = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.components.SpanLabel gui__5 = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Label gui_accountusername = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui__6 = new com.codename1.components.SpanLabel();
    private com.codename1.ui.spinner.GenericSpinner gui_accountauthtype = new com.codename1.ui.spinner.GenericSpinner();
    private com.codename1.components.SpanLabel gui_accountpasswordlabel = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Label gui_accountpassword = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui_accountclientcertificatelabel = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Container gui_accountclientcertificatespinner = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui__7 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui__8 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui_divider = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui__9 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Container gui__10 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Button gui_next = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setName("AccountSetupOutgoing");
        addComponent(gui_);
        gui_.setScrollableY(true);
        gui_.setName("");
        gui_.addComponent(gui__1);
        gui__1.setName("_1");
        gui__1.addComponent(gui__2);
        gui__1.addComponent(gui_accountserver);
        gui__1.addComponent(gui__3);
        gui__1.addComponent(gui_accountsecuritytype);
        gui__1.addComponent(gui__4);
        gui__1.addComponent(gui_accountport);
        gui__1.addComponent(gui_accountrequirelogin);
        gui__1.addComponent(gui_accountrequireloginsettings);
        gui_accountrequireloginsettings.setName("accountrequireloginsettings");
        gui_accountrequireloginsettings.addComponent(gui__5);
        gui_accountrequireloginsettings.addComponent(gui_accountusername);
        gui_accountrequireloginsettings.addComponent(gui__6);
        gui_accountrequireloginsettings.addComponent(gui_accountauthtype);
        gui_accountrequireloginsettings.addComponent(gui_accountpasswordlabel);
        gui_accountrequireloginsettings.addComponent(gui_accountpassword);
        gui_accountrequireloginsettings.addComponent(gui_accountclientcertificatelabel);
        gui_accountrequireloginsettings.addComponent(gui_accountclientcertificatespinner);
        gui__5.setText("account_setup_outgoing_username_label");
        gui__5.setName("_5");
        gui_accountusername.setText("");
        gui_accountusername.setName("accountusername");
        gui__6.setText("account_setup_outgoing_authentication_label");
        gui__6.setName("_6");
        gui_accountauthtype.setName("accountauthtype");
        gui_accountpasswordlabel.setText("account_setup_outgoing_password_label");
        gui_accountpasswordlabel.setName("accountpasswordlabel");
        gui_accountpassword.setText("");
        gui_accountpassword.setName("accountpassword");
        gui_accountclientcertificatelabel.setText("account_setup_incoming_client_certificate_label");
        gui_accountclientcertificatelabel.setName("accountclientcertificatelabel");
        gui_accountclientcertificatespinner.setName("accountclientcertificatespinner");
        gui__1.addComponent(gui__7);
        gui__2.setText("account_setup_outgoing_smtp_server_label");
        gui__2.setName("_2");
        gui_accountserver.setText("");
        gui_accountserver.setName("accountserver");
        gui__3.setText("account_setup_outgoing_security_label");
        gui__3.setName("_3");
        gui_accountsecuritytype.setName("accountsecuritytype");
        gui__4.setText("account_setup_outgoing_port_label");
        gui__4.setName("_4");
        gui_accountport.setText("");
        gui_accountport.setName("accountport");
        gui_accountrequirelogin.setText("account_setup_outgoing_require_login_label");
        gui_accountrequirelogin.setName("accountrequirelogin");
        gui_accountrequireloginsettings.setName("accountrequireloginsettings");
        gui__7.setName("_7");
        gui__1.setName("_1");
        addComponent(gui__8);
        gui__8.setName("_8");
        gui__8.addComponent(gui_divider);
        gui__8.addComponent(gui__9);
        gui__9.setName("_9");
        gui__9.addComponent(gui__10);
        gui__9.addComponent(gui_next);
        gui__10.setName("_10");
        gui_next.setText("next_action");
        gui_next.setName("next");
        gui_divider.setName("divider");
        gui__9.setName("_9");
        gui_.setScrollableY(true);
        gui_.setName("");
        gui__8.setName("_8");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

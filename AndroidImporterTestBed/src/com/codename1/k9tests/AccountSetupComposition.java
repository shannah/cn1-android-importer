package com.codename1.k9tests;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class AccountSetupComposition extends Container  {
    public AccountSetupComposition(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.components.SpanLabel gui__1 = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Label gui_accountname = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui__2 = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Label gui_accountemail = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui__3 = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Label gui_accountalwaysbcc = new com.codename1.ui.Label();
    private com.codename1.ui.CheckBox gui_accountsignatureuse = new com.codename1.ui.CheckBox();
    private com.codename1.ui.Container gui_accountsignaturelayout = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.components.SpanLabel gui__4 = new com.codename1.components.SpanLabel();
    private com.codename1.components.SpanLabel gui_accountsignature = new com.codename1.components.SpanLabel();
    private com.codename1.components.SpanLabel gui__5 = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Container gui_accountsignaturelocation = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.RadioButton gui_accountsignaturelocationbeforequotedtext = new com.codename1.ui.RadioButton();
    private com.codename1.ui.RadioButton gui_accountsignaturelocationafterquotedtext = new com.codename1.ui.RadioButton();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setScrollableY(true);
        setName("AccountSetupComposition");
        addComponent(gui_);
        gui_.setName("");
        gui_.addComponent(gui__1);
        gui_.addComponent(gui_accountname);
        gui_.addComponent(gui__2);
        gui_.addComponent(gui_accountemail);
        gui_.addComponent(gui__3);
        gui_.addComponent(gui_accountalwaysbcc);
        gui_.addComponent(gui_accountsignatureuse);
        gui_.addComponent(gui_accountsignaturelayout);
        gui_accountsignaturelayout.setName("accountsignaturelayout");
        gui_accountsignaturelayout.addComponent(gui__4);
        gui_accountsignaturelayout.addComponent(gui_accountsignature);
        gui_accountsignaturelayout.addComponent(gui__5);
        gui_accountsignaturelayout.addComponent(gui_accountsignaturelocation);
        gui_accountsignaturelocation.setName("accountsignaturelocation");
        gui_accountsignaturelocation.addComponent(gui_accountsignaturelocationbeforequotedtext);
        gui_accountsignaturelocation.addComponent(gui_accountsignaturelocationafterquotedtext);
        gui_accountsignaturelocationbeforequotedtext.setText("account_settings_signature__location_before_quoted_text");
        gui_accountsignaturelocationbeforequotedtext.setName("accountsignaturelocationbeforequotedtext");
        gui_accountsignaturelocationafterquotedtext.setText("account_settings_signature__location_after_quoted_text");
        gui_accountsignaturelocationafterquotedtext.setName("accountsignaturelocationafterquotedtext");
        gui__4.setText("account_settings_signature_label");
        gui__4.setName("_4");
        gui_accountsignature.setText("");
        gui_accountsignature.setName("accountsignature");
        gui__5.setText("account_settings_signature__location_label");
        gui__5.setName("_5");
        gui_accountsignaturelocation.setName("accountsignaturelocation");
        gui__1.setText("account_settings_name_label");
        gui__1.setName("_1");
        gui_accountname.setText("");
        gui_accountname.setName("accountname");
        gui__2.setText("account_settings_email_label");
        gui__2.setName("_2");
        gui_accountemail.setText("");
        gui_accountemail.setName("accountemail");
        gui__3.setText("account_settings_always_bcc_label");
        gui__3.setName("_3");
        gui_accountalwaysbcc.setText("");
        gui_accountalwaysbcc.setName("accountalwaysbcc");
        gui_accountsignatureuse.setText("account_settings_signature_use_label");
        gui_accountsignatureuse.setName("accountsignatureuse");
        gui_accountsignaturelayout.setName("accountsignaturelayout");
        gui_.setName("");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

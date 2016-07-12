package com.codename1.k9tests;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class AccountSetupOptions extends Container  {
    public AccountSetupOptions(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Container gui__1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.components.SpanLabel gui__2 = new com.codename1.components.SpanLabel();
    private com.codename1.ui.spinner.GenericSpinner gui_accountcheckfrequency = new com.codename1.ui.spinner.GenericSpinner();
    private com.codename1.ui.CheckBox gui_accountenablepush = new com.codename1.ui.CheckBox();
    private com.codename1.components.SpanLabel gui__3 = new com.codename1.components.SpanLabel();
    private com.codename1.ui.spinner.GenericSpinner gui_accountdisplaycount = new com.codename1.ui.spinner.GenericSpinner();
    private com.codename1.ui.CheckBox gui_accountnotify = new com.codename1.ui.CheckBox();
    private com.codename1.ui.CheckBox gui_accountnotifysync = new com.codename1.ui.CheckBox();
    private com.codename1.ui.Container gui__4 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui__5 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui_divider = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui__6 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Container gui__7 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Button gui_next = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setName("AccountSetupOptions");
        addComponent(gui_);
        gui_.setScrollableY(true);
        gui_.setName("");
        gui_.addComponent(gui__1);
        gui__1.setName("_1");
        gui__1.addComponent(gui__2);
        gui__1.addComponent(gui_accountcheckfrequency);
        gui__1.addComponent(gui_accountenablepush);
        gui__1.addComponent(gui__3);
        gui__1.addComponent(gui_accountdisplaycount);
        gui__1.addComponent(gui_accountnotify);
        gui__1.addComponent(gui_accountnotifysync);
        gui__1.addComponent(gui__4);
        gui__2.setText("account_setup_options_mail_check_frequency_label");
        gui__2.setName("_2");
        gui_accountcheckfrequency.setName("accountcheckfrequency");
        gui_accountenablepush.setText("account_setup_options_enable_push_label");
        gui_accountenablepush.setName("accountenablepush");
        gui__3.setText("account_setup_options_mail_display_count_label");
        gui__3.setName("_3");
        gui_accountdisplaycount.setName("accountdisplaycount");
        gui_accountnotify.setText("account_setup_options_notify_label");
        gui_accountnotify.setName("accountnotify");
        gui_accountnotifysync.setText("account_setup_options_notify_sync_label");
        gui_accountnotifysync.setName("accountnotifysync");
        gui__4.setName("_4");
        gui__1.setName("_1");
        addComponent(gui__5);
        gui__5.setName("_5");
        gui__5.addComponent(gui_divider);
        gui__5.addComponent(gui__6);
        gui__6.setName("_6");
        gui__6.addComponent(gui__7);
        gui__6.addComponent(gui_next);
        gui__7.setName("_7");
        gui_next.setText("next_action");
        gui_next.setName("next");
        gui_divider.setName("divider");
        gui__6.setName("_6");
        gui_.setScrollableY(true);
        gui_.setName("");
        gui__5.setName("_5");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

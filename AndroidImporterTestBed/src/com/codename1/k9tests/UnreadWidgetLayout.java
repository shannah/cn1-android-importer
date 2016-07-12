package com.codename1.k9tests;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class UnreadWidgetLayout extends Container  {
    public UnreadWidgetLayout(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.ui.Container gui_null = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Label gui__1 = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui_unreadcount = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Label gui_accountname = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setName("UnreadWidgetLayout");
        addComponent(gui_);
        gui_.setName("");
        gui_.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_null);
        gui_null.addComponent(gui__1);
        gui_null.addComponent(gui_unreadcount);
        gui__1.setName("_1");
        gui_unreadcount.setText("");
        gui_unreadcount.setName("unreadcount");
        addComponent(gui_accountname);
        gui_.setName("");
        gui_accountname.setText("app_name");
        gui_accountname.setName("accountname");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

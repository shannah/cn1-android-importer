package com.codename1.k9tests;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class WizardCancel extends Container  {
    public WizardCancel(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_divider = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Button gui_cancel = new com.codename1.ui.Button();
    private com.codename1.ui.Container gui__1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.FlowLayout());
        setName("WizardCancel");
        addComponent(gui_divider);
        addComponent(gui_);
        gui_.setName("");
        gui_.addComponent(gui_cancel);
        gui_.addComponent(gui__1);
        gui_cancel.setText("cancel_action");
        gui_cancel.setName("cancel");
        gui__1.setName("_1");
        gui_divider.setName("divider");
        gui_.setName("");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

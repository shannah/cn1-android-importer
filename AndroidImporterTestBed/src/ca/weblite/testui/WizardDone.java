package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class WizardDone extends Container  {
    public WizardDone(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_divider = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Container gui__1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Button gui_done = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.FlowLayout());
        setUIID("Container3Android");
        setName("WizardDone");
        addComponent(gui_divider);
        addComponent(gui_);
        gui_.setUIID("Container3Android");
        gui_.setName("");
        gui_.addComponent(gui__1);
        gui_.addComponent(gui_done);
        gui__1.setUIID("Container3Android");
        gui__1.setName("_1");
        gui_done.setText("done_action");
        gui_done.setUIID("Button20Android");
        gui_done.setName("done");
        gui_divider.setUIID("Container3Android");
        gui_divider.setName("divider");
        gui_.setUIID("Container3Android");
        gui_.setName("");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

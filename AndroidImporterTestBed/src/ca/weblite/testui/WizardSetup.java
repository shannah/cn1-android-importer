package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class WizardSetup extends Container  {
    public WizardSetup(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_divider = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Button gui_manualsetup = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_next = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.FlowLayout());
        setUIID("Container3Android");
        setName("WizardSetup");
        addComponent(gui_divider);
        addComponent(gui_);
        gui_.setUIID("Container3Android");
        gui_.setName("");
        gui_.addComponent(gui_manualsetup);
        gui_.addComponent(gui_next);
        gui_manualsetup.setText("account_setup_basics_manual_setup_action");
        gui_manualsetup.setUIID("Button20Android");
        gui_manualsetup.setName("manualsetup");
        gui_next.setText("next_action");
        gui_next.setUIID("Button20Android");
        gui_next.setName("next");
        gui_divider.setUIID("Container3Android");
        gui_divider.setName("divider");
        gui_.setUIID("Container3Android");
        gui_.setName("");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

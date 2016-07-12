package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class ChooseAccountItem extends Container  {
    public ChooseAccountItem(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_chip = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Label gui_name = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
        setUIID("Container3Android");
        setName("ChooseAccountItem");
        addComponent(gui_chip);
        addComponent(gui_name);
        gui_chip.setUIID("Container3Android");
        gui_chip.setName("chip");
        gui_name.setUIID("Label200Android");
        gui_name.setName("name");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

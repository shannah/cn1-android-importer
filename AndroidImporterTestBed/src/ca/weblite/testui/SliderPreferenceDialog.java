package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class SliderPreferenceDialog extends Container  {
    public SliderPreferenceDialog(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.components.SpanLabel gui_message = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Slider gui_sliderpreferenceseekbar = new com.codename1.ui.Slider();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setUIID("Container573Android");
        setName("SliderPreferenceDialog");
        addComponent(gui_message);
        addComponent(gui_sliderpreferenceseekbar);
        gui_message.setUIID("SpanLabel37Android");
        gui_message.setName("message");
        gui_sliderpreferenceseekbar.setUIID("Slider572Android");
        gui_sliderpreferenceseekbar.setName("sliderpreferenceseekbar");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

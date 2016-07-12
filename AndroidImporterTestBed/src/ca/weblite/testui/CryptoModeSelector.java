package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class CryptoModeSelector extends Container  {
    public CryptoModeSelector(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Container gui__1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Label gui_icon1 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_icon2 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_icon3 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_icon4 = new com.codename1.ui.Label();
    private com.codename1.ui.Slider gui_seekbar = new com.codename1.ui.Slider();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.FlowLayout());
        setUIID("Container3Android");
        setName("CryptoModeSelector");
        addComponent(gui_);
        gui_.setUIID("Container3Android");
        gui_.setName("");
        gui_.addComponent(gui__1);
        gui__1.setUIID("Container3Android");
        gui__1.setName("_1");
        gui__1.addComponent(gui_icon1);
        gui__1.addComponent(gui_icon2);
        gui__1.addComponent(gui_icon3);
        gui__1.addComponent(gui_icon4);
        gui_icon1.setUIID("Label10Android");
        gui_icon1.setName("icon1");
        gui_icon2.setUIID("Label10Android");
        gui_icon2.setName("icon2");
        gui_icon3.setUIID("Label10Android");
        gui_icon3.setName("icon3");
        gui_icon4.setUIID("Label10Android");
        gui_icon4.setName("icon4");
        gui_.addComponent(gui_seekbar);
        gui__1.setUIID("Container3Android");
        gui__1.setName("_1");
        gui_seekbar.setUIID("Slider2Android");
        gui_seekbar.setName("seekbar");
        gui_.setUIID("Container3Android");
        gui_.setName("");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

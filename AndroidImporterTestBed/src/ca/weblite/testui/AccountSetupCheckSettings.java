package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class AccountSetupCheckSettings extends Container  {
    public AccountSetupCheckSettings(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Container gui__1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.components.SpanLabel gui_message = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Slider gui_progress = new com.codename1.ui.Slider();
    private com.codename1.ui.Container gui__2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui_divider = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui__3 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Button gui_cancel = new com.codename1.ui.Button();
    private com.codename1.ui.Container gui__4 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setUIID("Container3Android");
        setName("AccountSetupCheckSettings");
        addComponent(gui_);
        gui_.setScrollableY(true);
        gui_.setUIID("Container3Android");
        gui_.setName("");
        gui_.addComponent(gui__1);
        gui__1.setUIID("Container3Android");
        gui__1.setName("_1");
        gui__1.addComponent(gui_message);
        gui__1.addComponent(gui_progress);
        gui_message.setUIID("SpanLabel26Android");
        gui_message.setName("message");
        gui_progress.setUIID("Slider2Android");
        gui_progress.setName("progress");
        gui__1.setUIID("Container3Android");
        gui__1.setName("_1");
        addComponent(gui__2);
        gui__2.setUIID("Container3Android");
        gui__2.setName("_2");
        gui__2.addComponent(gui_divider);
        gui__2.addComponent(gui__3);
        gui__3.setUIID("Container3Android");
        gui__3.setName("_3");
        gui__3.addComponent(gui_cancel);
        gui__3.addComponent(gui__4);
        gui_cancel.setText("cancel_action");
        gui_cancel.setUIID("Button20Android");
        gui_cancel.setName("cancel");
        gui__4.setUIID("Container3Android");
        gui__4.setName("_4");
        gui_divider.setUIID("Container3Android");
        gui_divider.setName("divider");
        gui__3.setUIID("Container3Android");
        gui__3.setName("_3");
        gui_.setScrollableY(true);
        gui_.setUIID("Container3Android");
        gui_.setName("");
        gui__2.setUIID("Container3Android");
        gui__2.setName("_2");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

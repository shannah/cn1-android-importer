package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class WelcomeMessage extends Container  {
    public WelcomeMessage(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Container gui__1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.components.SpanLabel gui_welcomemessage = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Container gui__2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui__3 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui_divider = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui__4 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Button gui_importsettings = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_next = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setUIID("Container3Android");
        setName("WelcomeMessage");
        addComponent(gui_);
        gui_.setScrollableY(true);
        gui_.setUIID("Container3Android");
        gui_.setName("");
        gui_.addComponent(gui__1);
        gui__1.setUIID("Container3Android");
        gui__1.setName("_1");
        gui__1.addComponent(gui_welcomemessage);
        gui__1.addComponent(gui__2);
        gui_welcomemessage.setUIID("SpanLabel37Android");
        gui_welcomemessage.setName("welcomemessage");
        gui__2.setUIID("Container3Android");
        gui__2.setName("_2");
        gui__1.setUIID("Container3Android");
        gui__1.setName("_1");
        addComponent(gui__3);
        gui__3.setUIID("Container3Android");
        gui__3.setName("_3");
        gui__3.addComponent(gui_divider);
        gui__3.addComponent(gui__4);
        gui__4.setUIID("Container3Android");
        gui__4.setName("_4");
        gui__4.addComponent(gui_importsettings);
        gui__4.addComponent(gui_next);
        gui_importsettings.setText("settings_import");
        gui_importsettings.setUIID("Button20Android");
        gui_importsettings.setName("importsettings");
        gui_next.setText("next_action");
        gui_next.setUIID("Button20Android");
        gui_next.setName("next");
        gui_divider.setUIID("Container3Android");
        gui_divider.setName("divider");
        gui__4.setUIID("Container3Android");
        gui__4.setName("_4");
        gui_.setScrollableY(true);
        gui_.setUIID("Container3Android");
        gui_.setName("");
        gui__3.setUIID("Container3Android");
        gui__3.setName("_3");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

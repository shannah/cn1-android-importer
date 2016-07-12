package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class MessageComposeAttachment extends Container  {
    public MessageComposeAttachment(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Button gui_attachmentdelete = new com.codename1.ui.Button();
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Label gui_attachmentname = new com.codename1.ui.Label();
    private com.codename1.ui.Slider gui_progressBar = new com.codename1.ui.Slider();
    private com.codename1.ui.Label gui__1 = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setUIID("Container369Android");
        setName("MessageComposeAttachment");
        addComponent(gui_attachmentdelete);
        addComponent(gui_);
        gui_.setUIID("Container367Android");
        gui_.setName("");
        gui_.addComponent(gui_attachmentname);
        gui_.addComponent(gui_progressBar);
        gui_attachmentname.setUIID("Label10Android");
        gui_attachmentname.setName("attachmentname");
        gui_progressBar.setUIID("Slider2Android");
        gui_progressBar.setName("progressBar");
        addComponent(gui__1);
        gui_attachmentdelete.setUIID("Button20Android");
        gui_attachmentdelete.setName("attachmentdelete");
        gui_.setUIID("Container367Android");
        gui_.setName("");
        gui__1.setUIID("Label10Android");
        gui__1.setName("_1");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

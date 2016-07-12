package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class MessageListLoading extends Container  {
    public MessageListLoading(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Slider gui_ = new com.codename1.ui.Slider();
    private com.codename1.ui.Label gui__1 = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setUIID("Container3Android");
        setName("MessageListLoading");
        addComponent(gui_);
        addComponent(gui__1);
        gui_.setUIID("Slider2Android");
        gui_.setName("");
        gui__1.setText("message_list_loading");
        gui__1.setUIID("Label10Android");
        gui__1.setName("_1");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

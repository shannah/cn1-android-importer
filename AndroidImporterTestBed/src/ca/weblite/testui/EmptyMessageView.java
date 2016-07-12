package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class EmptyMessageView extends Container  {
    public EmptyMessageView(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Label gui_ = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setUIID("Container3Android");
        setName("EmptyMessageView");
        addComponent(gui_);
        gui_.setText("message_view_empty");
        gui_.setUIID("Label10Android");
        gui_.setName("");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

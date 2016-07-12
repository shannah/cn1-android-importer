package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class MessageList extends Container  {
    public MessageList(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_messagelistcontainer = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.ui.Container gui_messageviewcontainer = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.FlowLayout());
        setUIID("Container3Android");
        setName("MessageList");
        addComponent(gui_messagelistcontainer);
        addComponent(gui_messageviewcontainer);
        gui_messagelistcontainer.setUIID("Container3Android");
        gui_messagelistcontainer.setName("messagelistcontainer");
        gui_messageviewcontainer.setUIID("Container3Android");
        gui_messageviewcontainer.setName("messageviewcontainer");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

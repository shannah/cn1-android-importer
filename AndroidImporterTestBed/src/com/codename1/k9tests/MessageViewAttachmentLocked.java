package com.codename1.k9tests;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class MessageViewAttachmentLocked extends Container  {
    public MessageViewAttachmentLocked(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Container gui__1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.ui.Label gui_lockicon = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_lockedname = new com.codename1.ui.Label();
    private com.codename1.ui.Button gui_lockedbutton = new com.codename1.ui.Button();
    private com.codename1.components.SpanLabel gui_lockedinfo = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Label gui__2 = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_attachmentstub = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.FlowLayout());
        setName("MessageViewAttachmentLocked");
        addComponent(gui_);
        gui_.setName("");
        gui_.addComponent(gui__1);
        gui_.addComponent(gui_lockicon);
        gui_.addComponent(gui_lockedname);
        gui_.addComponent(gui_lockedbutton);
        gui_.addComponent(gui_lockedinfo);
        gui_.addComponent(gui__2);
        gui__1.setName("_1");
        gui_lockicon.setName("lockicon");
        gui_lockedname.setText("locked_attach_title");
        gui_lockedname.setName("lockedname");
        gui_lockedbutton.setText("locked_attach_unlock");
        gui_lockedbutton.setName("lockedbutton");
        gui_lockedinfo.setText("locked_attach_unencrypted");
        gui_lockedinfo.setName("lockedinfo");
        gui__2.setName("_2");
        addComponent(gui_attachmentstub);
        gui_.setName("");
        gui_attachmentstub.setName("attachmentstub");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

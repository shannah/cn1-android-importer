package com.codename1.k9tests;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class MessageViewAttachment extends Container  {
    public MessageViewAttachment(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Container gui__1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Label gui_attachmenticon = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_attachmentname = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_attachmentinfo = new com.codename1.ui.Label();
    private com.codename1.ui.Button gui_download = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_view = new com.codename1.ui.Button();
    private com.codename1.ui.Container gui__2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Label gui__3 = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.FlowLayout());
        setName("MessageViewAttachment");
        addComponent(gui_);
        gui_.setName("");
        gui_.addComponent(gui__1);
        gui__1.setName("_1");
        gui__1.addComponent(gui_attachmenticon);
        gui__1.addComponent(gui_attachmentname);
        gui__1.addComponent(gui_attachmentinfo);
        gui__1.addComponent(gui_download);
        gui__1.addComponent(gui_view);
        gui_attachmenticon.setName("attachmenticon");
        gui_attachmentname.setText("");
        gui_attachmentname.setName("attachmentname");
        gui_attachmentinfo.setText("");
        gui_attachmentinfo.setName("attachmentinfo");
        gui_download.setText("message_view_attachment_download_action");
        gui_download.setName("download");
        gui_view.setText("message_view_attachment_view_action");
        gui_view.setName("view");
        gui__1.setName("_1");
        addComponent(gui__2);
        gui__2.setName("_2");
        gui__2.addComponent(gui__3);
        gui__3.setName("_3");
        gui_.setName("");
        gui__2.setName("_2");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

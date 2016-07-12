package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class EditIdentity extends Container  {
    public EditIdentity(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.components.SpanLabel gui__1 = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Label gui_description = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui__2 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_name = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui__3 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_email = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui__4 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_replyto = new com.codename1.ui.Label();
    private com.codename1.ui.CheckBox gui_signatureuse = new com.codename1.ui.CheckBox();
    private com.codename1.ui.Container gui_signaturelayout = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Label gui__5 = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui_signature = new com.codename1.components.SpanLabel();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setScrollableY(true);
        setUIID("Container3Android");
        setName("EditIdentity");
        addComponent(gui_);
        gui_.setUIID("Container3Android");
        gui_.setName("");
        gui_.addComponent(gui__1);
        gui_.addComponent(gui_description);
        gui_.addComponent(gui__2);
        gui_.addComponent(gui_name);
        gui_.addComponent(gui__3);
        gui_.addComponent(gui_email);
        gui_.addComponent(gui__4);
        gui_.addComponent(gui_replyto);
        gui_.addComponent(gui_signatureuse);
        gui_.addComponent(gui_signaturelayout);
        gui_signaturelayout.setUIID("Container3Android");
        gui_signaturelayout.setName("signaturelayout");
        gui_signaturelayout.addComponent(gui__5);
        gui_signaturelayout.addComponent(gui_signature);
        gui__5.setText("edit_identity_signature_label");
        gui__5.setUIID("Label10Android");
        gui__5.setName("_5");
        gui_signature.setUIID("SpanLabel37Android");
        gui_signature.setName("signature");
        gui__1.setText("edit_identity_description_label");
        gui__1.setUIID("SpanLabel37Android");
        gui__1.setName("_1");
        gui_description.setUIID("Label10Android");
        gui_description.setName("description");
        gui__2.setText("edit_identity_name_label");
        gui__2.setUIID("Label10Android");
        gui__2.setName("_2");
        gui_name.setUIID("Label10Android");
        gui_name.setName("name");
        gui__3.setText("edit_identity_email_label");
        gui__3.setUIID("Label10Android");
        gui__3.setName("_3");
        gui_email.setUIID("Label10Android");
        gui_email.setName("email");
        gui__4.setText("edit_identity_reply_to_label");
        gui__4.setUIID("Label10Android");
        gui__4.setName("_4");
        gui_replyto.setUIID("Label10Android");
        gui_replyto.setName("replyto");
        gui_signatureuse.setText("account_settings_signature_use_label");
        gui_signatureuse.setUIID("CheckBox12Android");
        gui_signatureuse.setName("signatureuse");
        gui_signaturelayout.setUIID("Container3Android");
        gui_signaturelayout.setName("signaturelayout");
        gui_.setUIID("Container3Android");
        gui_.setName("");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

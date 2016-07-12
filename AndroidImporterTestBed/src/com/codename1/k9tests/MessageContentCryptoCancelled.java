package com.codename1.k9tests;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class MessageContentCryptoCancelled extends Container  {
    public MessageContentCryptoCancelled(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Label gui_cryptoerroricon = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui_cryptoerrortitle = new com.codename1.components.SpanLabel();
    private com.codename1.components.SpanLabel gui__1 = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Button gui_cryptocancelledretry = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setName("MessageContentCryptoCancelled");
        addComponent(gui_);
        gui_.setName("");
        gui_.addComponent(gui_cryptoerroricon);
        gui_.addComponent(gui_cryptoerrortitle);
        gui_cryptoerroricon.setName("cryptoerroricon");
        gui_cryptoerrortitle.setText("messageview_crypto_error_title");
        gui_cryptoerrortitle.setName("cryptoerrortitle");
        addComponent(gui__1);
        addComponent(gui_cryptocancelledretry);
        gui_.setName("");
        gui__1.setText("messageview_decrypt_cancelled");
        gui__1.setName("_1");
        gui_cryptocancelledretry.setText("messageview_decrypt_retry");
        gui_cryptocancelledretry.setName("cryptocancelledretry");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

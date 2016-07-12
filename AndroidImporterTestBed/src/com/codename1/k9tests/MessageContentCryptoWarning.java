package com.codename1.k9tests;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class MessageContentCryptoWarning extends Container  {
    public MessageContentCryptoWarning(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Label gui_cryptoerroricon = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui_cryptoerrortitle = new com.codename1.components.SpanLabel();
    private com.codename1.components.SpanLabel gui_cryptowarningtext = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Button gui_cryptowarningoverride = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setName("MessageContentCryptoWarning");
        addComponent(gui_);
        gui_.setName("");
        gui_.addComponent(gui_cryptoerroricon);
        gui_.addComponent(gui_cryptoerrortitle);
        gui_cryptoerroricon.setName("cryptoerroricon");
        gui_cryptoerrortitle.setText("messageview_crypto_warning_title");
        gui_cryptoerrortitle.setName("cryptoerrortitle");
        addComponent(gui_cryptowarningtext);
        addComponent(gui_cryptowarningoverride);
        gui_.setName("");
        gui_cryptowarningtext.setText("");
        gui_cryptowarningtext.setName("cryptowarningtext");
        gui_cryptowarningoverride.setText("Show message anyways");
        gui_cryptowarningoverride.setName("cryptowarningoverride");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

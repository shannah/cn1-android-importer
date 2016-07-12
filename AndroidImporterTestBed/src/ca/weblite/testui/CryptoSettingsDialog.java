package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class CryptoSettingsDialog extends Container  {
    public CryptoSettingsDialog(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_cryptostatustext = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Label gui_ = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui__1 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui__2 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui__3 = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_cryptostatusselector = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setUIID("Container3Android");
        setName("CryptoSettingsDialog");
        addComponent(gui_cryptostatustext);
        gui_cryptostatustext.setUIID("Container3Android");
        gui_cryptostatustext.setName("cryptostatustext");
        gui_cryptostatustext.addComponent(gui_);
        gui_cryptostatustext.addComponent(gui__1);
        gui_cryptostatustext.addComponent(gui__2);
        gui_cryptostatustext.addComponent(gui__3);
        gui_.setText("crypto_mode_disabled");
        gui_.setUIID("Label10Android");
        gui_.setName("");
        gui__1.setText("crypto_mode_sign_only");
        gui__1.setUIID("Label10Android");
        gui__1.setName("_1");
        gui__2.setText("crypto_mode_opportunistic");
        gui__2.setUIID("Label10Android");
        gui__2.setName("_2");
        gui__3.setText("crypto_mode_private");
        gui__3.setUIID("Label10Android");
        gui__3.setName("_3");
        addComponent(gui_cryptostatusselector);
        gui_cryptostatustext.setUIID("Container3Android");
        gui_cryptostatustext.setName("cryptostatustext");
        gui_cryptostatusselector.setUIID("Container3Android");
        gui_cryptostatusselector.setName("cryptostatusselector");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

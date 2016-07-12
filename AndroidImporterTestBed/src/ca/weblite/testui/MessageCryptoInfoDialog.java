package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class MessageCryptoInfoDialog extends Container  {
    public MessageCryptoInfoDialog(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_cryptoinfotopframe = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.ui.Container gui_null = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Label gui_cryptoinfotopicon1 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_cryptoinfotopicon2 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_cryptoinfotopicon3 = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui_cryptoinfotoptext = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Container gui_cryptoinfobottomframe = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.ui.Container gui_null_1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Label gui_cryptoinfobottomicon1 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_cryptoinfobottomicon2 = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui_cryptoinfobottomtext = new com.codename1.components.SpanLabel();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setUIID("Container3Android");
        setName("MessageCryptoInfoDialog");
        addComponent(gui_cryptoinfotopframe);
        gui_cryptoinfotopframe.setUIID("Container3Android");
        gui_cryptoinfotopframe.setName("cryptoinfotopframe");
        gui_cryptoinfotopframe.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_null);
        gui_null.addComponent(gui_cryptoinfotopicon1);
        gui_null.addComponent(gui_cryptoinfotopicon2);
        gui_null.addComponent(gui_cryptoinfotopicon3);
        gui_cryptoinfotopicon1.setUIID("Label10Android");
        gui_cryptoinfotopicon1.setName("cryptoinfotopicon1");
        gui_cryptoinfotopicon2.setUIID("Label10Android");
        gui_cryptoinfotopicon2.setName("cryptoinfotopicon2");
        gui_cryptoinfotopicon3.setUIID("Label10Android");
        gui_cryptoinfotopicon3.setName("cryptoinfotopicon3");
        addComponent(gui_cryptoinfotoptext);
        addComponent(gui_cryptoinfobottomframe);
        gui_cryptoinfobottomframe.setUIID("Container3Android");
        gui_cryptoinfobottomframe.setName("cryptoinfobottomframe");
        gui_cryptoinfobottomframe.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_null_1);
        gui_null_1.setName("null_1");
        gui_null_1.addComponent(gui_cryptoinfobottomicon1);
        gui_null_1.addComponent(gui_cryptoinfobottomicon2);
        gui_cryptoinfobottomicon1.setUIID("Label10Android");
        gui_cryptoinfobottomicon1.setName("cryptoinfobottomicon1");
        gui_cryptoinfobottomicon2.setUIID("Label10Android");
        gui_cryptoinfobottomicon2.setName("cryptoinfobottomicon2");
        gui_null_1.setName("null_1");
        addComponent(gui_cryptoinfobottomtext);
        gui_cryptoinfotopframe.setUIID("Container3Android");
        gui_cryptoinfotopframe.setName("cryptoinfotopframe");
        gui_cryptoinfotoptext.setUIID("SpanLabel37Android");
        gui_cryptoinfotoptext.setName("cryptoinfotoptext");
        gui_cryptoinfobottomframe.setUIID("Container3Android");
        gui_cryptoinfobottomframe.setName("cryptoinfobottomframe");
        gui_cryptoinfobottomtext.setUIID("SpanLabel37Android");
        gui_cryptoinfobottomtext.setName("cryptoinfobottomtext");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

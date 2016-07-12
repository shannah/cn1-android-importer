package com.codename1.k9tests;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class OpenpgpInlineDialog extends Container  {
    public OpenpgpInlineDialog(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Label gui__1 = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui__2 = new com.codename1.components.SpanLabel();
    private com.codename1.components.SpanLabel gui__3 = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Container gui__4 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Label gui__5 = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui__6 = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Container gui__7 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Label gui__8 = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui__9 = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Container gui__10 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Label gui__11 = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui__12 = new com.codename1.components.SpanLabel();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setName("OpenpgpInlineDialog");
        addComponent(gui_);
        gui_.setName("");
        gui_.addComponent(gui__1);
        gui_.addComponent(gui__2);
        gui__1.setName("_1");
        gui__2.setText("openpgp_inline_title");
        gui__2.setName("_2");
        addComponent(gui__3);
        addComponent(gui__4);
        gui__4.setName("_4");
        gui__4.addComponent(gui__5);
        gui__4.addComponent(gui__6);
        gui__5.setName("_5");
        gui__6.setText("openpgp_inline_plus_compat");
        gui__6.setName("_6");
        addComponent(gui__7);
        gui__7.setName("_7");
        gui__7.addComponent(gui__8);
        gui__7.addComponent(gui__9);
        gui__8.setName("_8");
        gui__9.setText("openpgp_inline_minus_transit");
        gui__9.setName("_9");
        addComponent(gui__10);
        gui__10.setName("_10");
        gui__10.addComponent(gui__11);
        gui__10.addComponent(gui__12);
        gui__11.setName("_11");
        gui__12.setText("openpgp_inline_minus_attach");
        gui__12.setName("_12");
        gui_.setName("");
        gui__3.setText("openpgp_inline_text");
        gui__3.setName("_3");
        gui__4.setName("_4");
        gui__7.setName("_7");
        gui__10.setName("_10");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

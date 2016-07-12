package com.codename1.k9tests;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class RecipientTokenItem extends Container  {
    public RecipientTokenItem(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Label gui_contactphoto = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui_text1 = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Label gui_contactcryptostatusred = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_contactcryptostatusorange = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_contactcryptostatusgreen = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
        setName("RecipientTokenItem");
        addComponent(gui_contactphoto);
        addComponent(gui_text1);
        addComponent(gui_contactcryptostatusred);
        addComponent(gui_contactcryptostatusorange);
        addComponent(gui_contactcryptostatusgreen);
        gui_contactphoto.setName("contactphoto");
        gui_text1.setText("");
        gui_text1.setName("text1");
        gui_contactcryptostatusred.setName("contactcryptostatusred");
        gui_contactcryptostatusorange.setName("contactcryptostatusorange");
        gui_contactcryptostatusgreen.setName("contactcryptostatusgreen");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

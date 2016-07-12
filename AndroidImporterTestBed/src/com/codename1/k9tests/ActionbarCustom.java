package com.codename1.k9tests;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class ActionbarCustom extends Container  {
    public ActionbarCustom(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_null = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Container gui_actionbarmessagelist = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Container gui_titlelayout = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Label gui_actionbartitlefirst = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_actionbartitlesub = new com.codename1.ui.Label();
    private com.codename1.ui.Slider gui_actionbarprogress = new com.codename1.ui.Slider();
    private com.codename1.components.SpanLabel gui_actionbarunreadcount = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Container gui_actionbarmessageview = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Container gui_messagetitleview = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BorderLayout());
        setName("ActionbarCustom");
        addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_null);
        gui_null.addComponent(gui_actionbarmessagelist);
        gui_actionbarmessagelist.setName("actionbarmessagelist");
        gui_actionbarmessagelist.addComponent(gui_titlelayout);
        gui_titlelayout.setName("titlelayout");
        gui_titlelayout.addComponent(gui_actionbartitlefirst);
        gui_titlelayout.addComponent(gui_actionbartitlesub);
        gui_actionbartitlefirst.setText("");
        gui_actionbartitlefirst.setName("actionbartitlefirst");
        gui_actionbartitlesub.setText("");
        gui_actionbartitlesub.setName("actionbartitlesub");
        gui_actionbarmessagelist.addComponent(gui_actionbarprogress);
        gui_actionbarmessagelist.addComponent(gui_actionbarunreadcount);
        gui_titlelayout.setName("titlelayout");
        gui_actionbarprogress.setName("actionbarprogress");
        gui_actionbarunreadcount.setText("");
        gui_actionbarunreadcount.setName("actionbarunreadcount");
        gui_null.addComponent(gui_actionbarmessageview);
        gui_actionbarmessageview.setName("actionbarmessageview");
        gui_actionbarmessageview.addComponent(gui_messagetitleview);
        gui_messagetitleview.setName("messagetitleview");
        gui_actionbarmessagelist.setName("actionbarmessagelist");
        gui_actionbarmessageview.setName("actionbarmessageview");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

package com.codename1.k9tests;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class AccountList extends Container  {
    public AccountList(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.List gui_list = new com.codename1.ui.List();
    private com.codename1.ui.Container gui_empty = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Slider gui_ = new com.codename1.ui.Slider();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setName("AccountList");
        addComponent(gui_list);
        addComponent(gui_empty);
        gui_empty.setName("empty");
        gui_empty.addComponent(gui_);
        gui_.setName("");
        gui_list.setName("list");
        gui_empty.setName("empty");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

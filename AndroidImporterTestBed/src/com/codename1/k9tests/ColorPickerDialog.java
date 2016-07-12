package com.codename1.k9tests;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class ColorPickerDialog extends Container  {
    public ColorPickerDialog(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_null = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Container gui_colorpicker = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.ui.Container gui_null_1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BorderLayout());
        setName("ColorPickerDialog");
        addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_null);
        gui_null.addComponent(gui_colorpicker);
        gui_colorpicker.setName("colorpicker");
        gui_colorpicker.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_null_1);
        gui_null_1.setName("null_1");
        gui_colorpicker.setName("colorpicker");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

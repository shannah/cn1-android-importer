package com.codename1.k9tests;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class UpgradeDatabases extends Container  {
    public UpgradeDatabases(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Slider gui_databaseUpgradeProgress = new com.codename1.ui.Slider();
    private com.codename1.components.SpanLabel gui_databaseUpgradeText = new com.codename1.components.SpanLabel();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setName("UpgradeDatabases");
        addComponent(gui_databaseUpgradeProgress);
        addComponent(gui_databaseUpgradeText);
        gui_databaseUpgradeProgress.setName("databaseUpgradeProgress");
        gui_databaseUpgradeText.setText("upgrade_databases_unspecified");
        gui_databaseUpgradeText.setName("databaseUpgradeText");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

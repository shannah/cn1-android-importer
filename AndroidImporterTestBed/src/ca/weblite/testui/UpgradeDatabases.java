package ca.weblite.testui;

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
    private com.codename1.ui.Label gui_databaseUpgradeText = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setUIID("Container3Android");
        setName("UpgradeDatabases");
        addComponent(gui_databaseUpgradeProgress);
        addComponent(gui_databaseUpgradeText);
        gui_databaseUpgradeProgress.setUIID("Slider2Android");
        gui_databaseUpgradeProgress.setName("databaseUpgradeProgress");
        gui_databaseUpgradeText.setText("upgrade_databases_unspecified");
        gui_databaseUpgradeText.setUIID("Label10Android");
        gui_databaseUpgradeText.setName("databaseUpgradeText");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

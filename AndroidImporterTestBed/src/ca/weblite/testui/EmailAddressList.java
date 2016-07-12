package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class EmailAddressList extends Container  {
    public EmailAddressList(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.List gui_androidlist = new com.codename1.ui.List();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setUIID("Container3Android");
        setName("EmailAddressList");
        addComponent(gui_androidlist);
        gui_androidlist.setUIID("List1Android");
        gui_androidlist.setName("androidlist");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

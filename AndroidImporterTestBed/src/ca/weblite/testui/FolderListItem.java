package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class FolderListItem extends Container  {
    public FolderListItem(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_chip = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.components.SpanLabel gui_foldername = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Label gui_folderstatus = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_activeicons = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Container gui_flaggedmessagecountwrapper = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Container gui_flaggedmessagecounticon = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Label gui_flaggedmessagecount = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_newmessagecountwrapper = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Container gui_newmessagecounticon = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Label gui_newmessagecount = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
        setUIID("Container268Android");
        setName("FolderListItem");
        addComponent(gui_chip);
        addComponent(gui_);
        gui_.setUIID("Container254Android");
        gui_.setName("");
        gui_.addComponent(gui_foldername);
        gui_.addComponent(gui_folderstatus);
        gui_foldername.setUIID("SpanLabel37Android");
        gui_foldername.setName("foldername");
        gui_folderstatus.setUIID("Label10Android");
        gui_folderstatus.setName("folderstatus");
        addComponent(gui_activeicons);
        gui_activeicons.setUIID("Container3Android");
        gui_activeicons.setName("activeicons");
        gui_activeicons.addComponent(gui_flaggedmessagecountwrapper);
        gui_flaggedmessagecountwrapper.setUIID("Container158Android");
        gui_flaggedmessagecountwrapper.setName("flaggedmessagecountwrapper");
        gui_flaggedmessagecountwrapper.addComponent(gui_flaggedmessagecounticon);
        gui_flaggedmessagecountwrapper.addComponent(gui_flaggedmessagecount);
        gui_flaggedmessagecounticon.setUIID("Container3Android");
        gui_flaggedmessagecounticon.setName("flaggedmessagecounticon");
        gui_flaggedmessagecount.setUIID("Label10Android");
        gui_flaggedmessagecount.setName("flaggedmessagecount");
        gui_activeicons.addComponent(gui_newmessagecountwrapper);
        gui_newmessagecountwrapper.setUIID("Container158Android");
        gui_newmessagecountwrapper.setName("newmessagecountwrapper");
        gui_newmessagecountwrapper.addComponent(gui_newmessagecounticon);
        gui_newmessagecountwrapper.addComponent(gui_newmessagecount);
        gui_newmessagecounticon.setUIID("Container3Android");
        gui_newmessagecounticon.setName("newmessagecounticon");
        gui_newmessagecount.setUIID("Label10Android");
        gui_newmessagecount.setName("newmessagecount");
        gui_flaggedmessagecountwrapper.setUIID("Container158Android");
        gui_flaggedmessagecountwrapper.setName("flaggedmessagecountwrapper");
        gui_newmessagecountwrapper.setUIID("Container158Android");
        gui_newmessagecountwrapper.setName("newmessagecountwrapper");
        gui_chip.setUIID("Container3Android");
        gui_chip.setName("chip");
        gui_.setUIID("Container254Android");
        gui_.setName("");
        gui_activeicons.setUIID("Container3Android");
        gui_activeicons.setName("activeicons");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

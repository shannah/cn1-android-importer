package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class AccountSetupNames extends Container  {
    public AccountSetupNames(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Container gui__1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Label gui_accountdescription = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_accountname = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui__2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui__3 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui_divider = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui__4 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Container gui__5 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Button gui_done = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setUIID("Container3Android");
        setName("AccountSetupNames");
        addComponent(gui_);
        gui_.setScrollableY(true);
        gui_.setUIID("Container3Android");
        gui_.setName("");
        gui_.addComponent(gui__1);
        gui__1.setUIID("Container3Android");
        gui__1.setName("_1");
        gui__1.addComponent(gui_accountdescription);
        gui__1.addComponent(gui_accountname);
        gui__1.addComponent(gui__2);
        gui_accountdescription.setUIID("Label10Android");
        gui_accountdescription.setName("accountdescription");
        gui_accountname.setUIID("Label10Android");
        gui_accountname.setName("accountname");
        gui__2.setUIID("Container3Android");
        gui__2.setName("_2");
        gui__1.setUIID("Container3Android");
        gui__1.setName("_1");
        addComponent(gui__3);
        gui__3.setUIID("Container3Android");
        gui__3.setName("_3");
        gui__3.addComponent(gui_divider);
        gui__3.addComponent(gui__4);
        gui__4.setUIID("Container3Android");
        gui__4.setName("_4");
        gui__4.addComponent(gui__5);
        gui__4.addComponent(gui_done);
        gui__5.setUIID("Container3Android");
        gui__5.setName("_5");
        gui_done.setText("done_action");
        gui_done.setUIID("Button20Android");
        gui_done.setName("done");
        gui_divider.setUIID("Container3Android");
        gui_divider.setName("divider");
        gui__4.setUIID("Container3Android");
        gui__4.setName("_4");
        gui_.setScrollableY(true);
        gui_.setUIID("Container3Android");
        gui_.setName("");
        gui__3.setUIID("Container3Android");
        gui__3.setName("_3");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

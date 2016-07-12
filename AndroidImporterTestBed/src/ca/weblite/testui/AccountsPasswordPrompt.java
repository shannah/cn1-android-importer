package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class AccountsPasswordPrompt extends Container  {
    public AccountsPasswordPrompt(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.components.SpanLabel gui_passwordpromptintro = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Container gui_incomingserverprompt = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.components.SpanLabel gui_passwordpromptincomingserver = new com.codename1.components.SpanLabel();
    private com.codename1.components.SpanLabel gui_incomingserverpassword = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Container gui_outgoingserverprompt = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.components.SpanLabel gui_passwordpromptoutgoingserver = new com.codename1.components.SpanLabel();
    private com.codename1.ui.CheckBox gui_useincomingserverpassword = new com.codename1.ui.CheckBox();
    private com.codename1.components.SpanLabel gui_outgoingserverpassword = new com.codename1.components.SpanLabel();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setUIID("Container3Android");
        setName("AccountsPasswordPrompt");
        addComponent(gui_passwordpromptintro);
        addComponent(gui_incomingserverprompt);
        gui_incomingserverprompt.setUIID("Container3Android");
        gui_incomingserverprompt.setName("incomingserverprompt");
        gui_incomingserverprompt.addComponent(gui_passwordpromptincomingserver);
        gui_incomingserverprompt.addComponent(gui_incomingserverpassword);
        gui_passwordpromptincomingserver.setUIID("SpanLabel37Android");
        gui_passwordpromptincomingserver.setName("passwordpromptincomingserver");
        gui_incomingserverpassword.setUIID("SpanLabel37Android");
        gui_incomingserverpassword.setName("incomingserverpassword");
        addComponent(gui_outgoingserverprompt);
        gui_outgoingserverprompt.setUIID("Container3Android");
        gui_outgoingserverprompt.setName("outgoingserverprompt");
        gui_outgoingserverprompt.addComponent(gui_passwordpromptoutgoingserver);
        gui_outgoingserverprompt.addComponent(gui_useincomingserverpassword);
        gui_outgoingserverprompt.addComponent(gui_outgoingserverpassword);
        gui_passwordpromptoutgoingserver.setUIID("SpanLabel37Android");
        gui_passwordpromptoutgoingserver.setName("passwordpromptoutgoingserver");
        gui_useincomingserverpassword.setText("settings_import_use_incoming_server_password");
        gui_useincomingserverpassword.setUIID("CheckBox12Android");
        gui_useincomingserverpassword.setName("useincomingserverpassword");
        gui_outgoingserverpassword.setUIID("SpanLabel37Android");
        gui_outgoingserverpassword.setName("outgoingserverpassword");
        gui_passwordpromptintro.setUIID("SpanLabel37Android");
        gui_passwordpromptintro.setName("passwordpromptintro");
        gui_incomingserverprompt.setUIID("Container3Android");
        gui_incomingserverprompt.setName("incomingserverprompt");
        gui_outgoingserverprompt.setUIID("Container3Android");
        gui_outgoingserverprompt.setName("outgoingserverprompt");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}

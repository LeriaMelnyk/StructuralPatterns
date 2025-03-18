package adapter;

public class AdapterForWizard implements Communication {

    private WizardCommunication wizard;

    public AdapterForWizard(WizardCommunication wizard) {
        this.wizard = wizard;
    }

    public void sendMessage(String message) {
        wizard.castSpell(message);
    }

}

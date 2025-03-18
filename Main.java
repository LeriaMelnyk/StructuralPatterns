import adapter.AdapterForWizard;
import adapter.Communication;
import adapter.VampireCommunication;
import adapter.WizardCommunication;

public class Main {
    public static void main(String[] args) {

        Communication vampire = new VampireCommunication();
        Communication wizard = new AdapterForWizard(new WizardCommunication());

        vampire.sendMessage("Атака опівночі!");
        wizard.sendMessage("Захист фортеці!");
    }
}

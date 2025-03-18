package facade;

public class ClanFacade {
    private BloodBank bloodBank;
    private VampireArmy army;

    public ClanFacade() {
        this.bloodBank = new BloodBank();
        this.army = new VampireArmy();
    }

    public void manageClan() {
        bloodBank.manageBlood();
        army.trainArmy();
    }
}

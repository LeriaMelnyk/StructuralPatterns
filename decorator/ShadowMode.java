package decorator;


public class ShadowMode implements VampireAbility {
    private VampireAbility ability;

    public ShadowMode(VampireAbility ability) {
        this.ability = ability;
    }

    public void useAbility() {
        ability.useAbility();
        System.out.println("Вампір стає невидимим у тіні");
    }
}

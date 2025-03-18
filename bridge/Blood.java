package bridge;

public class Blood extends VampireAbility {

    public Blood(PowerSource powerSource) {
        super(powerSource);
    }
    public void useAbility() {
        System.out.println("Vampire use blood, resourse:" + powerSource.getPower());
    }
}

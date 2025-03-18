package bridge;

public class Speed extends VampireAbility {
    public Speed(PowerSource powerSource) {
        super(powerSource);
    }
    public void useAbility() {
        System.out.println("Vampire use speed, resourse:" + powerSource.getPower());
    }
}

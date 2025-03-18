package bridge;

abstract public class VampireAbility {
    protected PowerSource powerSource;

    public VampireAbility(PowerSource powerSource) {
        this.powerSource = powerSource;
    }

    public abstract void useAbility();
}

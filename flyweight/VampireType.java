package flyweight;

public class VampireType {
    private String type;

    public VampireType(String type) {
        this.type = type;
    }

    public void showType() {
        System.out.println("Тип вампіра: " + type);
    }
}

package composite;

public class LordVampire implements Vampire {
    public String name;

    public LordVampire(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("Lord is " + this.name);
    }


}

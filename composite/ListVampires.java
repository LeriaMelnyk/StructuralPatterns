package composite;

import java.util.ArrayList;

public class ListVampires implements Vampire {

    private ArrayList<Vampire> vampires=new ArrayList<>();

    public void addVampire(Vampire vampire) {
        vampires.add(vampire);
    }

    public void showName() {
        for (Vampire v : vampires) {
            v.showName();
        }
    }
}

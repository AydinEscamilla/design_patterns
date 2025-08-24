package strategy;

public class King extends Character {
    public King(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "__/^^^\\__\n" + name + " the King\n";
    }

}

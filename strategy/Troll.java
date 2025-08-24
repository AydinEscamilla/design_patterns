package strategy;

/**
 * Character class representing a troll
 * Extends from Character and overrides toString() to display ASCII art along with the name
 */
public class Troll extends Character {
    /**
     * Creates a troll with the given name
     * 
     * @param name is the name of the troll
     */
    public Troll(String name) {
        super(name);
    }

    /**
     * Returns a string representation of the troll (art and name)
     */
    @Override
    public String toString() {
        return "/^\\\n" + name + " the Troll\n";
    }

}

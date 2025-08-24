package strategy;

/**
 * Character class representing a knight
 * Extends from Character and overrides toString() to display ASCII art along with the name
 */
public class Knight extends Character {
    /**
     * Creates a knight with the given name
     * 
     * @param name is the name of the knight
     */
    public Knight(String name) {
        super(name);
    }

    /**
     * Returns a string representation of the knight (art and name)
     */
    @Override
    public String toString() {
        return " __\n" + "(--)\n" + name + " the Knight\n";
    }

}

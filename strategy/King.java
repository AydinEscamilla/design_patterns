package strategy;

/**
 * Character class representing a king
 * Inherits from Character and overrides toString() to display ASCII art along with the name
 */
public class King extends Character {
    /**
     * Creates a king with the given name
     * 
     * @param name is the name of the king
     */
    public King(String name) {
        super(name);
    }

    /**
     * Returns a string representation of the king (art and name)
     */
    @Override
    public String toString() {
        return "__/^^^\\__\n" + name + " the King\n";
    }

}

/**
 * Author: Aydin Escamilla
 * CSCE247
 */

package decorator;

import java.util.ArrayList;

/**
 * {@code IceCream} is the abstract base class for all components
 * 
 * Shared state and behavior for cones and scoops
 * To include ASCII art and scoop # tracking
 * Subclasses apply their own art and can override, it's just a skeleton for what the art builds into
 */
public abstract class IceCream {
    /**
     * Visual representation via ASCII art
     * Each element is one line of the final product
     */
    protected ArrayList<String> asciiArt = new ArrayList<>();

    /**
     * Number of scoops per ice cream
     */
    protected int numScoops;

    /** 
     * Globally tracks the amount of ice cream total across all flavors
     */
    protected static int globalScoopCount = 0;

/**
 * Builds and returns a formatted string for the ice cream
 * Each line of ASCII is centered relative to the widest line
 * 
 * @return a string containing the centered ASCII art
 */
@Override
public String toString() {

    ArrayList<String> fullArt = new ArrayList<>(asciiArt);

    int maxWidth = 0;
    for (String line : fullArt) {
        if (line.length() > maxWidth) {
            maxWidth = line.length();
        }
    }

    StringBuilder sb = new StringBuilder();
    for (String line : fullArt) {
        int padding = (maxWidth - line.length()) / 2;
        sb.append(" ".repeat(padding)).append(line).append("\n");
    }

    return sb.toString();
}

}
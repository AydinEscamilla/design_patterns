/**
 * Author: Aydin Escamilla
 * CSCE247
 */

package decorator;

import java.util.ArrayList;

/**
 * Abstract base class representing the ice cream as a whole
 * Provides structure for handling the ASCII art as well as the scoops in general
 */
public abstract class IceCream {
    /**
     * Visual representation via ASCII art
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

@Override
public String toString() {

    ArrayList<String> fullArt = new ArrayList<>(asciiArt);

    int maxWidth = 0;
    for (String line : fullArt) {
        if (line.length() > maxWidth) {
            maxWidth = line.length();
        }
    }

    // Build centered output
    StringBuilder sb = new StringBuilder();
    for (String line : fullArt) {
        int padding = (maxWidth - line.length()) / 2;
        sb.append(" ".repeat(padding)).append(line).append("\n");
    }

    return sb.toString();
}


}

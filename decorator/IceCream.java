/**
 * Author: Aydin Escamilla
 * CSCE247
 */

package decorator;

import java.util.ArrayList;

public abstract class IceCream {
    protected ArrayList<String> asciiArt = new ArrayList<>();
    protected int numScoops;
    protected static int globalScoopCount = 0;

@Override
public String toString() {
    // Combine scoops and cone into one structure
    ArrayList<String> fullArt = new ArrayList<>(asciiArt);

    // If the cone is stored separately, make sure it's appended here
    // Example (if your Cone adds its lines later):
    // fullArt.addAll(cone.getAsciiArt());

    // Find the widest line across scoops + cone
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

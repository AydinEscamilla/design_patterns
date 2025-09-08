/**
 * Author: Aydin Escamilla
 * CSCE247
 */
package decorator;

/**
 *{@code Cone} extends {@link IceCream} and represents the base of an ice cream.
 * It provides the foundational ASCII art for the cone and starts with zero scoops.
 * It also doesn't change even for < 6 scoops
 */
public class Cone extends IceCream {

    /**
     * Creates the {@code Cone} object
     * 
     * Initializes the ASCII art with a cone shape and sets {@link #numScoops} to {@code 0}
     * This is so flavor scoops can be added later
     */
    public Cone() {
    this.asciiArt = FileReader.getLines("decorator/txt/cone.txt");
    for (int i = 0; i < asciiArt.size(); i++) {
        String line = asciiArt.get(i);
        asciiArt.set(i, Colors.BROWN + line + Colors.RESET);
    }
    globalScoopCount = 0;
    }


    /**
     * Builds and returns a formatted string for the cone representation
     * 
     * The cone is centered based on the width of other components
     * Elements are visually aligned with spaces to pad emptiness
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        int maxScoopWidth = (globalScoopCount == 0 ? 2 : (globalScoopCount - 1) * 2 + 2);

        int coneMaxWidth = 0;
        for (String line : asciiArt) {
            coneMaxWidth = Math.max(coneMaxWidth, line.trim().length());
        }

        int totalWidth = Math.max(maxScoopWidth, coneMaxWidth);

        for (String line : asciiArt) {
            String raw = line.trim();
            int spaces = (totalWidth - raw.length()) / 2;
            sb.append(" ".repeat(Math.max(0, spaces))).append(raw).append("\n");
        }

        return sb.toString();
    }
}

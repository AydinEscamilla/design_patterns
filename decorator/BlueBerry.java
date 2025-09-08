/**
 * Author: Aydin Escamilla
 * CSCE247
 */
package decorator;

/**
 * {@code BlueBerry} extends {@link ScoopDecorator} and represents scoops of the blueberry flavor
 * 
 * Each scoop is constructed and drawn in this class, tinted with a color from Colors.java, and built onto the cone
 */
public class BlueBerry extends ScoopDecorator {

    /**
     * Constructs a new {@code BlueBerry} decorator
     * 
     * Initializes ASCII for BB scoops and applies the correct color before appending
     * 
     * @param iceCream is the ice cream to decorate
     * @param numScoops is the number of BB scoops to add
     */
    public BlueBerry(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
    }

    /**
     * Builds and returns a string for the ice cream 
     * Blueberry scoops are stacked on top of the wrapped ice cream
     * 
     * @return centered ASCII art for the BB flavor
     */
    @Override
    protected void addScoops() {
        int indent = coneIndent();
        for (int i = 0; i < numFlavorScoops; i++) {
            int size = globalScoopCount * 2;
            String scoopCore = "(" + "-".repeat(size) + ")";
            asciiArt.add(" ".repeat(size));
            asciiArt.add(globalScoopCount, " ".repeat(indent) + Colors.BLUE + scoopCore + Colors.RESET);
            globalScoopCount++;
        }
    }
}

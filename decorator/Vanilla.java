/**
 * Author: Aydin Escamilla
 * CSCE247
 */
package decorator;

/**
 * {@code Vanilla} extends {@link ScoopDecorator} and represents vanilla scoops in specific to add
 * 
 * Each scoop is drawn from the addScoops method, then tinted white from {@link Colors}
 */
public class Vanilla extends ScoopDecorator {

    /**
     * Constructs a new {@code Vanilla} decorator
     * 
     * Initializes the ASCII art for vanilla, applies the color, and appends them to the ice cream
     * 
     * @param iceCream is the ice cream to decorate
     * @param numScoops is the number of vanilla scoops specifically
     */
    public Vanilla(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
    }

    /**
     * Builds a string representation of the ice cream with vanilla scoops
     * 
     * @return centered ASCII art for the vanilla
     */
    @Override
    protected void addScoops() {
        int indent = coneIndent();
        for (int i = 0; i < numFlavorScoops; i++) {
            int size = globalScoopCount * 2;
            String scoopCore = "(" + "-".repeat(size) + ")";
            asciiArt.add(" ".repeat(size));
            asciiArt.add(globalScoopCount, " ".repeat(indent) + Colors.WHITE + scoopCore + Colors.RESET);
            globalScoopCount++;
        }
    }
}

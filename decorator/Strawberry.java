/**
 * Author: Aydin Escamilla
 * CSCE247
 */
package decorator;

/**
 * {@code Strawberry} extends {@link ScoopDecorator} and represents strawberry scoops specficially
 * 
 * Each scoop is drawn from the pattern addScoops and made to be the red color found in {@link Colors}
 */
public class Strawberry extends ScoopDecorator {

    /**
     * Constructs a new {@code Strawberry} decorator
     * 
     * Initializes the ASCII art, applies the color, appends
     * 
     * @param iceCream is the ice cream to decorate
     * @param numScoops is the # of scoops for strawberry specifically
     */
    public Strawberry(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
    }

    /**
     * Builds and returns a string representation of the ice cream (stacking on former {@code IceCream})
     * 
     * @return centered ASCII art for the strawberry
     */
    @Override
    protected void addScoops() {
        int indent = coneIndent();
        for (int i = 0; i < numFlavorScoops; i++) {
            int size = globalScoopCount * 2;
            String scoopCore = "(" + "-".repeat(size) + ")";
            asciiArt.add(" ".repeat(size));
            asciiArt.add(globalScoopCount, " ".repeat(indent) + Colors.RED + scoopCore + Colors.RESET);
            globalScoopCount++;
        }
    }
}

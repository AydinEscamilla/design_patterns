/**
 * Author: Aydin Escamilla
 * CSCE247
 */
package decorator;

public class BlueBerry extends ScoopDecorator {

    public BlueBerry(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
    }

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

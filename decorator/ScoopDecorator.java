/**
 * Author: Aydin Escamilla
 * CSCE247
 */
package decorator;

import java.util.ArrayList;

public abstract class ScoopDecorator extends IceCream {
    protected IceCream iceCream;
    protected int numFlavorScoops;

    public ScoopDecorator(IceCream iceCream, int numScoops) {
        this.iceCream = iceCream;
        this.numFlavorScoops = numScoops;
        this.asciiArt = new ArrayList<>(iceCream.asciiArt);
        addScoops();
    }

    protected int coneIndent() {
        if (asciiArt.isEmpty()) return 0;
        String line = asciiArt.get(0);
        int i = 0;
        while (i < line.length() && line.charAt(i) == ' ') i++;
        return i;
    }

    protected void addScoops() {
    for (int i = 0; i < numFlavorScoops; i++) {
        int size = globalScoopCount * 2;
        String scoopCore = "(" + "-".repeat(size) + ")";
        asciiArt.add(globalScoopCount, Colors.BLUE + scoopCore + Colors.RESET);
        globalScoopCount++;
    }
}

}

/**
 * Author: Aydin Escamilla
 * CSCE247
 */
package decorator;

import java.util.ArrayList;

/**
 * {@code ScoopDecorator} extends {@link IceCream} to represent a scoop
 * 
 * This class is the abstract base for all flavor decorators (vanilla, BB, strawberry)
 */
public abstract class ScoopDecorator extends IceCream {
    
    /**
     * Ice cream instance being decorated
     * Number of scoops of the flavor in-progress
     */
    protected IceCream iceCream;
    protected int numFlavorScoops;

    /**
     * Constructs a new {@code ScoopDecorator}
     * 
     * @param iceCream is the ice cream to decorate
     * @param numScoops is the number of scoops to add for this flavor
     */
    public ScoopDecorator(IceCream iceCream, int numScoops) {
        this.iceCream = iceCream;
        this.numFlavorScoops = numScoops;
        this.asciiArt = new ArrayList<>(iceCream.asciiArt);
        addScoops();
    }

    /**
     * Determines how far the cone is indented
     * 
     * Accomplished by scanning the first line of the cone and counting leading spaces
     * 
     * @return the number of leading spaces in the first cone line
     */
    protected int coneIndent() {
        if (asciiArt.isEmpty()) return 0;
        String line = asciiArt.get(0);
        int i = 0;
        while (i < line.length() && line.charAt(i) == ' ') i++;
        return i;
    }

    /**
     * Adds the specified number of scoops for this flavor
     * 
     * EAch scoop is drawn here with a dash pattern wrapped in parentheses, colored accordingly
     * Scoops are then stacked in order and {@code globalScoopCount} is incremented
     */
    protected void addScoops() {
    for (int i = 0; i < numFlavorScoops; i++) {
        int size = globalScoopCount * 2;
        String scoopCore = "(" + "-".repeat(size) + ")";
        asciiArt.add(globalScoopCount, Colors.BLUE + scoopCore + Colors.RESET);
        globalScoopCount++;
    }
}

}

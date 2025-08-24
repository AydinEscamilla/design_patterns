package strategy;

/**
 * A weapon that represents a knife (held or thrown, doesn't really matter)
 * This weapon animates a knife shifting across the screen
 * Extends WeaponBehavior and overrides attack() to animate
 * The animation speed is controlled by the speed inherited from WeaponBehavior
 */
public class WeaponKnife extends WeaponBehavior {
    
    /**
     * Creates WeaponKnife with a slow animation speed as denoted by 100ms between frames
     */
    public WeaponKnife() {
        super(100);
    }

    /**
     * Executes the attack animation for the knife
     * The attack prints a knife that goes across the screen but leaves no origin (like the bow) or trail (like the stars)
     * The animation runs slowly because of the high speed value of 100ms
     */
    @Override
    public void attack() {
        System.out.println("Stabs with a knife!");
        String knife = "-]--";

        for (int i = 0; i < 80; i++) {
            System.out.print("\r" + " ".repeat(i) + knife);
            Resources.sleep(speed);
        }

        System.out.println();
        Resources.sleep(1000);
        Resources.clear();
    }
}
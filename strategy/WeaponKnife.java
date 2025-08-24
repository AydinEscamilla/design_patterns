package strategy;

/**
 * A weapon that represents a knife (held or thrown, doesn't really matter)
 * This weapon animates a knife shifting across the screen
 * The animation speed is controlled by the speed inherited from WeaponBehavior
 */
public class WeaponKnife extends WeaponBehavior {
    
    /**
     * Creates WeaponKnife with a slow animation speed
     */
    public WeaponKnife() {
        super(100);
    }

    /**
     * Executes the attack animation for the knife
     * The attack prints a knife that goes across the screen
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
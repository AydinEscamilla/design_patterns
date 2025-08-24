package strategy;

/**
 * A weapon class that represents, well, a lack of a weapon
 * 
 * Extends WeaponBehavior but will not have an attack animation (outputting a message instead)
 */
public class WeaponNone extends WeaponBehavior {
    
    /**
     * Creates a new WeaponNone with a default speed (unused for this class in specific, still here for the UML)
     */
    public WeaponNone() {
        super(5); 
    }

    /**
     * Executes the attack action for no weapon
     * 
     * As stated above, this will not have any kind of animation, it just prints a message
     * The message states that a character with no weapon will not attack
     * (I'd use bare hands personally but oh well)
     */
    @Override
    public void attack() {
        System.out.println("I cannot attack with no weapon...");
        Resources.sleep(4000);
        Resources.clear();
    }
}


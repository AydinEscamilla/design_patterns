package strategy;

/**
 * Abstract base class for all weapon behaviors
 * Each weapon will define it's own attack pattern, inheriting speed but self-clarifying
 * attack() is used for unique animations
 */
public abstract class WeaponBehavior {
    /**
     * Instantiating speed
     * A lower speed is actually a faster animation due to having a lower delay
     */
    protected int speed;

    /**
     * Creates a specific animation speed
     * 
     * @param speed the delay in milliseconds for the frame-by-frame animation
     */
    public WeaponBehavior(int speed) {
        this.speed = speed;
    }

    /**
     * Executes the attack animation
     * Animation is defined within each weapon class via override
     */
    public abstract void attack();
}

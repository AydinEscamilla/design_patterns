package strategy;

/**
 * A weapon that represents throwing stars
 * This weapon animates a growing trail of stars across the screen
 * Extends WeaponBehavior and overrides attack() to animate
 * The animation speed is controlled by the speed inherited from WeaponBehavior
 */
public class WeaponStars extends WeaponBehavior {

    /**
     * Creates WeaponStars with a fast animation speed as denoted by 50ms between frames
     */
    public WeaponStars() {
        super(50);
    }

    /**
     * Executes the attack animation for throwing stars
     * The attack prints a line of stars that grows horizontally, leaving a trail
     * The animation runs quickly because of the low speed value of 50ms
     */
    @Override
    public void attack() {
        System.out.println("Throws sharp stars at the enemy!");
        StringBuilder trail = new StringBuilder();

        for (int i = 0; i < 80; i++) {
            trail.append("*");
            System.out.print("\r" + trail.toString());
            Resources.sleep(speed);
        }

        System.out.println();
        Resources.sleep(1000);
        Resources.clear();
    }
}

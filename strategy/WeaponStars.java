package strategy;

/**
 * A weapon that represents throwing stars (are these considered medieval...?)
 * This weapon animates a growing trail of stars across the screen
 * The animation speed is controlled by the speed inherited from WeaponBehavior
 */
public class WeaponStars extends WeaponBehavior {

    /**
     * Creates WeaponStars with a fast animation speed
     */
    public WeaponStars() {
        super(50);
    }

    /**
     * Executes the attack animation for throwing stars
     * The attack prints a line of stars that grows horizontally
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

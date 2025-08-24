package strategy;

/**
 * A weapon that represents a bow and arrow
 * This weapon animates a bow firing an arrow across the screen
 * Extends WeaponBehavior and overrides attack() to animate
 * The animation speed is controlled by the speed inherited from WeaponBehavior
 */
public class WeaponBow extends WeaponBehavior {
    /**
     * Creates WeaponBow with a medium animation speed as denoted by 75ms between frames
     */
    public WeaponBow() {
        super(75);
    }

    /**
     * Executes the attack animation for a bow
     * The attack prints a bow and then fires an arrow that travels as the knife does, leaving no trail, but the bow remains static
     * The animation runs at a medium pace because of the middling speed value of 75ms
     */
    @Override
    public void attack() {
        System.out.println("Shoots an arrow with a bow!");
        String bow = ")";
        String arrow = "-->";

        System.out.print(bow);
        for (int i = 0; i < 80; i++) {
            System.out.print("\r" + bow + " ".repeat(i) + arrow);
            Resources.sleep(speed);
        }

        System.out.println();
        Resources.sleep(1000);
        Resources.clear();
    }
}
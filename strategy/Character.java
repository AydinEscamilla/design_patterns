package strategy;

/**
 * Abstract base class for all character choices
 * Character has a name and can be assigned a WeaponBehavior
 * Subclasses provide unique titles and representations
 */
public abstract class Character {
    /**
     * Instantiating he name of the character
     */
    protected String name;

    /**
     * Weapon behavior assigned to the character in question, determining their attack
     */
    protected WeaponBehavior weaponBehavior;

    /** 
     * Creates a character with the given name
     * 
     * @param name is the name of the character
     */
    public Character(String name) {
        this.name = name;
    }

    /**
     * Sets the weapon behavior
     * 
     * @param weaponBehavior is the weapon assigned to the character
     */
    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    /**
     * Executes an attack using the currently assigned behavior
     * Uses the set weapon, or displays a message if no set weapon is found
     */
    public void attack() {
        if (weaponBehavior != null) {
            System.out.print(name + " attacks: ");
            weaponBehavior.attack();
        } else {
            System.out.println(name + " has no weapon to attack with!");
        }
    }

    /**
     * Returns a string representation of the character (class and name)
     */
    @Override
    public String toString() {
        return name + " the " + this.getClass().getSimpleName();
    }
}

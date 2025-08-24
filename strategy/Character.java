package strategy;

public abstract class Character {
    protected String name;
    protected WeaponBehavior weaponBehavior;

    public Character(String name) {
        this.name = name;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void attack() {
        if (weaponBehavior != null) {
            System.out.print(name + " attacks: ");
            weaponBehavior.attack();
        } else {
            System.out.println(name + " has no weapon to attack with!");
        }
    }

    @Override
    public String toString() {
        return name + " the " + this.getClass().getSimpleName();
    }
}

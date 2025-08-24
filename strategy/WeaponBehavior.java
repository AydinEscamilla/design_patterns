package strategy;

public abstract class WeaponBehavior {
    protected int speed;

    public WeaponBehavior(int speed) {
        this.speed = speed;
    }

    public abstract void attack();
}

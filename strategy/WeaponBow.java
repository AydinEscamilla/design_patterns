package strategy;

public class WeaponBow implements WeaponBehavior {
    @Override
    public void attack() {
        System.out.println("Shoots an arrow with a bow!");
    }
}

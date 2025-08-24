package strategy;

public class WeaponNone implements WeaponBehavior {
    @Override
    public void attack() {
        System.out.println("Fights with bare hands!");
    }
}

package strategy;

public class WeaponStars implements WeaponBehavior {
    @Override
    public void attack() {
        System.out.println("Throws sharp stars at the enemy!");
    }
}

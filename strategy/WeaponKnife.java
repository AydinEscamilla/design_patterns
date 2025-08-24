package strategy;

public class WeaponKnife implements WeaponBehavior {
    @Override
    public void attack() {
        System.out.println("Stabs swiftly with a knife!");
    }
}

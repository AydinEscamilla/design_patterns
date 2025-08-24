package strategy;

public class WeaponNone extends WeaponBehavior {
    public WeaponNone() {
        super(5); 
    }

    @Override
    public void attack() {
        System.out.println("I cannot attack with no weapon...");
        Resources.sleep(1500);
        Resources.clear();
    }
}


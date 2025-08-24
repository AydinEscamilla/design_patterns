package strategy;

public class WeaponStars extends WeaponBehavior {
    public WeaponStars() {
        super(5);
    }

    @Override
    public void attack() {
        System.out.println("Throws sharp stars at the enemy!");
        StringBuilder trail = new StringBuilder();
        
        for (int i = 0; i < 60; i++) {
            trail.append("*");
            System.out.print("\r" + trail.toString());
            Resources.sleep(80);
        }

        System.out.println();
        Resources.sleep(1000);
        Resources.clear();
    }
}

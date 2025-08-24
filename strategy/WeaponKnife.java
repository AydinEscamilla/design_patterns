package strategy;

public class WeaponKnife extends WeaponBehavior {
    public WeaponKnife() {
        super(5);
    }

    @Override
    public void attack() {
        System.out.println("Stabs swiftly with a knife!");
        String knife = "-]--";

        for (int i = 0; i < 80; i++) {
            System.out.print("\r" + " ".repeat(i) + knife);
            Resources.sleep(50);
        }

        System.out.println();
        Resources.sleep(1000);
        Resources.clear();
    }
}

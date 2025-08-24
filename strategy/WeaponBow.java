package strategy;

public class WeaponBow extends WeaponBehavior {
    public WeaponBow() {
        super(5);
    }

    @Override
    public void attack() {
        System.out.println("Shoots an arrow with a bow!");
        String bow = ")";
        String arrow = "-->";

        System.out.print(bow);
        for (int i = 0; i < 80; i++) {
            System.out.print("\r" + bow + " ".repeat(i) + arrow);
            Resources.sleep(50);
        }

        System.out.println();
        Resources.sleep(1000);
        Resources.clear();
    }
}

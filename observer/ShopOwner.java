package observer;

public class ShopOwner implements Observer {

    public ShopOwner(Subject watchman, Subject greeter) {
        watchman.registerObserver(this);
        greeter.registerObserver(this);
    }

    @Override
    public void update(boolean warning, int note) {
        switch (note) {
            case 1:
                System.out.println("Shop Owner: Add finest displays in shop window to attract the messenger's attention.");
                break;
            case 2:
                System.out.println("Shop Owner: Make way for a formal greeting on the street.");
                break;
            case 3:
                System.out.println("Shop Owner: Drops everything and find nearest hideout.");
                break;
            case 4:
                System.out.println("Shop Owner: Sound the alarm! Escape through the back exit.");
                break;
        }
    }
}

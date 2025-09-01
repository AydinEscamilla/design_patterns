package observer;

/**
 * {@code ShopOwner} implements the interface {@link Observer} and responds to notifications from
 * the Watchman and Greeter
 * 
 * Each notification will elicit a different reaction in relation to the situation
 * (i.e. alluring a messenger, or running)
 */
public class ShopOwner implements Observer {

    /**
     * Creates a new ShopOwner to register as an observer next to Watchman and Greeter
     * 
     * @param watchman is the subject representing the Watchman
     * @param greeter is the subject representing the Greeter
     */
    public ShopOwner(Subject watchman, Subject greeter) {
        watchman.registerObserver(this);
        greeter.registerObserver(this);
    }

    /**
     * Updates the ShopOwner from the given note, reacting to different situations with
     * different responses
     * 
     * @param warning a boolean; true if the update is a warning, false otherwise
     * @param note is the number representing the notification (passing information)
     */
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

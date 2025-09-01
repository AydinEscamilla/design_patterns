package observer;

/**
 * {@code Knight} implements the interface found at {@link Observer}, also reacting to notifications
 * from {@link Subject}.
 * 
 * Each notification corresponds to a note, and each note corresponds to the Knight taking a specific action.
 */
public class Knight implements Observer {

    /**
     * Creates a Knight (registered as an observer with the Watchman and Greeter)()
     * 
     * @param watchman is the subject representing the Watchman
     * @param greeter is the subject representing the Greeter
     */
    public Knight(Subject watchman, Subject greeter) {
        watchman.registerObserver(this);
        greeter.registerObserver(this);
    }

    /**
     * Updates the Knight's information from the note provided, altering their reaction
     * 
     * @param warning is a boolean; registers as true if the note does correlate to a warning
     * @param note is a number representing the specific situation
     */
    @Override
    public void update(boolean warning, int note) {
        switch (note) {
            case 1:
                System.out.println("Knight: Meet the messenger and direct them to the castle.");
                break;
            case 2:
                System.out.println("Knight: Gather the chariot for a formal entry.");
                break;
            case 3:
                System.out.println("Knight: Prepares for battle.");
                break;
            case 4:
                System.out.println("Knight: Defend the castle to the last man!");
                break;
        }
    }
}

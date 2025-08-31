package observer;

public class Knight implements Observer {

    public Knight(Subject watchman, Subject greeter) {
        watchman.registerObserver(this);
        greeter.registerObserver(this);
    }

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

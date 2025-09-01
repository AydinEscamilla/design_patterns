package observer;

/**
 * {@code Teacher} implements {@link Observer} as well in addition to the Knight and ShopOwner
 * Also similarly responds to notifications passed by the Watchman and Greeter
 * 
 * The teacher will also take different actions based on the notification received (but realistically
 * they are written as an extension of the schoolhouse itself, since their prompts correlate to students)
 */
public class Teacher implements Observer {

    /**
     * Creates a new Teacher to register as an observer, alongside the Watchman and Greeter
     * 
     * @param watchman subject that represents the Watchman
     * @param greeter subject representing the Greeter
     */
    public Teacher(Subject watchman, Subject greeter) {
        watchman.registerObserver(this);
        greeter.registerObserver(this);
    }

    /**
     * Updates the Teacher from the given note, causing them to react differently based on 
     * what the note tells the Teacher (again though, moreso saying what they should do with the class)
     */
    @Override
    public void update(boolean warning, int note) {
        switch (note) {
            case 1:
                System.out.println("Teacher: Engages children in an activity so they do not get distracted.");
                break;
            case 2:
                System.out.println("Teacher: Gathers children, and makes way for a formal greeting on the street.");
                break;
            case 3:
                System.out.println("Teacher: Brings all students to the underground shelter.");
                break;
            case 4:
                System.out.println("Teacher: Protect the children and lead them to safety.");
                break;
        }
    }
}

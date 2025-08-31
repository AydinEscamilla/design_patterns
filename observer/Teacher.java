package observer;

public class Teacher implements Observer {

    public Teacher(Subject watchman, Subject greeter) {
        watchman.registerObserver(this);
        greeter.registerObserver(this);
    }

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

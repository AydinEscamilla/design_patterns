package observer;

import java.util.ArrayList;

/** 
 * The {@code Subject} class keeps a list of observers and issues notices as necessary.
 * Generally is the base abstract class for concrete subjects
 */
public abstract class Subject {
    /** 
     * List of registered observers
     */
    protected ArrayList<Observer> observers;

    /**
     * Creates a subject with no registered observers
     */
    public Subject() {
        observers = new ArrayList<>();
    }

    /**
     * Registerws a new observer
     * 
     * @param observer is the observer to be added
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer priorly registered
     * 
     * @param observer is the observer to be removed
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Issues a notice to all observers
     * 
     * @param note is a number associated with the notification giving information
     */
    public void issueNotice(int note) {
        notifyObservers(note);
    }

    /**
     * Notifies registered observers
     * 
     * @param note is a number associated with the notification
     */
    public void notifyObservers(int note) {
        for (Observer o : observers) {
            boolean warning = (note != 0);
            o.update(warning, note);
        }
    }
}

package observer;

import java.util.ArrayList;

public abstract class Subject {
    protected ArrayList<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void issueNotice(int note) {
        notifyObservers(note);
    }

    public void notifyObservers(int note) {
        for (Observer o : observers) {
            boolean warning = (note != 0); // if note is not 0, it’s a warning
            o.update(warning, note);
        }
    }
}

package observer;

public class Greeter extends Subject {
    @Override
    public void issueNotice(int note) {
        // For Greeter: note is already 1 (Messenger) or 2 (Royalty)
        System.out.println("Trumpet fanfair is sounded " + note + " time(s).");
        super.issueNotice(note);
    }

    @Override
    public void notifyObservers(int note) {
        super.notifyObservers(note);
    }
}
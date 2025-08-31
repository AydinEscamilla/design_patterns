package observer;

public class Greeter extends Subject {
    @Override
    public void issueNotice(int note) {
        // note is already 1 (Messenger) or 2 (Royalty)
        System.out.println("Trumpet fanfare is sounded " + note + " time(s).");

        Trumpet.play(false, note); // play fanfare note times

        super.issueNotice(note);
    }


    @Override
    public void notifyObservers(int note) {
        super.notifyObservers(note);
    }
}
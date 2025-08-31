package observer;

public class Watchman extends Subject {
    @Override
    public void issueNotice(int note) {
        int mappedNote;

        if (note == 1) {
            mappedNote = 3; // Army
            System.out.println("Trumpet is honked 1 time(s).");
            Trumpet.play(true, 1); // honk once
        } else if (note == 2) {
            mappedNote = 4; // Breach
            System.out.println("Trumpet is honked 2 time(s).");
            Trumpet.play(true, 2); // honk twice
        } else {
            mappedNote = note; // fallback
            System.out.println("Trumpet is honked " + note + " time(s).");
            Trumpet.play(true, note); // honk N times
        }

        super.issueNotice(mappedNote);
    }


    @Override
    public void notifyObservers(int note) {
        super.notifyObservers(note);
    }
}

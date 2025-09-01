package observer;

/**
 * The {@code Watchman} class extends {@link Subject}. It issues warnings using the trumpet.wav sound file.
 * Different notes are different notifications, but Watchman only plays the one audio file (either once or twice).
 */
public class Watchman extends Subject {
    @Override
    public void issueNotice(int note) {
        int mappedNote;

        if (note == 1) {
            mappedNote = 3;
            System.out.println("Trumpet is honked 1 time(s).");
            Trumpet.play(true, 1);
        } else if (note == 2) {
            mappedNote = 4;
            System.out.println("Trumpet is honked 2 time(s).");
            Trumpet.play(true, 2);
        } else {
            mappedNote = note;
            System.out.println("Trumpet is honked " + note + " time(s).");
            Trumpet.play(true, note);
        }

        super.issueNotice(mappedNote);
    }


    @Override
    public void notifyObservers(int note) {
        super.notifyObservers(note);
    }
}

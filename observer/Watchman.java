package observer;

public class Watchman extends Subject {
    @Override
    public void issueNotice(int note) {
        int mappedNote;

        if (note == 1) {
            // TownDriver passes 1 → Army (option 3)
            mappedNote = 3;
            System.out.println("Trumpet is honked 1 time(s).");
        } else if (note == 2) {
            // TownDriver passes 2 → Breach (option 4)
            mappedNote = 4;
            System.out.println("Trumpet is honked 2 time(s).");
        } else {
            mappedNote = note; // safety fallback
            System.out.println("Trumpet is honked " + note + " time(s).");
        }

        super.issueNotice(mappedNote);
    }

    @Override
    public void notifyObservers(int note) {
        super.notifyObservers(note);
    }
}

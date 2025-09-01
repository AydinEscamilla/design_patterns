package observer;

/** 
 * {@code Greeter} extends {@link Subject} and takes care of passing notices to Observers
 * It also demonstrates the use of Observer by taking what is observed and responding with fanfare
 */
public class Greeter extends Subject {
    /**
     * Issues a notice to observers and plays an appropriate fanfare for options 1 and 2
     * 
     * @param note is the number of times fanfare is played
     */
    @Override
    public void issueNotice(int note) {
       
        System.out.println("Trumpet fanfare is sounded " + note + " time(s).");

        Trumpet.play(false, note);

        super.issueNotice(note);
    }

    /**
     * Notifies registered observers with the appropriate note
     * 
     * @param note is the number associated with the notification
     */
    @Override
    public void notifyObservers(int note) {
        super.notifyObservers(note);
    }
}
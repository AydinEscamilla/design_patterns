package observer;

/**
 * The {@code Observer} interface lays out the format for classes wanting to receive updates
 * from {@link Subject} 
 */
public interface Observer {

    /**
     * Updates the observer with the provided warning and note
     * 
     * @param warning boolean with a value of true when there is a warning, otherwise a value of false
     * @param note is the number associated with the notification
     */
    void update(boolean warning, int note);
}

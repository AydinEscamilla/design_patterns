/**
 * Author: Aydin Escamilla
 * CSCE247
 */

package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Implements iterator to traverse song
 * objects stored in an {@link Album} sequentially from beginning to end.
 */
public class InOrderIterator implements Iterator<Song> {
    private Song[] songs;
    private int position;
    private int count;

    /**
     * Creates an InOrderIterator for traversing an array of song objects
     * 
     * @param songs is the array of Song objects to iterate through
     */
    public InOrderIterator(Song[] songs, int count) {
        this.songs = songs;
        this.count = count;
        this.position = 0;
    }

    /**
     * Checks if another song exists in the sequence
     * 
     * @return true if more Songs remain in the iteration, false otherwise
     */
    @Override
    public boolean hasNext() {
        return position < count && songs[position] != null;
    }

    
    /**
     * Retrieves the next song in sequential order
     * 
     * @return the next Song in the Album sequence
     */
    @Override
    public Song next() {
        if (!hasNext()) throw new NoSuchElementException();
        return songs[position++];
    }
}

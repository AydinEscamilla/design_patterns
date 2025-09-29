/**
 * Author: Aydin Escamilla
 * CSCE247
 */

package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

/**
 * Implements iterator to traverse song
 * objects in an {@link Album} randomly using a {@link Random} generator.
 */
public class ShuffleIterator implements Iterator<Song> {
    private Song[] songs;
    private int[] order;
    private int position;
    private int count;
    private Random rand;

    /**
     * Creates a ShuffleIterator for randomly traversing an array of song objects
     * 
     * @param songs is the array of Song objects to iterate through randomly
     */
    public ShuffleIterator(Song[] songs, int count) {
        this.songs = songs;
        this.count = count;
        this.order = new int[count];
        this.rand = new Random();

        // Initialize and shuffle order
        for (int i = 0; i < count; i++) {
            order[i] = i;
        }
        for (int i = 0; i < count; i++) {
            int j = rand.nextInt(count);
            int temp = order[i];
            order[i] = order[j];
            order[j] = temp;
        }

        this.position = 0;
    }

    /**
     * Checks if another song is available for random iteration
     * 
     * @return true if more Songs remain for random selection, false otherwise
     */
    @Override
    public boolean hasNext() {
        return position < count;
    }

    /**
     * Retrieves the next song at random
     * 
     * @return a randomly selected Song from the Album
     */
    @Override
    public Song next() {
        if (!hasNext()) throw new NoSuchElementException();
        return songs[order[position++]];
    }
}


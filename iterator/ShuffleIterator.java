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
    private Random rand;

    /**
     * Creates a ShuffleIterator for randomly traversing an array of song objects
     *
     * @param songs is the array of Song objects to iterate through randomly
     */
    public ShuffleIterator(Song[] songs) {
        // copy valid songs
        this.songs = new Song[songs.length];
        for (int i = 0; i < songs.length; i++) {
            this.songs[i] = songs[i];
        }

        // shuffle in place
        this.rand = new Random();
        for (int i = 0; i < this.songs.length; i++) {
            int j = rand.nextInt(this.songs.length);
            Song temp = this.songs[i];
            this.songs[i] = this.songs[j];
            this.songs[j] = temp;
        }
    }

    @Override
    public boolean hasNext() {
        return songs.length > 0;
    }

    @Override
    public Song next() {
        if (!hasNext()) throw new NoSuchElementException();

        // take the last song and shrink the array by one
        Song nextSong = songs[songs.length - 1];
        Song[] newSongs = new Song[songs.length - 1];
        for (int i = 0; i < newSongs.length; i++) {
            newSongs[i] = songs[i];
        }
        songs = newSongs;

        return nextSong;
    }
}

/**
 * Author: Aydin Escamilla
 * CSCE247
 */

package iterator;

import java.util.Iterator;

/**
 * {@code Album} holds a collection of {@link Song} objects and provides iterators
 * for traversing them in order or randomly at request
 * 
 * Album is defined by album name, and songs can be added
 */
public class Album {
    private Song[] songs;
    private int count;
    private String name;

    /**
     * Creates an Album with a specific name
     * 
     * @param name is the String title of the Album
     */
    public Album(String name) {
        this.name = name;
        this.songs = new Song[5]; // default capacity = 5
        this.count = 0;
    }

    /**
     * Adds a {@link Song} to the Album with the given details
     * 
     * @param name is the name of the Song
     * @param artist is the artist performing the Song
     * @param length is the duration of the Song in minutes
     * @param genre is the {@link Genre} classification of the Song
     * @return true if the Song is successfully added, false otherwise
     */
    public boolean addSong(String name, String artist, double length, Genre genre) {
        if (count == songs.length) {
            // double capacity
            Song[] newSongs = new Song[songs.length * 2];
            for (int i = 0; i < songs.length; i++) {
                newSongs[i] = songs[i];
            }
            songs = newSongs;
        }
        songs[count++] = new Song(name, artist, length, genre);
        return true;
    }

    /**
     * Creates an {@link InOrderIterator} to traverse Songs in sequential order
     * 
     * @return an Iterator that iterates through Songs in the Album sequentially
     */
    public Iterator<Song> createInOrderIterator() {
        return new InOrderIterator(songs, count);
    }

    /**
     * Creates a {@link ShuffleIterator} to traverse Songs in random order
     * 
     * @return an Iterator that iterates through Songs in the Album randomly
     */
    public Iterator<Song> createShuffleIterator() {
        return new ShuffleIterator(songs, count);
    }

    /**
     * Retrieves the Album's name
     * 
     * @return the String title of the Album
     */
    public String getName() {
        return name;
    }
}

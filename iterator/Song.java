/**
 * Author: Aydin Escamilla
 * CSCE247
 */

package iterator;


/**
 * Represents an individual track with attributes
 * such as title, artist, length, and {@link Genre}.
 */
public class Song {
    private String name;
    private String artist;
    private double length;
    private Genre genre;

    /**
     * Creates a Song with all relevant attributes
     * 
     * @param name is the String title of the Song
     * @param artist is the String name of the performing artist
     * @param length is the double duration of the Song in minutes
     * @param genre is the {@link Genre} classification of the Song
     */
    public Song(String name, String artist, double length, Genre genre) {
        this.name = name;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
    }

    /**
     * Returns a String representation of the Song with its details
     * 
     * @return the String containing the Song's information
     */
    @Override
    public String toString() {
        return String.format("%s by %s [%.2f mins, %s]", name, artist, length, genre);
    }
}

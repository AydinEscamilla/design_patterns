/**
 * Author: Aydin Escamilla
 * CSCE247
 */

package singleton;

/**
 * {@code Song} represents a single music track composed of a title, artist, and file name
 * 
 * Each object conveys information to the necessary classes in order to play
 */
public class Song {
    private String title;
    private String artist;
    private String filePath;
    private SongPlayer player;

    /**
     * Constructs a new song object with the given information
     * 
     * @param title is the name of the song
     * @param artist is the artist for the song
     * @param fileName is the name of the .wav file the song is stored in
     */
    public Song(String title, String artist, String fileName) {
        this.title = title;
        this.artist = artist;
        this.filePath = fileName;
        this.player = new SongPlayer();
    }

    /**
     * Returns a string representation of the song ("title" by "artist")
     * 
     * @return is the formatted song details
     */
    @Override
    public String toString() {
        return title + " by " + artist;
    }

    /**
     * Plays the song via SongPlayer
     * 
     * Also prints a message to the console to affirm the song being played
     */
    public void play() {
        System.out.println("Now playing " + title + " by " + artist + "...");
        SongPlayer.play(filePath);
    }
    
    /**
     * Stops current song playback
     * 
     * Resets the current instance of {@link SongPlayer}, by extension cutting the track
     */
    public void stop() {
        // Reset player to effectively stop the current song
        player = new SongPlayer();
    }
}

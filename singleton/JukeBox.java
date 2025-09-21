/**
 * Author: Aydin Escamilla
 * CSCE247
 */

package singleton;

import java.util.ArrayList;

/**
 * {@code JukeBox} is a singleton class concerned with managing the Song objects,
 * allowing the user to request and play songs
 * 
 * Only one JukeBox instance exists at any given time due to the singleton nature
 */
public class JukeBox {
    private static JukeBox jukeBox;
    private ArrayList<Song> songs;
    private Song currentSong;

    /**
     * Constructs a JukeBox instance by loading songs from DataLoader
     * 
     * This is privately kept (singleton pattern)
     */
    private JukeBox() {
        DataLoader loader = new DataLoader();
        songs = loader.getSongs();
    }

    /**
     * Returns the single instance of JukeBox,
     * however if the isntance doesn't exist it will be created
     * 
     * @return is the singleton instance
     */
    public static JukeBox getInstance() {
        if (jukeBox == null) {
            jukeBox = new JukeBox();
        }
        return jukeBox;
    }

    /**
     * Retrieves all available songs loaded
     * 
     * @return is an {@link ArrayList} of {@link Song} objects
     */
    public ArrayList<Song> getAllSongs() {
        return songs;
    }

    /**
     * Requests and plays a song by index number
     * 
     * If a song is requested from an invalid index, a warning is given
     * and the user is able to re-select without re-running the program
     * 
     * @param num is the index of the song
     */
    public void requestSong(int num) {
        if (num >= 0 && num < songs.size()) {
            if (currentSong != null) {
                currentSong.stop();
            }
            currentSong = songs.get(num);
            currentSong.play();
        } else {
            System.out.println("Invalid song choice.");
        }
    }
}

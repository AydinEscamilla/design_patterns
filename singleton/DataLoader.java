/**
 * Author: Aydin Escamilla
 * CSCE247
 */

package singleton;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * {@code DataLoader} is responsible for loading songs from the txt file and converting them
 * into appropriate {@link Song} objects
 * 
 * It'll read from songs.txt specficially, which should be in the same directory as DataLoader
 */
public class DataLoader {

    /**
     * Reads song information from songs.txt and creates a list of the appropriate objects
     * Each song has a title, artist, and file name, parsed by commas
     * 
     * @return is an {@link ArrayList} of {@link Song} objects from the file
     */
    public ArrayList<Song> getSongs() {
        ArrayList<Song> songs = new ArrayList<>();
        File songFile = new File("songs.txt");

        if (!songFile.exists()) {
            songFile = new File("singleton/songs.txt");
        }

        try {
            Scanner scan = new Scanner(songFile);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String title = parts[0].trim();
                    String artist = parts[1].trim();
                    String fileName = parts[2].trim();

                    songs.add(new Song(title, artist, "singleton/songs/" + fileName));
                }
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("songs.txt not found in current or singleton directory!");
        }

        return songs;
    }
}

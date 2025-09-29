package iterator;

import java.util.Iterator;

public class Album {
    private Song[] songs;
    private int count;
    private String name;

    public Album(String name) {
        this.name = name;
        this.songs = new Song[5]; // default capacity = 5
        this.count = 0;
    }

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

    public Iterator<Song> createInOrderIterator() {
        return new InOrderIterator(songs, count);
    }

    public Iterator<Song> createShuffleIterator() {
        return new ShuffleIterator(songs, count);
    }

    public String getName() {
        return name;
    }
}

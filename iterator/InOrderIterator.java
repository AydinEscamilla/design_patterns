package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class InOrderIterator implements Iterator<Song> {
    private Song[] songs;
    private int position;
    private int count;

    public InOrderIterator(Song[] songs, int count) {
        this.songs = songs;
        this.count = count;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < count && songs[position] != null;
    }

    @Override
    public Song next() {
        if (!hasNext()) throw new NoSuchElementException();
        return songs[position++];
    }
}

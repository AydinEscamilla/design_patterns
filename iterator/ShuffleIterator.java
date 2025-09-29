package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class ShuffleIterator implements Iterator<Song> {
    private Song[] songs;
    private int[] order;
    private int position;
    private int count;
    private Random rand;

    public ShuffleIterator(Song[] songs, int count) {
        this.songs = songs;
        this.count = count;
        this.order = new int[count];
        this.rand = new Random();

        // initialize and shuffle order
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

    @Override
    public boolean hasNext() {
        return position < count;
    }

    @Override
    public Song next() {
        if (!hasNext()) throw new NoSuchElementException();
        return songs[order[position++]];
    }
}


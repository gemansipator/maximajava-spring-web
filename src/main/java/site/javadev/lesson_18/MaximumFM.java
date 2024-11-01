package site.javadev.lesson_18;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MaximumFM implements Radio {
    private List<String> songs = Arrays.asList("Nirvana - Lithium", "Metallica - Nothing Else Matters", "Green Day - Basket Case");

    @Override
    public String getSong() {
        return songs.get(new Random().nextInt(songs.size()));
    }
}

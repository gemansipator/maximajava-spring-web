package site.javadev.lesson_18;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RetroFM implements Radio {
    private List<String> songs = Arrays.asList("ABBA - Money", "Bee Gees - Stayin' Alive", "Queen - Bohemian Rhapsody");

    @Override
    public String getSong() {
        return songs.get(new Random().nextInt(songs.size()));
    }
}

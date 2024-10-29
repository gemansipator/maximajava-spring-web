package site.javadev.lesson_18;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RussianRadio implements Radio {
    private List<String> songs = Arrays.asList("MAKSIM - ОТПУСКАЮ", "Zemfira - Искала", "Dima Bilan - На берегу неба");

    @Override
    public String getSong() {
        return songs.get(new Random().nextInt(songs.size()));
    }
}
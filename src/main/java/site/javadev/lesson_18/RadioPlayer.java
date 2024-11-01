package site.javadev.lesson_18;

import site.javadev.lesson_18.Radio;

import java.util.List;

public class RadioPlayer {

    public void onStart() {
        System.out.println("Bean has been initialized");
    }

    private List<Radio> radios;
    private String name;
    private Integer volume;

    public RadioPlayer(List<Radio> radios, String name, Integer volume) {
        this.radios = radios;
        this.name = name;
        this.volume = volume;
    }

    public void play() {
        System.out.println("Player's name is " + this.name);
        System.out.println("Current volume is " + this.volume);

        for (Radio radio : radios) {
            System.out.println("Playing: " + radio.getSong());
        }
    }


    public void onFinish() {
        System.out.println("Bean will be destroyed");
    }
}

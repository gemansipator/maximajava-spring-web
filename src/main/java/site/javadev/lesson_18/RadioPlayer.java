package site.javadev.lesson_19;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Убедитесь, что интерфейс Radio импортируется, если он находится в другом файле
import site.javadev.lesson_19.Radio; // Импортируем интерфейс Radio

@Scope("prototype")
@Component("player")
public class RadioPlayer {

    @Getter
    private Radio radio;

    // Конструктор по умолчанию
    public RadioPlayer() {}

    @Autowired
    public RadioPlayer(@Qualifier("maximum") Radio radio) {
        this.radio = radio;
    }

    public void onStart() {
        System.out.println("Bean has been initialized");
    }

    @Value("${radioPlayer.name}")
    private String name;

    @Value("${radioPlayer.volume}")
    private Integer volume;

    public void play() {
        System.out.println("Playing: " + radio.getSong() + " at volume: " + volume);
    }

    public void onFinish() {
        System.out.println("Bean will be destroyed");
    }
}

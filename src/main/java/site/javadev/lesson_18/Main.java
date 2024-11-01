package site.javadev.lesson_18;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import site.javadev.lesson_19.RadioPlayer;

public class Main {

    public static void main(String[] args) {
        // Загружаем контекст из файла конфигурации
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Получаем bean player и запускаем метод play()
        RadioPlayer player1 = context.getBean("player", RadioPlayer.class);
        player1.play();

        // Проверка на prototype scope: player1 и player2 должны быть разными объектами
        RadioPlayer player2 = context.getBean("player", RadioPlayer.class);
        System.out.println(player1 == player2); // Должно вывести false

        context.close();
    }
}

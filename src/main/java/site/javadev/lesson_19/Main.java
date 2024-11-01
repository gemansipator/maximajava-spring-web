package site.javadev.lesson_19;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Загружаем контекст из файла конфигурации
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Получаем bean player и запускаем метод play()
        RadioPlayer player1 = context.getBean("player", RadioPlayer.class);
        player1.play();

        context.close();
    }
}

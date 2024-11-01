package site.javadev.lesson_19;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

    public static void main(String[] args) {
        // Загружаем контекст из файла конфигурации
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Получаем bean player и запускаем метод play()
        site.javadev.lesson_19.RadioPlayer player1 = context.getBean("player", site.javadev.lesson_19.RadioPlayer.class);
        site.javadev.lesson_19.RadioPlayer player2 = context.getBean("player", site.javadev.lesson_19.RadioPlayer.class);
        player1.play();

        System.out.println(player1 == player2);

        context.close();
    }
}

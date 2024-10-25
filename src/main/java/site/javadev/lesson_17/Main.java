package site.javadev.lesson_17;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**Создать класс Зоопарк (Zoo)

 Добавить в него перменные с Котом, Псом, Уткой и Тигром (создать суперкласс Animal и соответствующие классы,
 в каждом классе имя и возраст, инициализация в конструкторе, наследование от Animal)

 Создать все бины в applicationContext.xml (загуглить, как передать один бин другому в конструкторе) и создать
 итоговый бин Зоопарк (Zoo).

 В Мэйн - классе вывести имя каждого животного и его возраст с конкатенацией.*/
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Получаем бин Zoo
        Zoo zoo =  context.getBean("zooBean", Zoo.class);


        // Выводим информацию о каждом животном
        System.out.println("Cat: " + zoo.getCat().getName() + ", Age: " + zoo.getCat().getAge());
        System.out.println("Dog: " + zoo.getDog().getName() + ", Age: " + zoo.getDog().getAge());
        System.out.println("Tiger: " + zoo.getTiger().getName() + ", Age: " + zoo.getTiger().getAge());
        System.out.println("Duck: " + zoo.getDuck().getName() + ", Age: " + zoo.getDuck().getAge());



    }
}

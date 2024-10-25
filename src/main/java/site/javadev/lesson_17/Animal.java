package site.javadev.lesson_17;

import lombok.Data;

@Data
public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

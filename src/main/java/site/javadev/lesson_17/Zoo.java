package site.javadev.lesson_17;

import lombok.Data;

@Data
public class Zoo {
    private Animal cat;
    private Animal dog;
    private Animal tiger;
    private Animal duck;

    public Zoo(Animal cat, Animal dog, Animal tiger, Animal duck) {
        this.cat = cat;
        this.dog = dog;
        this.tiger = tiger;
        this.duck = duck;
    }
}
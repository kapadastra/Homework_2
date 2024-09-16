package animals.pets;

import animals.Animal;

public class Cat extends Animal {

    public Cat(String name, Integer age, Integer weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    public void Say() {
        System.out.println("Мяу");
    }
}
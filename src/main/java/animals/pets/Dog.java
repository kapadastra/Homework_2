package animals.pets;

import animals.Animal;

public class Dog extends Animal {

    public Dog(String name, Integer age, Integer weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    public void Say() {
        System.out.println("Гав");
    }
}

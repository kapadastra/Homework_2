package animals.birds;

import animals.Animal;

public class Duck extends Animal implements Flying {

    public Duck(String name, Integer age, Integer weight, String color) {
        super(name, age, weight, color);
    }


    @Override
    public void Say() {
        System.out.println("Кря");
    }

    @Override
    public void Fly() {
        System.out.println("Я лечу");
    }
}

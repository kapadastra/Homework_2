package factory;

import animals.Animal;
import animals.birds.Duck;
import animals.pets.Cat;
import animals.pets.Dog;
import data.AnimalData;

public class AnimalFactory {

    public static Animal createAnimal(String type, String name, int age, int weight, String color) {
        switch (type) {
            case "CAT":
                return new Cat(name, age, weight, color);
            case "DOG":
                return new Dog(name, age, weight, color);
            case "DUCK":
                return new Duck(name, age, weight, color);
            default:
                throw new IllegalArgumentException("Неизвестный тип животного: " + type);
        }
    }

}

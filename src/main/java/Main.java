import animals.Animal;
import data.AnimalData;
import data.Command;
import factory.AnimalFactory;
import utils.ValNum;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        ValNum valNum = new ValNum(scanner);

        while (true) {
            String inputCom = "";
            System.out.println("Введите команду из списка ADD,LIST,EXIT: ");
            while (inputCom.length() == 0) {
                inputCom = scanner.nextLine().toUpperCase().trim();
            }

            boolean isComValid = false;
            for (Command command : Command.values()) {
                if (command.name().equals(inputCom)) {
                    isComValid = true;
                    break;
                }
            }

            if (!isComValid) {
                System.out.println("Недопустимая команда.\n");
                continue;
            }

            Command menu = Command.valueOf(inputCom);

            switch (menu) {
                case ADD: {
                    while (true) {
                        System.out.println("Введите тип животного: ");

                        String animalType = scanner.nextLine().toUpperCase().trim();

                        boolean isAnimalValid = false;
                        for (AnimalData animalData : AnimalData.values()) {
                            if (animalData.name().equals(animalType)) {
                                isAnimalValid = true;
                                break;
                            }
                        }

                        if (!isAnimalValid) {
                            System.out.println("Недопустимый тип животного.\n");
                            continue;
                        }


                        System.out.println("Введите окрас животного: ");
                        String animalColor = scanner.nextLine();

                        System.out.println("Введите имя животного: ");
                        String animalName = scanner.nextLine();

                        int animalAge = valNum.inputValNum("Введите возраст животного");

                        int animalWeight = valNum.inputValNum("Введите вес животного");

                        try {
                            Animal newAnimal = AnimalFactory.createAnimal(animalType, animalName, animalAge, animalWeight, animalColor);
                            animals.add(String.valueOf(newAnimal));
                            newAnimal.say();
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }

                        break;
                    }
                }

                case LIST: {

                    for (String animal : animals) {
                        System.out.println(animal);
                    }
                    break;
                }
                case EXIT: {
                    scanner.close();
                    System.exit(0);
                }


            }


        }


    }

}
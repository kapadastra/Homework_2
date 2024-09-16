package utils;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValNum {

    private Scanner scanner;

    public ValNum(Scanner scanner) {
        this.scanner = scanner;
    }

    public int inputValNum(String mes) {
        boolean isVal = false;
        int inputNum = 0;
        do {
            System.out.println(mes + ", значение должно быть от 1 до 100");
            try {
                inputNum = scanner.nextInt();
                if (inputNum > 0 && inputNum <= 100) {
                    isVal = true;
                } else {
                    System.out.println("Значение должно быть от 1 до 100");
                }
            } catch (InputMismatchException error) {
                System.out.println("Вводите цифры");
                scanner.nextInt();
            }
        }
        while (!isVal);
        scanner.nextLine();
        return inputNum;


    }


}
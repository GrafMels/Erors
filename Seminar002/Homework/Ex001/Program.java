package Homework.Ex001;

import java.util.Scanner;

/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению 
 * приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class Program {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("Введённое число: %.1f", inputNumber());
    }

    public static float inputNumber() {
        System.out.println("Введите дробное число: ");
        float inputNumber;
        try {
            inputNumber = scanner.nextFloat();
        } catch (Exception e) {
            inputNumber = inputNumber();
        }
        return inputNumber;
    }
}

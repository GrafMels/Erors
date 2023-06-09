package Ex001;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению 
 * приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class Program {
    public static void main(String[] args) {
        System.out.printf("Введённое число: %.2f", inputNumber());
    }

    /**
     * Рекурсивный метод получения дробного числа
     * 
     * @return
     */
    public static float inputNumber() {
        System.out.println("Введите дробное число(используя запятые): ");
        Scanner scanner = new Scanner(System.in);
        float inputNumber;
        try {
            inputNumber = scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Неверно введёные данные!!!");
            inputNumber = inputNumber();
        }
        scanner.close();
        return inputNumber;
    }
}

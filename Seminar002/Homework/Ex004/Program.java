package Ex004;

import java.util.Scanner;

/*
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 *  Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Program {
    public static void main(String[] args) {
        try {
            scanString();
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * Метод ввода строки(показывает была ли введена пустая строка)
     * 
     * @return Строку
     * @throws EmptyStringException Передаёт в функцию входа, для того что бы в ней
     *                              поймать ошибку
     */
    private static String scanString() throws EmptyStringException {
        System.out.println("Введите не пустую строку: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        scanner.close();
        if (inputString.isEmpty()) {
            throw new EmptyStringException("Пустые строки вводить нельзя");
        }

        return inputString;
    }

}

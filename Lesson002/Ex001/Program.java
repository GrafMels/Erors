package Ex001;

import java.util.Random;

/**
 * Program
 */
public class Program {
    static Random random = new Random();

    public static void main(String[] args) {
        try {
            int number = 10 / random.nextInt(10);
            System.out.println(number);

            int[] arr = new int[5];
            arr[random.nextInt(10)] = 10;

            if (random.nextInt(2) == 1) {
                String text = null;
                System.out.println(text.length());
            }

        } catch (ArithmeticException exception) {
            System.out.println("На ноль делить нельзя");

        } catch (NullPointerException exception) {
            System.out.println("Строка пуста");

        } catch (Exception e) {
            System.out.println("Какая то ошибка");
        }
    }
}
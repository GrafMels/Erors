package Ex002;

/*
 * Если необходимо, исправьте данный код 
 * (задание 2 
 * https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 * 
 * try {
 *  int d = 0;
 *  double catchedRes1 = intArray[8] / d;
 *  System.out.println("catchedRes1 = " + catchedRes1);
 * } catch (ArithmeticException e) {
 *  System.out.println("Catching exception: " + e);
 * }
 *
 */
public class Program {
    public static void main(String[] args) {
        // Мой код
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }

        // Я не вижу тут ошибки, возможно имелось ввиду что массив
        // не имеет такого индекса и будет IndexOutOfBoundsException оставлю
        // закоментированным
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
        // catch (IndexOutOfBoundsException e) {
        // System.out.println("Catching exception: " + e);
        // }

    }
}

package Task001;

import java.util.Random;

public class Homework {

    static Random random = new Random();

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] quotientArray = null;

        int[] firstArray = generateArr();
        System.out.println("Первый массив: ");
        printArray(firstArray);

        int[] secondArray = generateArr();
        System.out.println("Второй массив: ");
        printArray(secondArray);

        if (firstArray.length != secondArray.length) {
            System.out.println("Кол-во элементов в массивах должно быть одинаково.");
            System.out.printf("Колличество элементов в первом массиве: %d\n", firstArray.length);
            System.out.printf("Колличество элементов во втором массиве: %d", secondArray.length);

        } else {
            quotientArray = quotientOfArrays(firstArray, secondArray);
            System.out.println("Результирующий массив: ");
            printArray(quotientArray);

        }
    }

    /**
     * Метод для получения разницы в массиве
     * 
     * @param firstArray
     * @param secondArray
     * @return Возрашает разницу элементов первого от второго массива
     */
    public static int[] quotientOfArrays(int[] firstArray, int[] secondArray) {
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] -= secondArray[i];
        }
        return firstArray;
    }

    /**
     * Метод из семинара только для одномерного массива
     * 
     * @return
     */
    static int[] generateArr() {
        int[] array = new int[random.nextInt(2) + 10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            if (random.nextInt(20) == 0) {
                array[i] = 2;
            }

        }
        return array;
    }

    /**
     * Метод печати массива
     * 
     * @param array
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {// Красивый вывод полученого массива
                System.out.printf("%d ", array[i]);

            } else {
                System.out.printf(" %d ", array[i]);

            }
        }
        System.out.println();
    }
}

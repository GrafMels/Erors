package Task002;

import java.util.Random;

public class Homework {
    static Random random = new Random();

    /**
     * @param args
     */
    public static void main(String[] args) {
        double[] quotientArray = null;
        int[] firstArray = generateArr();
        System.out.println("Первый массив: ");
        printArray(firstArray);

        int[] secondArray = generateArr();
        System.out.println("Второй массив: ");
        printArray(secondArray);

        try {
            quotientArray = quotientOfArrays(firstArray, secondArray);
            System.out.println("Результирующий массив: ");
            printArray(quotientArray);

        } catch (CustomArraySizeExeption e) {
            System.out.println(e.getMessage());
            System.out.printf("Колличество элементов в первом массиве: %d\n", e.getFirstLenght());
            System.out.printf("Колличество элементов во втором массиве: %d", e.getSecondLenght());

        }

    }

    /**
     * Метод для получения чатного элементов в массиве
     * 
     * @param firstArray
     * @param secondArray
     * @return Возрашает разницу элементов первого от второго массива
     */
    public static double[] quotientOfArrays(int[] firstArray, int[] secondArray) {
        double[] resultArray = null;
        if (firstArray == null || secondArray == null) {
            throw new NullPointerException("Оба массива должны существовать");

        } else if (firstArray.length != secondArray.length) {
            throw new CustomArraySizeExeption("Кол-во элементов в массивах должно быть одинаково.", firstArray.length,
                    secondArray.length);

        } else {
            resultArray = new double[firstArray.length];
            for (int i = 0; i < firstArray.length; i++) {
                resultArray[i] = (double) (firstArray[i]) / (double) (secondArray[i]);
            }
        }
        return resultArray;
    }

    /**
     * Метод из семинара только для одномерного массива
     * 
     * @return
     */
    static int[] generateArr() {
        int[] array = new int[random.nextInt(2) + 10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(9) + 1;
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
            System.out.printf("   %d", array[i]);
        }
        System.out.println();
    }

    /**
     * Метод печати массива
     * 
     * @param array
     */
    public static void printArray(double[] array) {
        System.out.print("  ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(" %.1f", array[i]);
        }
        System.out.println();
    }
}

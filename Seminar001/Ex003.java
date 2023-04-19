import java.util.Random;

public class Ex003 {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] arr = null;
        try {
            arr = quotientOfArrays(generateArr(), generateArr());
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    System.out.printf("%d ", arr[i]);
                } else {
                    System.out.printf(" %d ", arr[i]);
                }

            }
        } catch (CustomArraySizeExeption e) {
            System.out.println(e.getMessage());
            System.out.printf("Колличество элементов в первом массиве %d\n", e.getFirstLenght());
            System.out.printf("Колличество элементов во втором массиве %d", e.getSecondLenght());
        }

    }

    public static int[] quotientOfArrays(int[] firstArray, int[] secondArray) {
        if (firstArray == null || secondArray == null) {
            throw new NullPointerException("Оба массива должны существовать");
        } else if (firstArray.length != secondArray.length) {
            throw new CustomArraySizeExeption("Кол-во элементов в массивах должно быть одинаково", firstArray.length,
                    secondArray.length);
        } else {
            for (int i = 0; i < firstArray.length; i++) {
                firstArray[i] -= secondArray[i];
            }
        }
        return firstArray;
    }

    static int[] generateArr() {
        int[] arr = new int[random.nextInt(2) + 10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            if (random.nextInt(20) == 0) {
                arr[i] = 2;
            }
            System.out.printf(" %d ", arr[i]);
        }
        System.out.println();
        return arr;
    }
}

class CustomArraySizeExeption extends RuntimeException {
    private int firstLenght;
    private int secondLenght;

    public CustomArraySizeExeption(String message, int firstLenght, int secondLenght) {
        super(message);
        this.firstLenght = firstLenght;
        this.secondLenght = secondLenght;
    }

    public int getFirstLenght() {
        return firstLenght;
    }

    public int getSecondLenght() {
        return secondLenght;
    }

}

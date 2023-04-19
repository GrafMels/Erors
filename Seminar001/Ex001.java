import java.util.Random;

public class Ex001 {
    static Random random = new Random();

    public static void main(String[] args) {
        task();
    }

    static void task() {
        processArray(generateArr());
    }

    /**
     * @param arr двумерный массив
     * @return
     */
    static void processArray(int[][] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length != inputArray.length) {
                throw new RuntimeException("Некорректный размер массива");
            }
        }
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                if (inputArray[i][j] != 0 && inputArray[i][j] != 1) {
                    throw new RuntimeException(String.format("Инородный элемент в массиве \"%d\", по индексам [%d][%d]",
                            inputArray[i][j], i, j));
                }
            }
        }
    }

    /**
     * Метод генерации двумерного массива
     * 
     * @param arr
     * @return
     */
    static int[][] generateArr() {
        int[][] arr = new int[random.nextInt(2) + 4][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(2);
                if (random.nextInt(20) == 0) {
                    arr[i][j] = 2;
                }
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }
}
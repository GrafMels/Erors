import java.util.Random;

public class Ex002 {
    static Random random = new Random();
    static int erorI = 0;
    static int erorJ = 0;

    public static void main(String[] args) {
        task();
    }

    static void task() {
        int[][] array = generateArr();
        int answer = processArray(array);
        if (answer == -1) {
            throw new RuntimeException("Некорректный размер массива");
        } else if (answer == -2) {
            throw new RuntimeException(String.format("Инородный элемент в массиве \"%d\", по индексам [%d][%d]",
                    array[erorI][erorJ], erorI, erorJ));
        } else {
            System.out.println();
            System.out.println(answer);
        }
    }

    /**
     * @param arr двумерный массив
     * @return
     */
    static int processArray(int[][] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length != inputArray.length) {
                return -1;
            }
        }
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                if (inputArray[i][j] != 0 && inputArray[i][j] != 1) {
                    erorI = i;
                    erorJ = j;
                    return -2;
                } else {
                    sum += inputArray[i][j];
                }
            }
        }
        return sum;
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

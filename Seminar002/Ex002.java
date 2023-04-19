import java.util.Random;

public class Ex002 {
    static Random random = new Random();

    public static void main(String[] args) {
        try {
            System.out.printf("Сумма: %d", arraySum(getStringArray()));
        } catch (MyArraySizeException e) {
            System.out.printf("\n!!!%s", e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.printf("\n!!!%s", e.getMessage());
        }
    }

    public static String[][] getStringArray() {
        int add = random.nextInt(2);

        String[][] array = new String[4 + add][4 + add];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (random.nextInt(50) < 2) {
                    array[i][j] = "X";
                } else {
                    array[i][j] = Integer.toString(random.nextInt(10));
                }
                System.out.printf("%s ", array[i][j]);
            }
            System.out.println();
        }
        return array;
    }

    public static int arraySum(String[][] inputArray) throws MyArraySizeException, MyArrayDataException {
        if (inputArray.length != 4 || inputArray[0].length != 4) {
            throw new MyArraySizeException("Некорректный размер массива", inputArray.length, inputArray[0].length);
        }
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                int result = tryParseInt(inputArray[i][j], i, j);
                if (result == -1) {

                } else {
                    sum += result;
                }
            }
        }

        return sum;
    }

    public static int tryParseInt(String value, int i, int j) throws MyArrayDataException {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new MyArrayDataException("Некорректный данные в массиве", i, j);
        }
    }
}

abstract class MyException extends Exception {
    private final int x;
    private final int y;

    public MyException(String message, int x, int y) {
        super(message);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

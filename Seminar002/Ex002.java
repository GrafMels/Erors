import java.util.Random;

public class Ex002 {
    static Random random = new Random();

    public static void main(String[] args) {
        try {
            arraySum(getStringArray());
        } catch (Ex002.MyArraySizeException | Ex002.MyArrayDataException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static String[][] getStringArray() {
        int add = random.nextInt(2);

        String[][] array = new String[4 + add][4 + add];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (random.nextInt(10) < 2) {
                    array[i][j] = "a";
                } else {
                    array[i][j] = Integer.toString(random.nextInt(10));
                }
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
        return array;
    }

    public static int arraySum(String[][] inputArray) throws Ex002.MyArraySizeException, Ex002.MyArrayDataException {
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

        return 0;
    }

    public static int tryParseInt(String value, int i, int j) throws Ex002.MyArrayDataException {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new MyArrayDataException("Некорректный данные в массиве", i, j);
            return 0;
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

    public class MyArraySizeException extends MyException {

        public MyArraySizeException(String message, int x, int y) {
            super(message, x, y);
            // TODO Auto-generated constructor stub
        }

    }

    public class MyArrayDataException extends MyException {

        public MyArrayDataException(String message, int x, int y) {
            super(message, x, y);
            // TODO Auto-generated constructor stub
        }

    }
}

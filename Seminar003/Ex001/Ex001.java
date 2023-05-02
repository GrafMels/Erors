package Ex001;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Ex001
 */
public class Ex001 {
    public static void main(String[] args) {
        try {
            test1();
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        try {
            String[] array = new String[5];
            test2(array, 3);
        } catch (NullElementArrayException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        try {
            test3("senin.txt");
        } catch (MyFileNotFoundException e) {
            System.out.printf("%s Имя файла \"%s\"", e.getMessage(), e.getFileName());
            System.out.println();
        }
    }

    static void test1() {
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            throw new DivisionByZeroException("Деления числа на ноль!");
        }

    }

    static void test2(String[] arr, int index) {
        try {
            if (arr[index] == null) {
                throw new NullElementArrayException("Элемент массива не проинцианализирован!", index);
            }
            System.out.printf("Значение элемента массива", arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

    static void test3(String fileName) throws MyFileNotFoundException {
        try (FileReader reader = new FileReader(fileName)) {

            char[] buf = new char[146];
            reader.read(buf);
            int count = 0;
            while ((count = reader.read(buf)) > 0) {
                if (count < 256) {
                    buf = Arrays.copyOf(buf, count);
                }

                for (int i = 0; i < buf.length; i++) {
                    System.out.print(buf[i]);
                }

            }
        } catch (FileNotFoundException e) {
            throw new MyFileNotFoundException("Фаил не найден!", fileName);
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла!");
        }

    }
}
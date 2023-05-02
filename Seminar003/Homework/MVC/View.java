package MVC;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import MVC.Exceptions.FileReaderException;
import MVC.Exceptions.FileWriterException;

public class View {
    static Scanner scan = new Scanner(System.in, "Cp866");

    /**
     * @param file Получает на вход фаил
     * @return Возвращает список строк однофамильцев из него
     * @throws FileReaderException
     */
    public static List<String> readFile(File file) throws FileReaderException {
        List<String> namesakes = new ArrayList<String>();
        try (FileReader freader = new FileReader(file);
                Scanner scan = new Scanner(freader)) {
            while (scan.hasNextLine()) {
                namesakes.add(scan.nextLine());
            }
        } catch (IOException e) {
            throw new FileReaderException("Ошибка считывания информации с файлов.");
        }
        return namesakes;
    }

    /**
     * Функция которая позволяет продолжать вводить фамилии если это требуется
     * 
     * @return Ответ на то нужно ли продолжать выполнение програмы
     */
    public static String wishContinue() {
        System.out.println("Хотите ввести еще одного пользователя? Если не хотите введите символ \"x\"");
        String answer = "";

        answer = scan.nextLine();
        return answer;
    }

    /**
     * Функция ввода данных юзера
     * 
     * @return Строку
     */
    public static String inpuString() {
        System.out.println(
                "Введите Фамилию Имя Отчество датурождения(dd.mm.yyyy) номертелефона(целое беззнаковое число без форматирования) пол(символ латиницей f или m), разделённые пробелом: ");
        String answer = "";
        answer = scan.nextLine();
        System.out.println();
        return answer;
    }

    /**
     * Функция закрытия сканера для того что бы закрывать его по окончаю всх работ
     */
    public static void scannerClose() {
        scan.close();
        System.out.println();
    }

    /**
     * Функция сохранения юзера которого ввели
     * 
     * @param lastName     Фамилия нужна для поиска файла
     * @param outputString Строка с данными
     * @throws FileWriterException
     */
    public static void saveUser(String lastName, String outputString) throws FileWriterException {
        File dir = new File("Data");
        File[] arrFiles = dir.listFiles();
        List<File> fileList = Arrays.asList(arrFiles);// Получаем список файлов в папке Data

        boolean isNewFile = true;
        String path = String.format("Data/%s.txt", lastName);
        for (int i = 0; i < fileList.size(); i++) {
            if (fileList.toString() == path) {
                isNewFile = false;
            }
        }
        try (FileWriter writer = new FileWriter(path, true)) {
            if (isNewFile) {
                writer.append(outputString);
            } else {
                writer.append(String.format("\n%s", outputString));
            }

        } catch (Exception e) {
            throw new FileWriterException("Ошибка сохранения информации в файл.");
        }
    }

}

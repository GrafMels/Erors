package MVC;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import MVC.Exceptions.FileReaderException;
import MVC.Exceptions.WrongParseException;

public class Model {

    /**
     * Функция для подгрузки старых user из прошлых применений программы
     * 
     * @return Возращает список users
     * @throws IOException
     * @throws NumberFormatException
     * @throws ParseException
     * @throws WrongParseException
     * @throws FileReaderException
     */
    public static List<User> getOldUsers() throws WrongParseException, FileReaderException {
        File dir = new File("Data");
        File[] arrFiles = dir.listFiles();
        List<File> fileList = Arrays.asList(arrFiles);// Получаем список файлов в папке Data

        List<User> savedUser = new ArrayList<>(fileList.size());
        for (int i = 0; i < fileList.size(); i++) {
            List<User> tempUser = new ArrayList<>(fileList.size());
            tempUser = oldUser(View.readFile(fileList.get(i)));
            for (int j = 0; j < tempUser.size(); j++) {
                savedUser.add(tempUser.get(j));
            }

        }

        return savedUser;
    }

    /**
     * Функция для получения списка user из одного файла(однофамильцев)
     * 
     * @param inputData На вход получает список строк юзеров
     * @return Возвращает список юзеров
     * @throws NumberFormatException
     * @throws ParseException
     * @throws WrongParseException
     */
    public static List<User> oldUser(List<String> inputData) throws WrongParseException {
        List<User> namesakes = new ArrayList<User>(inputData.size());
        for (int i = 0; i < inputData.size(); i++) {
            namesakes.add(newUser(inputData.get(i)));
        }
        return namesakes;
    }

    /**
     * Функция для получения из строки полноценный экземпляр класса юзер
     * 
     * @param inputData строка с данными одного юзера
     * @return Возвращает юзера
     * @throws WrongParseException
     */
    public static User newUser(String inputData) throws WrongParseException {
        String[] userDataString = inputData.replace("<", "").replace(">", " ").split(" ");
        String lastName = userDataString[0];
        String firstName = userDataString[1];
        String surName = userDataString[2];
        Date bithDate;
        Long phoneNumber = null;
        Character gender = userDataString[5].charAt(0);

        try {
            bithDate = new SimpleDateFormat("DD.MM.yyyy").parse(userDataString[3]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new WrongParseException("Неверно введена дата.");
        }

        try {
            phoneNumber = Long.parseLong(userDataString[4]);
        } catch (Exception e) {
            throw new WrongParseException("Неверно введён номер телефона.");
        }

        User user = new User(lastName, firstName, surName, bithDate, phoneNumber, gender);

        return user;
    }
}
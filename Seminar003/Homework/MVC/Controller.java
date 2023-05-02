package MVC;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private static List<User> users = new ArrayList<>();

    /**
     * Функция дял обьединения промежуточных функций из Model и View
     */
    public static void start() {
        String userAnswer = "";// Строка проверки желания выйти

        try {
            users = Model.getOldUsers();// Подгрузка старых пользователей

            while (!userAnswer.equals("x")) {
                User newUser = Model.newUser(View.inpuString());// Введние нового пользователя
                users.add(newUser);// Добавление его в список
                View.saveUser(newUser.getLastName(), newUser.toString());// Сохранение пользователя

                userAnswer = View.wishContinue();// Проверка на желание продолжить выполнение программы
            }

            View.scannerClose();// Закрытие сканера
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < users.size(); i++) {// Вывод всех пользователей на экран
            System.out.println(users.get(i));
        }
    }
}

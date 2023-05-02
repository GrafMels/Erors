package MVC;

import java.util.Date;

/**
 * User
 */
public class User {
    private String firstName;
    private String lastName;
    private String surName;
    private Date bithDate;
    private Long phoneNumber;
    private Character gender;

    /**
     * Конструктор класса юзер
     * 
     * @param lastName    Фамилия
     * @param firstName   Имя
     * @param surName     Отчество
     * @param date        Дата рождения
     * @param phoneNumber Номер телефона
     * @param gender      Пол
     */
    public User(String lastName, String firstName, String surName, Date date, Long phoneNumber,
            Character gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        this.bithDate = date;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    /**
     * Перегрузка функции toString
     */
    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%td.%tm.%tY><%d><%c>", lastName, firstName, surName, bithDate, bithDate,
                bithDate,
                phoneNumber,
                gender);
    }

    /**
     * Функция получения фамилии юзера для сохранения в нужный фаил
     * 
     * @return Строку с фамилией
     */
    public String getLastName() {
        return lastName;
    }

}
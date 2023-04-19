package Ex004;

/*
 * Класс исключения при вводе пустой строки
 */
public class EmptyStringException extends Exception {

    public EmptyStringException(String message) {
        super(message);
    }
}

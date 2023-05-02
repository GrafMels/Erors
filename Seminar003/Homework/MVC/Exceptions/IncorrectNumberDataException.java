package MVC.Exceptions;

public class IncorrectNumberDataException extends Exception {
    /**
     * Конструктор для класса исключений связанных с неправильным колличеством
     * введёных данных
     * 
     * @param message
     */
    public IncorrectNumberDataException(String message) {
        super(message);
    }
}

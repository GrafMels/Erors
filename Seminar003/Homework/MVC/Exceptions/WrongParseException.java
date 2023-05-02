package MVC.Exceptions;

public class WrongParseException extends Exception {
    /**
     * Конструктор для класса исключений связанных с парсингом неправильных данных
     * 
     * @param message
     */
    public WrongParseException(String message) {
        super(message);
    }
}

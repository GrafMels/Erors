package MVC.Exceptions;

import java.io.IOException;

public class FileWriterException extends IOException {
    /**
     * 
     * Конструктор для класса исключений связанных с сохраннением файлов
     * 
     * @param message
     */
    public FileWriterException(String message) {
        super(message);
    }
}

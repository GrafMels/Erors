package MVC.Exceptions;

import java.io.IOException;

public class FileReaderException extends IOException {
    /**
     * 
     * Конструктор для класса исключений связанных с считыванием файлов
     * 
     * @param message
     */
    public FileReaderException(String message) {
        super(message);
    }
}

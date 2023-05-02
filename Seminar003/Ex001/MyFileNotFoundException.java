package Ex001;

public class MyFileNotFoundException extends Exception {
    private final String fileName;

    public MyFileNotFoundException(String message, String fileName) {
        super(message);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

}

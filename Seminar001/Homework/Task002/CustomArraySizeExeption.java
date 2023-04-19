package Task002;

public class CustomArraySizeExeption extends RuntimeException {
    private int firstLenght;
    private int secondLenght;

    public CustomArraySizeExeption(String message, int firstLenght, int secondLenght) {
        super(message);
        this.firstLenght = firstLenght;
        this.secondLenght = secondLenght;
    }

    public int getFirstLenght() {
        return firstLenght;
    }

    public int getSecondLenght() {
        return secondLenght;
    }

}

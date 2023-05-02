package Ex001;

public class NullElementArrayException extends RuntimeException {
    private final int index;

    public int getIndex() {
        return index;
    }

    public NullElementArrayException(String message, int index) {
        super(message);
        this.index = index;
    }
}

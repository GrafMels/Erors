package Ex002;

public class Counter implements AutoCloseable {

    private int counter;
    private boolean isOpen;

    public Counter() {
        this.isOpen = true;
    }

    public Counter(int counter) {
        this.counter = counter;
        this.isOpen = true;
    }

    public int getCounter() throws CloseCounterException {
        if (!isOpen) {
            throw new CloseCounterException("Выпытаетесь получить значение закрытого счётчика.");
        }
        return counter;

    }

    public int add() throws CloseCounterException {
        if (!isOpen) {
            throw new CloseCounterException("Выпытаетесь увеличить значение закрытого счётчика.");
        }
        return ++counter;

    }

    public boolean isOpen() {
        return isOpen;
    }

    public void open() {
        this.isOpen = true;
    }

    @Override
    public void close() {
        this.isOpen = false;
    }

}

package Ex003;

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void swim(int distance) throws AnimalSwimException;

    abstract void run(int distance) throws AnimalRunException;

    public String getName() {
        return name;
    }

}

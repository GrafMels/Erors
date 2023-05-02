package Ex003;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    void swim(int distance) throws AnimalSwimException {
        if (distance > 50) {
            throw new AnimalSwimException("Кошке тяжело плавать.", name, distance);
        }
    }

    @Override
    void run(int distance) throws AnimalRunException {
        if (distance > 50) {
            throw new AnimalRunException("Кошке тяжело бежать.", name, distance);
        }
    }

}

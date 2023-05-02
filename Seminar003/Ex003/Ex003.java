package Ex003;

public class Ex003 {
    public static void main(String[] args) {
        Animal cat = new Cat("Маруся");

        try {
            int distance = 51;
            cat.swim(distance);
            System.out.printf("Животное проплыло %s м", distance);
        } catch (AnimalException e) {
            System.out.printf("%s %s не может проплыть %d м.", e.getMessage(), e.getName(), e.getDistance());
        }
    }

}

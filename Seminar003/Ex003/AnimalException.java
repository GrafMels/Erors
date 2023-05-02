package Ex003;

abstract class AnimalException extends Exception {

    private final String name;
    private final Integer distance;

    public AnimalException(String message, String name, Integer distance) {
        super(message);
        this.name = name;
        this.distance = distance;
    }

    public Integer getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }

}

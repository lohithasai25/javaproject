package car;

public class Car {
    private String make;
    private String model;
    private int year;

    // Default constructor
    public Car() {
        // Default values
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    // Overloaded constructor with all attributes as parameters
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Example of how to use the constructors to instantiate Car objects
    public static void main(String[] args) {
        // Creating a car using the default constructor
        Car defaultCar = new Car();
        System.out.println("Default Car - Make: " + defaultCar.getMake() +
                ", Model: " + defaultCar.getModel() +
                ", Year: " + defaultCar.getYear());

        // Creating a car using the overloaded constructor with all attributes
        Car customCar = new Car("Toyota", "Camry", 2022);
        System.out.println("Custom Car - Make: " + customCar.getMake() +
                ", Model: " + customCar.getModel() +
                ", Year: " + customCar.getYear());
    }
}


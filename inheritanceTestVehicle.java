// Base class
class Vehicle {
    // Fields for the Vehicle class
    public int speed;
    public int capacity;

    // Constructor for the Vehicle class
    public Vehicle(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    // Method to simulate vehicle's movement
    public void start() {
        System.out.println("The vehicle is starting.");
    }

    // toString() method to return vehicle's details
    public String toString() {
        return ("Speed: " + speed + " km/h\nCapacity: " + capacity + " people");
    }
}

// Subclass Car
class Car extends Vehicle {
    // Additional field specific to Car
    public String model;

    // Constructor for the Car class
    public Car(int speed, int capacity, String model) {
        // Calling base-class (Vehicle) constructor
        super(speed, capacity);
        this.model = model;
    }

    // Method to display car-specific information
    public void start() {
        super.start(); // Calling the parent class start method
        System.out.println("The car " + model + " is starting.");
    }

    // Overriding toString() method to include model information
    @Override
    public String toString() {
        return super.toString() + "\nModel: " + model;
    }
}

// Subclass Truck
class Truck extends Vehicle {
    // Additional field specific to Truck
    public int loadCapacity;

    // Constructor for the Truck class
    public Truck(int speed, int capacity, int loadCapacity) {
        // Calling base-class (Vehicle) constructor
        super(speed, capacity);
        this.loadCapacity = loadCapacity;
    }

    // Method to display truck-specific information
    public void start() {
        super.start(); // Calling the parent class start method
        System.out.println("The truck is starting, ready to carry loads.");
    }

    // Overriding toString() method to include load capacity information
    @Override
    public String toString() {
        return super.toString() + "\nLoad Capacity: " + loadCapacity + " tons";
    }
}

// Driver class
public class inheritanceTestVehicle {
    public static void main(String args[]) {
        // Creating objects for Car and Truck
        Car car = new Car(120, 5, "Toyota Corolla");
        Truck truck = new Truck(80, 2, 15);

        // Calling start() method
        car.start();
        truck.start();

        // Printing the details of Car and Truck using toString() method
        System.out.println("\nCar Details:");
        System.out.println(car);

        System.out.println("\nTruck Details:");
        System.out.println(truck);
    }
}

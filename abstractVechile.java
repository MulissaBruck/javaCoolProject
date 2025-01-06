// Abstract class Vehicle
abstract class Vehicle {
    String brand;

    // Constructor to initialize the brand
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method to be implemented by subclasses
    public abstract void start();

    // Concrete method to get the brand of the vehicle
    public String getBrand() {
        return brand;
    }
}

// Car class extends Vehicle and implements start method
class Car extends Vehicle {
    public Car(String brand) {
        super(brand); // Calling the constructor of the superclass (Vehicle)
    }

    // Implementing the abstract method start
    @Override
    public void start() {
        System.out.println(brand + " Car is starting.");
    }
}

// Bike class extends Vehicle and implements start method
class Bike extends Vehicle {
    public Bike(String brand) {
        super(brand); // Calling the constructor of the superclass (Vehicle)
    }

    // Implementing the abstract method start
    @Override
    public void start() {
        System.out.println(brand + " Bike is starting.");
    }
}

// Driver class to test the program
public class abstractVechile {
    public static void main(String[] args) {
        // Creating objects of Car and Bike
        Vehicle car = new Car("Toyota");
        Vehicle bike = new Bike("Yamaha");

        // Calling the start method for both car and bike
        car.start();
        bike.start();
    }
}

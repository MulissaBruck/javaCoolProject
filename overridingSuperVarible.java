
// Base class Vehicle
class Vehicle {
    int maxSpeed = 120; // Maximum speed defined in the Vehicle class
}

// Subclass Car extending Vehicle
class Car extends Vehicle {
    int maxSpeed = 180; // Maximum speed defined in the Car class

    void display() {
        // Using 'super' to refer to the maxSpeed of the base class (Vehicle)
        System.out.println("Maximum Speed: " + super.maxSpeed);
    }
}

// Driver Program
class overridingSuperVarible {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car small = new Car();
        small.display(); // Calls the display() method in the Car class
    }
}

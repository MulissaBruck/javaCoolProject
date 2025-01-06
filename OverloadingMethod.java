// Class demonstrating method overloading
class Sum {

    // Overloaded sum() method: Takes two int parameters
    public int sum(int x, int y) {
        return (x + y); // Adds two integers and returns the result
    }

    // Overloaded sum() method: Takes three int parameters
    public int sum(int x, int y, int z) {
        return (x + y + z); // Adds three integers and returns the result
    }

    // Overloaded sum() method: Takes two double parameters
    public double sum(double x, double y) {
        return (x + y); // Adds two double values and returns the result
    }
}

// Main class
public class OverloadingMethod {

    // Main method (driver code)
    public static void main(String[] args) {
        // Create an instance of the Sum class
        Sum s = new Sum();

        // Call the sum method with different arguments
        System.out.println("Sum of two integers: " + s.sum(10, 20)); // Calls first sum()
        System.out.println("Sum of three integers: " + s.sum(10, 20, 30)); // Calls second sum()
        System.out.println("Sum of two doubles: " + s.sum(10.5, 20.5)); // Calls third sum()
    }
}

// Java Program for Method Overloading
// Using Different Types of Arguments

// Class 1 - Helper class
class Helper {

    // Method 1: Multiplies two integers
    static int Multiply(int a, int b) {
        // Returns the product of integer values
        return a * b;
    }

    // Method 2: Multiplies two doubles
    // Overloaded method with the same name but different parameter types
    static double Multiply(double a, double b) {
        // Returns the product of double values
        return a * b;
    }
}

// Class 2 - Main class
class OverloadingFunction {
    // Main method - entry point of the program
    public static void main(String[] args) {
        // Calling the Multiply method with integer parameters
        System.out.println("Multiplication of integers: " + Helper.Multiply(2, 4));

        // Calling the Multiply method with double parameters
        System.out.println("Multiplication of doubles: " + Helper.Multiply(5.5, 6.3));
    }
}

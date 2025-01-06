// Class Arithmetic
class Arithmetic {
    // Method to return the sum of two integers
    int add(int a, int b) {
        return a + b;
    }
}

// Class Adder, inheriting from Arithmetic
class Adder extends Arithmetic {
    // No need to redefine the add method since it's inherited
}

// Main Solution class
public class inheritanceAdder {
    public static void main(String[] args) {
        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        System.out.println("My superclass is: " + a.getSuperclass());
        System.out.println("My superclass is: " + a.getClass());
        // Print the result of add method calls
        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
    }
}

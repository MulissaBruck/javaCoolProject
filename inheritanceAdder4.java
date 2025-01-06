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
public class inheritanceAdder4 {
    public static void main(String[] args) {
        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print results in "Left" and "Right" format
        System.out.printf("Left: %d    Right: %d\n", a.add(10, 32), a.add(10, 3));
        System.out.printf("Left: %d    Right: %d\n", a.add(20, 40), a.add(5, 15));
    }
}

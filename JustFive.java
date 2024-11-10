public class JustFive {
    // Static variable to track the number of instances
    private static int instanceCount = 0;

    // Private constructor to restrict instantiation from outside
    private JustFive() {
        // Increment instance count when a new instance is created
        if (instanceCount < 5) {
            instanceCount++;
            System.out.println("Instance " + instanceCount + " created.");
        } else {
            System.out.println("Error: Cannot create more than 5 instances.");
        }
    }

    // Main method to attempt creating 6 instances
    public static void main(String[] args) {
        // Trying to create 6 instances of JustFive
        new JustFive(); // Instance 1
        new JustFive(); // Instance 2
        new JustFive(); // Instance 3
        new JustFive(); // Instance 4
        new JustFive(); // Instance 5
        new JustFive(); // This should give an error
    }
}

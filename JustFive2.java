public class JustFive2 {
    // Static variable to track the number of instances
    private static int instanceCount = 0;

    // Private constructor to prevent direct instantiation
    private JustFive2() {
        // Constructor does not do anything here anymore.
    }

    // Static method to create instances with the limit check
    public static JustFive2 createInstance() {
        if (instanceCount < 5) {
            instanceCount++;
            System.out.println("Instance " + instanceCount + " created.");
            return new JustFive2();
        } else {
            System.out.println("Error: Cannot create more than 5 instances.");
            return null; // Return null to indicate failure
        }
    }

    // Main method to attempt creating 6 instances
    public static void main(String[] args) {
        JustFive2 j1 = JustFive2.createInstance(); // Instance 1
        JustFive2 j2 = JustFive2.createInstance(); // Instance 2
        JustFive2 j3 = JustFive2.createInstance(); // Instance 3
        JustFive2 j4 = JustFive2.createInstance(); // Instance 4
        JustFive2 j5 = JustFive2.createInstance(); // Instance 5
        JustFive2 j6 = JustFive2.createInstance(); // This should give an error
    }
}

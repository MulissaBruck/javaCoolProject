public class SumCalculator {
    public static void main(String[] args) {
        // Check if any command-line arguments were provided
        if (args.length == 0) {
            System.out.println("No numbers provided to sum.");
            return; // Exit the program if no arguments
        }

        int sum = 0; // Variable to hold the sum

        // Loop through the command-line arguments using a traditional for loop
        for (int i = 0; i < args.length; i++) {
            try {
                // Parse each argument as an integer and add it to the sum
                sum += Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + args[i]); // Handle invalid input
                return; // Exit the program on invalid input
            }
        }

        // Print the total sum
        System.out.println("The total sum is: " + sum);
    }
}

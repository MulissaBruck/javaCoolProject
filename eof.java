import java.util.Scanner;

public class eof {
    public static void main(String[] args) {
        // Create a Scanner object to read input from System.in // Get-Content input.txt
        // | java eof
        Scanner scanner = new Scanner(System.in);

        // Initialize a counter to keep track of line numbers
        int lineNumber = 1;

        // Use a while loop to read until end-of-file (EOF)
        while (scanner.hasNext()) {
            // scanner.hasNext() checks if there is more input
            // If true, read the next line of input
            String line = scanner.nextLine();

            // Print the line number, a space, and the line content
            System.out.println(lineNumber + " " + line);

            // Increment the line number for the next line
            lineNumber++;
        }

        // Close the Scanner object to release resources
        scanner.close();
    }
}

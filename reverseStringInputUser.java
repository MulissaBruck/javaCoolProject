import java.util.Scanner;

class reverseStringInputUser {

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Check if there is a line to read from the user
        if (sc.hasNextLine()) {
            // Taking string input from the user
            String s = sc.nextLine();

            // Using StringBuilder to store the reversed string
            StringBuilder res = new StringBuilder();

            // Traversing the string from the end to the beginning
            for (int i = s.length() - 1; i >= 0; i--) {
                // Append each character to the StringBuilder in reverse order
                res.append(s.charAt(i));
            }

            // Convert the StringBuilder to a String and print the reversed string
            System.out.println(res.toString());
        } else {
            // If no input is provided, inform the user
            System.out.println("No input provided.");
        }

        // Close the scanner to release the resource and avoid memory leaks
        sc.close();
    }
}

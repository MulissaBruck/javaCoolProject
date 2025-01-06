import java.util.Scanner;

public class dataTypeChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int t = sc.nextInt();

        // Loop through each test case
        for (int i = 0; i < t; i++) {
            try {
                // Try to read the input number as a long (8 bytes)
                long n = sc.nextLong();

                // If successfully read, check which data types can store the number
                System.out.println(n + " can be fitted in:");

                // Check if the number fits in a byte (1 byte: -128 to 127)
                if (n >= -128 && n <= 127) {
                    System.out.println("* byte"); // 1 byte
                }

                // Check if the number fits in a short (2 bytes: -32,768 to 32,767)
                if (n >= -32768 && n <= 32767) {
                    System.out.println("* short"); // 2 bytes
                }

                // Check if the number fits in an int (4 bytes: -2,147,483,648 to 2,147,483,647)
                if (n >= -2147483648 && n <= 2147483647) {
                    System.out.println("* int"); // 4 bytes
                }

                // Check if the number fits in a long (8 bytes: -9,223,372,036,854,775,808 to
                // 9,223,372,036,854,775,807)
                if (n >= -9223372036854775808L && n <= 9223372036854775807L) {
                    System.out.println("* long"); // 8 bytes
                }
            } catch (Exception e) {
                // If an exception occurs, the number is too large to fit in a long
                // Read the next token (the large number) as a string and print the error
                // message
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }

        // Close the Scanner object to release resources
        sc.close();
    }
}

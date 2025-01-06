import java.util.Scanner;

public class readStringDoubleInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the integer
        int intValue = scanner.nextInt();

        // Read the double
        double doubleValue = scanner.nextDouble();

        // Move to the next line to consume the leftover newline character
        scanner.nextLine();

        // Read the String
        String stringValue = scanner.nextLine();

        scanner.close();

        // Print the output as per the required format
        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);
    }
}

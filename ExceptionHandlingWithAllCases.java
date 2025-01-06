import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandlingWithAllCases {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Prompting the user
            System.out.println("Enter two integers:");

            // Read two integers
            int x = sc.nextInt();
            int y = sc.nextInt();

            // Perform division
            System.out.println("Result: " + (x / y));
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
        } catch (InputMismatchException e) {
            // Handle invalid input (e.g., non-integer values)
            System.out.println("java.util.InputMismatchException");
        } catch (NullPointerException e) {
            // Handle null-related issues (less likely here)
            System.out.println("java.lang.NullPointerException");
        } catch (NumberFormatException e) {
            // Handle format issues when converting strings to numbers
            System.out.println("java.lang.NumberFormatException: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other general exceptions
            System.out.println("An unexpected exception occurred: " + e);
        } finally {
            // Ensure Scanner is closed
            sc.close();
            System.out.println("Scanner closed.");
        }
    }
}

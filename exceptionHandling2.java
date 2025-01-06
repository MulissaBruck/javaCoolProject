import java.util.*;

public class exceptionHandling2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Read two integers
            int x = sc.nextInt();
            int y = sc.nextInt();

            // Attempt to perform division
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
        } catch (InputMismatchException e) {
            // Handle invalid input type
            System.out.println("java.util.InputMismatchException");
        } catch (Exception e) {
            // Handle any other unexpected exceptions
            System.out.println(e);
        } finally {
            sc.close();
        }
    }
}

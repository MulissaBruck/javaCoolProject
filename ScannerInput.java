import java.util.Scanner;
import java.util.*;

public class ScannerInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user for which nth perfect number they want
        System.out.println("Enter the value of nth (to find the nth perfect number): ");
        int nth = input.nextInt();

        // Read 3 integers from input
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // Print each integer on a new line
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        input.close();
    }
}

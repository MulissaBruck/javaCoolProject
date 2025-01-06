import java.util.*;

public class SingleD_Array {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Read the number of elements (size of the array)
        int n = scan.nextInt();

        // Create an array of size n
        int[] a = new int[n];

        // Populate the array with input values
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt(); // Read each integer and store it in the array
        }

        // Close the scanner as no more input is needed
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]); // Print the value at index i
        }
    }
}

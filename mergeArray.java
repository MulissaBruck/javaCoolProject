
import java.util.Arrays;

public class mergeArray {
    public static void main(String[] args) {

        // Input arrays
        int a[] = { 10, 20, 30 };
        int b[] = { 40, 50, 60, 70, 80 };

        // Determining length of both arrays
        int a1 = a.length;
        int b1 = b.length;

        // Resultant array size
        int c1 = a1 + b1;

        // Creating a new array of size a1 + b1
        int[] c = new int[c1];

        // Loop to store the elements of first array into resultant array
        for (int i = 0; i < a1; i++) {
            c[i] = a[i]; // Copy elements from `a` to `c`
        }

        // Loop to concat the elements of second array into resultant array
        for (int i = 0; i < b1; i++) {
            c[a1 + i] = b[i]; // Copy elements from `b` to `c` starting at index a1
        }

        // Print the merged array
        System.out.println("Merged Array: " + Arrays.toString(c));
    }
}

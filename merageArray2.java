
import java.util.Arrays;

public class merageArray2 {
    public static void main(String[] args) {

        // Input arrays
        int[] a = { 10, 20, 30, 40 };
        int[] b = { 50, 60, 70, 80 };

        // Determine lengths of both arrays
        int a1 = a.length; // Length of array `a`
        int b1 = b.length; // Length of array `b`

        // Resultant array size
        int c1 = a1 + b1;

        // Create the resultant array
        int[] c = new int[c1];

        // Copy elements from `a` to `c` starting from index 0
        System.arraycopy(a, 0, c, 0, a1);

        // Copy elements from `b` to `c` starting from index a1
        System.arraycopy(b, 0, c, a1, b1);

        // Print the merged array
        System.out.println("Merged Array: " + Arrays.toString(c));
    }
}

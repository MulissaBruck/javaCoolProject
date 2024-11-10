import java.util.Arrays;

public class subarrayChar2 {

    public static char[] f(char[] a, int start, int len) {
        // Check for invalid start index
        if (start < 0 || start >= a.length) {
            return null; // Return null if start is out of bounds
        }

        // Check for invalid length or out-of-bounds subarray
        if (len < 0 || start + len > a.length) {
            return null; // Return null if len is invalid or if there aren't enough elements
        }

        // Create the subarray
        return Arrays.copyOfRange(a, start, start + len);
    }

    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'c', 'd', 'e' };

        // Example of valid input
        char[] result = f(arr, 1, 3); // Starting at index 1, take 3 characters
        System.out.println(Arrays.toString(result)); // Expected: [b, c, d]

        // Example of invalid start index
        char[] result2 = f(arr, 5, 2); // Start index is out of bounds
        System.out.println(result2); // Expected: null

        // Example of invalid length
        char[] result3 = f(arr, 2, 4); // Not enough elements from index 2
        System.out.println(result3); // Expected: null
    }
}

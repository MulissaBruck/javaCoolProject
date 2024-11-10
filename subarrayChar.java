public class subarrayChar {

    public static char[] f(char[] a, int start, int len) {
        // Check for invalid start index
        if (start < 0 || start >= a.length) {
            return null; // Return null if start is out of bounds
        }

        // Check for invalid length or out-of-bounds subarray
        if (len < 0 || start + len > a.length) {
            return null; // Return null if len is invalid or if there aren't enough elements
        }

        // Create a new array to store the result
        char[] result = new char[len];

        // Use a loop to copy the required elements
        for (int i = 0; i < len; i++) {
            result[i] = a[start + i]; // Copy element from 'a' to 'result'
        }

        // Return the new subarray
        return result;
    }

    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'c', 'd', 'e' };

        // Example of valid input
        char[] result = f(arr, 1, 3); // Starting at index 1, take 3 characters
        if (result != null) {
            for (char c : result) {
                System.out.print(c + " "); // Expected: b c d
            }
        } else {
            System.out.println("Invalid input!");
        }
        System.out.println();

        // Example of invalid start index
        char[] result2 = f(arr, 5, 2); // Start index is out of bounds
        if (result2 != null) {
            for (char c : result2) {
                System.out.print(c + " ");
            }
        } else {
            System.out.println("Invalid input!");
        }
        System.out.println();

        // Example of invalid length
        char[] result3 = f(arr, 2, 4); // Not enough elements from index 2
        if (result3 != null) {
            for (char c : result3) {
                System.out.print(c + " ");
            }
        } else {
            System.out.println("Invalid input!");
        }
    }
}

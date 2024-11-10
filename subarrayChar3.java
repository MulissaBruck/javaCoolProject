public class subarrayChar3 {

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
        // Example array of characters
        char[] arr = { 'j', 'a', 'v', 'a', 'd', 'e', 'v', 'o', 'p', 'e', 'r' };

        // Example of valid input: Extract 4 characters starting from index 2
        char[] result1 = f(arr, 2, 4); // Expected: {'v', 'a', 'd', 'e'}
        if (result1 != null) {
            // Using the expanded for loop to print the result
            for (int i = 0; i < result1.length; i++) {
                char c = result1[i]; // Access the character at index i
                System.out.print(c + " "); // Print character followed by space
            }
        } else {
            System.out.println("Invalid input!");
        }
        System.out.println();

        // Example of invalid start index: Start index 10 is out of bounds
        char[] result2 = f(arr, 10, 3); // Expected: null
        if (result2 != null) {
            // Using the expanded for loop to print the result
            for (int i = 0; i < result2.length; i++) {
                char c = result2[i]; // Access the character at index i
                System.out.print(c + " ");
            }
        } else {
            System.out.println("Invalid input!"); // Output: Invalid input!
        }
        System.out.println();

        // Example of invalid length: Trying to extract 5 characters starting from index
        // 6, not enough characters
        char[] result3 = f(arr, 6, 5); // Expected: null
        if (result3 != null) {
            // Using the expanded for loop to print the result
            for (int i = 0; i < result3.length; i++) {
                char c = result3[i]; // Access the character at index i
                System.out.print(c + " ");
            }
        } else {
            System.out.println("Invalid input!"); // Output: Invalid input!
        }
        System.out.println();

        // Example of valid input: Extract 3 characters starting from index 0
        char[] result4 = f(arr, 0, 3); // Expected: {'j', 'a', 'v'}
        if (result4 != null) {
            // Using the expanded for loop to print the result
            for (int i = 0; i < result4.length; i++) {
                char c = result4[i]; // Access the character at index i
                System.out.print(c + " "); // Output: j a v
            }
        } else {
            System.out.println("Invalid input!");
        }
    }
}

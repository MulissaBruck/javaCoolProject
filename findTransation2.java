import java.util.Arrays;

public class findTransation2 {

    /**
     * Computes the up-count of an array with respect to a given threshold.
     * 
     * @param a the array of integers
     * @param n the threshold value
     * @return the count of transitions from ≤ n to > n in the partial sums
     */
    public static int nUpcount(int[] a, int n) {
        int length = a.length; // Length of the array

        int previousPartialSum = 0; // Initialize the previous partial sum
        int newPartialSum; // Variable to hold the current partial sum
        int count = 0; // Counter for the number of up-count transitions

        // Iterate through the array
        for (int i = 0; i < length; i++) {
            newPartialSum = previousPartialSum + a[i]; // Calculate the new partial sum

            // Check if the transition from ≤ n to > n occurred
            if (previousPartialSum <= n && newPartialSum > n) {
                count++; // Increment count for each valid transition
            }
            previousPartialSum = newPartialSum; // Update previous partial sum for next iteration
        }

        return count; // Return the total count of up-count transitions
    }

    public static void main(String[] args) {
        int n = 5; // Threshold value

        int[] a = { 2, 3, 1, -6, 8, -3, -1, 2 }; // Example array

        // Print the result of nUpcount function
        System.out.println("Up count: " + nUpcount(a, n));
    }
}

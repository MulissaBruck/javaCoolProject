public class nCountSum {

    /**
     * Method to check if there is at least one pair of elements in the array
     * that sums to the target value 'n'.
     *
     * @param a The input array of integers.
     * @param n The target sum to check.
     * @return 1 if a pair exists that sums to 'n'; 0 otherwise.
     */
    public static int nCount(int[] a, int n) {
        int nCount = 0; // Counter to track the number of pairs that sum to 'n'

        // Iterate through each element in the array
        for (int i = 0; i < a.length; i++) {
            // For each element a[i], check subsequent elements a[j]
            for (int j = i + 1; j < a.length; j++) {
                // Check if the sum of a[i] and a[j] equals 'n'
                if ((a[i] + a[j]) == n) {
                    nCount++; // Increment the counter if a pair is found
                }
            }
        }

        // Return 1 if at least one pair was found, otherwise return 0
        return (nCount >= 1) ? 1 : 0;
    }

    /**
     * Main method to test the functionality of the nCount method.
     */
    public static void main(String[] args) {
        // Define the input array
        int[] a = { 7, 3, 3, 2, 4 };

        // Test case 1: Check if any pair sums to 6
        int n1 = 6;
        System.out.println("For n = " + n1 + ": " + nCount(a, n1));
        // Expected output: 1 (Pairs: [3, 3] and [2, 4])

        // Test case 2: Check if any pair sums to 10
        int n2 = 10;
        System.out.println("For n = " + n2 + ": " + nCount(a, n2));
        // Expected output: 1 (Pair: [7, 3])

        // Test case 3: Check if any pair sums to 5
        int n3 = 5;
        System.out.println("For n = " + n3 + ": " + nCount(a, n3));
        // Expected output: 0 (No pairs sum to 5)
    }
}

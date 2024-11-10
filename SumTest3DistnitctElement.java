public class SumTest3DistnitctElement {
    // Method to check if three distinct integers sum up to testInt using three
    // nested loops
    public static boolean testForSum(int[] intArr, int testInt) {
        // Loop through each triplet combination using three nested loops
        for (int i = 0; i < intArr.length - 2; i++) {
            for (int j = i + 1; j < intArr.length - 1; j++) {
                for (int k = j + 1; k < intArr.length; k++) {
                    // Check if the sum of the three elements equals testInt
                    if (intArr[i] + intArr[j] + intArr[k] == testInt) {
                        return true; // Found a valid triplet
                    }
                }
            }
        }
        return false; // No valid triplet found
    }

    // Main method to test the testForSum method
    public static void main(String[] args) {
        // Example test case
        int[] arr = { 5, 1, 23, 21, 17, 2, 3, 9, 12 };
        int testInt = 22;

        // Call the method and print the result
        boolean result = testForSum(arr, testInt);
        System.out.println("Test result: " + result); // Should output 'true' or 'false'
    }
}

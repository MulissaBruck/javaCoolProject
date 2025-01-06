import java.io.*;
import java.util.*;

public class threeDHourlyGlArray2 {
    public static void main(String[] args) throws IOException {
        // Use BufferedReader for efficient input reading
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Create a 2D list to store the 6x6 array
        List<List<Integer>> arr = new ArrayList<>();

        // Read the 6x6 matrix from input
        for (int i = 0; i < 6; i++) {
            // Read each row as a string, trim whitespace, and split into individual numbers
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            // Convert each number from String to Integer and store in a list
            List<Integer> arrRowItems = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]); // Parse string to integer
                arrRowItems.add(arrItem); // Add integer to the current row
            }

            // Add the row to the 2D array
            arr.add(arrRowItems);
        }

        // Close the input reader
        bufferedReader.close();

        // Initialize maxSum to the smallest possible value
        int maxSum = Integer.MIN_VALUE;

        // Iterate through possible top-left corners of hourglasses
        // Since an hourglass is a 3x3 shape, we stop at index 3 for both rows and
        // columns
        for (int i = 0; i < 4; i++) { // Loop over rows
            for (int j = 0; j < 4; j++) { // Loop over columns
                // Calculate the sum of the current hourglass
                // Top row of hourglass
                int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                // Middle element of hourglass
                        + arr.get(i + 1).get(j + 1)
                        // Bottom row of hourglass
                        + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                // Update maxSum if the current hourglass sum is greater than the current maxSum
                maxSum = Math.max(maxSum, sum);
            }
        }

        // Print the largest hourglass sum found
        System.out.println(maxSum);
    }
}

import java.util.*;

public class threeDHourlyGListArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a List of Lists to store the 6x6 grid
        List<List<Integer>> arr = new ArrayList<>();

        // Prompt user to input values row by row
        System.out.println("Please enter the 6x6 array, row by row, with each value separated by a space:");

        for (int i = 0; i < 6; i++) {
            System.out.println("Enter row " + (i + 1) + ":");
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                row.add(scanner.nextInt());
            }
            arr.add(row);
        }

        // Display the entered 6x6 array
        System.out.println("\nYou entered the following 6x6 array:");
        for (List<Integer> row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Initialize variables for the maximum sum and the hourglass values
        int maxSum = Integer.MIN_VALUE;
        List<List<Integer>> maxHourglass = new ArrayList<>();

        // Iterate through possible top-left corners of hourglasses
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Calculate the current hourglass sum
                int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) // Top row
                        + arr.get(i + 1).get(j + 1) // Middle element
                        + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2); // Bottom row

                // Update maxSum and maxHourglass if the current sum is greater
                if (sum > maxSum) {
                    maxSum = sum;

                    // Save the hourglass values
                    maxHourglass = Arrays.asList(
                            Arrays.asList(arr.get(i).get(j), arr.get(i).get(j + 1), arr.get(i).get(j + 2)),
                            Arrays.asList(0, arr.get(i + 1).get(j + 1), 0),
                            Arrays.asList(arr.get(i + 2).get(j), arr.get(i + 2).get(j + 1), arr.get(i + 2).get(j + 2)));
                }
            }
        }

        // Display the maximum hourglass sum
        System.out.println("\nThe maximum hourglass sum is: " + maxSum);

        // Display the hourglass values that contributed to the maximum sum
        System.out.println("\nThe hourglass that gives the maximum sum is:");
        for (List<Integer> row : maxHourglass) {
            for (int value : row) {
                if (value == 0) {
                    System.out.print("  "); // Print spaces for non-hourglass middle-row elements
                } else {
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}

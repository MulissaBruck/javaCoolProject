import java.util.Scanner;

public class ThreeDHourllyGlArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the 6x6 array
        int[][] arr = new int[6][6];

        // Read the array elements
        System.out.println("Please enter the elements of a 6x6 array:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // Print the entered 6x6 array
        System.out.println("\nThe entered 6x6 array is:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }

        // Initialize maxSum to the smallest possible value
        int maxSum = Integer.MIN_VALUE;

        // Iterate through each possible top-left corner of an hourglass
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Calculate the sum of the current hourglass
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] // top row
                        + arr[i + 1][j + 1] // middle row (middle element)
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]; // bottom row

                // Update the maximum sum if the current hourglass sum is greater
                maxSum = Math.max(maxSum, sum);
            }
        }

        // Print the largest hourglass sum
        System.out.println("\nThe largest hourglass sum is: " + maxSum);

        scanner.close();
    }
}

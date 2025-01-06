import java.io.*;
import java.util.*;

public class threeDHourlyGlArray3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Create a 2D array to store the 6x6 input
        int[][] arr = new int[6][6];

        // Ask the user to input values
        System.out.println("Please enter the 6x6 array, row by row, with each value separated by a space:");

        for (int i = 0; i < 6; i++) {
            System.out.println("Enter row " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // Display the entered 6x6 array
        System.out.println("\nYou entered the following 6x6 array:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Initialize variables for the maximum sum and the corresponding hourglass
        // values
        int maxSum = Integer.MIN_VALUE;
        int[][] maxHourglass = new int[3][3];

        // Iterate through all possible hourglass top-left corners
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Calculate the current hourglass sum
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] // Top row
                        + arr[i + 1][j + 1] // Middle element
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]; // Bottom row

                // Update maxSum and maxHourglass if the current sum is greater
                if (sum > maxSum) {
                    maxSum = sum;

                    // Save the hourglass values
                    maxHourglass[0][0] = arr[i][j];
                    maxHourglass[0][1] = arr[i][j + 1];
                    maxHourglass[0][2] = arr[i][j + 2];
                    maxHourglass[1][0] = 0;
                    maxHourglass[1][1] = arr[i + 1][j + 1];
                    maxHourglass[1][2] = 0;
                    maxHourglass[2][0] = arr[i + 2][j];
                    maxHourglass[2][1] = arr[i + 2][j + 1];
                    maxHourglass[2][2] = arr[i + 2][j + 2];
                }
            }
        }

        // Display the maximum hourglass sum
        System.out.println("\nThe maximum hourglass sum is: " + maxSum);

        // Display the hourglass values that contributed to the maximum sum
        System.out.println("\nThe hourglass that gives the maximum sum is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && (j == 0 || j == 2)) {
                    System.out.print("  "); // Print spaces for non-hourglass middle-row elements
                } else {
                    System.out.print(maxHourglass[i][j] + " ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}

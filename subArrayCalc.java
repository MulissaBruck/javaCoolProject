import java.io.*;
import java.util.*;

public class subArrayCalc {

    public static void main(String[] args) {
        // Prompt the user to enter the length of the array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt(); // length of the array

        // Initialize the array
        int[] arr = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Populate the array with input values
        }

        // Variable to count negative subarrays
        int negativeSubarraysCount = 0;

        // Loop through all possible subarrays
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j]; // Calculate sum of the subarray arr[i...j]
                if (sum < 0) {
                    negativeSubarraysCount++; // If the sum is negative, increment the counter
                }
            }
        }

        // Print the result
        System.out.println("Number of negative subarrays: " + negativeSubarraysCount);
    }
}

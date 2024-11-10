import java.util.Arrays;
import java.util.Scanner;

public class findFrequent2 {

    // Method to check which element in the array occurs most frequently
    public static int frequentlyOccure(int[] a) {
        int aLength = a.length; // Length of the array
        int count = 0; // Variable to store the count of current element occurrences
        int currentCount = 0; // Variable to store the maximum count so far
        int frequentNum = 0; // Variable to store the most frequent element

        // Outer loop to go through each element in the array
        for (int i = 0; i < aLength; i++) {
            count = 1; // Reset count for each new element

            System.out.println("i count: " + i); // Debug print for the current element index

            // Inner loop to compare the current element with the rest of the array
            for (int j = i + 1; j < aLength; j++) {

                System.out.println("j count: " + j); // Debug print for the inner loop index

                // If the current element matches another element, increment the count
                if (a[i] == a[j]) {
                    count++; // Increment the count when a match is found
                }
            }

            // If the count of the current element is greater than the previous max, update
            // the max count and set the most frequent element
            if (currentCount < count) {
                currentCount = count; // Update current max count
                frequentNum = a[i]; // Set the most frequent number to the current element
            }
        }

        // Print the most frequent element
        System.out.println("Most frequent item: " + frequentNum);

        return currentCount; // Return the count of the most frequent element
    }

    public static void main(String[] args) {
        // Example array with elements
        int a[] = { 4, 1, 1, 3, 1, 1 };

        // Print how many times the most frequent element occurs
        System.out.println("The most frequent element occurs: " + frequentlyOccure(a) + " times");
    }

}

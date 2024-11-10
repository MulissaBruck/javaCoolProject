import java.util.Scanner;

public class findFrequent3 {

    // Method to find the most frequent element in the array
    public static int frequentlyOccure(int[] a) {
        int aLength = a.length;
        int[] frequency = new int[101]; // Array to store frequencies (assuming elements range from 0 to 100)
        int maxFreq = 0; // Variable to store the maximum frequency
        int frequentNum = -1; // Variable to store the most frequent element

        // Traverse the array and count frequencies of each element
        for (int i = 0; i < aLength; i++) {
            frequency[a[i]]++; // Increment the count for the current element

            // If this element has a higher frequency, update the most frequent number
            if (frequency[a[i]] > maxFreq) {
                maxFreq = frequency[a[i]];
                frequentNum = a[i]; // Store the element with the highest frequency
            }
        }

        // Output the most frequent element
        System.out.println("Most frequent item: " + frequentNum);
        return maxFreq; // Return the count of the most frequent element
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the length of the array
        System.out.println("Enter the number of elements:");
        int length = input.nextInt();

        // Initialize the array
        int[] a = new int[length];

        // Read the elements of the array
        for (int i = 0; i < length; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            a[i] = input.nextInt();
        }

        // Print how many times the most frequent element occurs
        System.out.println("The most frequent element occurs: " + frequentlyOccure(a) + " times");

        // Close the scanner
        input.close();
    }
}

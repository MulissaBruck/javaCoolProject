import java.util.Scanner;

public class isTrivalent6 {

    // Method to check if the array is trivalent (contains exactly 3 distinct
    // values)
    public static int isTrivalent(int[] a) {
        int aLength = a.length;

        // If the array has fewer than 3 elements, it cannot be trivalent
        if (aLength < 3) {
            return 0;
        }

        // Initialize the first value as n1
        int n1 = a[0];
        // Initialize n2 and n3 to -1 to indicate they are uninitialized
        int n2 = -1;
        int n3 = -1;
        // Counters for occurrences of n1, n2, and n3
        int n1Count = 0;
        int n2Count = 0;
        int n3Count = 0;

        // Iterate over each element in the array
        for (int i = 0; i < aLength; i++) {
            if (a[i] == n1) {
                // Count occurrences of n1
                n1Count++;
            } else if (n2 == -1 || a[i] == n2) {
                // If n2 is not set or the current element matches n2
                if (n2 == -1) {
                    // Set n2 to the current element if n2 is uninitialized
                    n2 = a[i];
                }
                // Count occurrences of n2
                n2Count++;
            } else if (n3 == -1 || a[i] == n3) {
                // If n3 is not set or the current element matches n3
                if (n3 == -1) {
                    // Set n3 to the current element if n3 is uninitialized
                    n3 = a[i];
                }
                // Count occurrences of n3
                n3Count++;
            } else {
                // If the current element is not equal to n1, n2, or n3
                // The array is not trivalent
                return 0;
            }
        }

        // Check if there are exactly 3 distinct values and the counts sum to the array
        // length
        if (n2 != -1 && n3 != -1 && n1Count + n2Count + n3Count == aLength) {
            return 1; // The array is trivalent
        } else {
            return 0; // The array is not trivalent
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of elements
        System.out.println("Enter the number of elements:");
        int length = input.nextInt();

        // Create an array of the specified length
        int[] a = new int[length];
        // Read elements into the array from user input
        for (int i = 0; i < length; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            a[i] = input.nextInt();
        }

        // Check if the array is trivalent and display the result
        if (isTrivalent(a) == 1) {
            System.out.println("The array is trivalent.");
        } else {
            System.out.println("The array is not trivalent.");
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

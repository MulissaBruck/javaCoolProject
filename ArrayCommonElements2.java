
import java.util.*;

// Driver Class
class ArrayCommonElements2 {

    // Function to find common elements between two arrays
    private static void FindCommonElement(String[] arr1, String[] arr2) {

        // Use a HashSet to store unique common elements
        HashSet<String> set = new HashSet<>();

        // Iterate through each element in arr1
        for (int i = 0; i < arr1.length; i++) {

            // Compare with each element in arr2
            for (int j = 0; j < arr2.length; j++) {

                // Check if elements are equal
                if (arr1[i].equals(arr2[j])) {

                    // Add the common element to the set
                    set.add(arr1[i]);
                    break; // Break inner loop after finding a match
                }
            }
        }

        // Print the common elements
        System.out.println(set.toString());
    }

    // Main Method
    public static void main(String[] args) {

        // Create Array 1
        String[] arr1 = { "Article", "in", "Geeks", "for", "Geeks" };

        // Create Array 2
        String[] arr2 = { "Geeks", "for", "Geeks" };

        // Find the Common Elements
        FindCommonElement(arr1, arr2);
    }
}

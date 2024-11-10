import java.util.Arrays;

public class removeDuplicates2 {

    public static void main(String[] args) {
        // Sample array with duplicates
        int[] givenArray = { 1, 2, 3, 1, 2, 4, 5 };

        int[] result = removeDuplicates(givenArray);
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }

    static int[] removeDuplicates(int[] givenArray) {
        if (givenArray == null || givenArray.length == 0) {
            return givenArray; // Return original if null or empty
        }

        int[] output = new int[givenArray.length]; // Output array
        int counter = 0; // Counter for unique elements

        for (int i = 0; i < givenArray.length; i++) {
            boolean isDuplicate = false; // Flag for checking duplicates

            // Check if the current element is already in the output array
            for (int j = 0; j < counter; j++) {
                if (givenArray[i] == output[j]) {
                    isDuplicate = true; // Mark as duplicate
                    break; // Exit inner loop if found
                }
            }

            // If it's not a duplicate, add to output array
            if (!isDuplicate) {
                output[counter++] = givenArray[i]; // Add to output and increment counter
            }
        }

        // Create a new array with only unique elements
        return Arrays.copyOf(output, counter); // Trim the output array to the correct size
    }
}

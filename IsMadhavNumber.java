public class IsMadhavNumber {

    /*
     * Example breakdown:
     * Group 1: {10} → Sum = 10
     * Group 2: {3, 7} → Sum = 10
     * Group 3: {4, 1, 5} → Sum = 10
     * Group 4: {1, 2, 3} → Sum = 6 (Doesn't match the first element)
     */

    public static int groupCount(int[] arr) {
        int length = arr.length;
        int groupCount = 0;

        // Count groups by forming cumulative group sizes
        while (length > 0) {
            groupCount++; // Increment group count
            length -= groupCount; // Reduce length by the current group size

            // If length becomes negative, we have too many groups
            if (length < 0) {
                return -1; // Return -1 if no valid group size is found
            }
        }

        System.out.println("Group count: " + groupCount);
        return (length == 0) ? groupCount : -1; // Return -1 if there are leftover elements
    }

    public static int isMadhavArray(int[] arr) {
        int firstElement = arr[0]; // The first element to compare against
        int groupCounter = 0; // Counter for groups
        int groupSum, groupSize = 1, index = 0;

        // Check groups based on the group count
        while (groupCounter < groupCount(arr)) {
            groupSum = 0; // Reset group sum for each group
            for (int i = index; i < groupSize + index; i++) {
                groupSum += arr[i]; // Calculate sum of the current group
            }

            System.out.println("Group sum: " + groupSum);
            if (groupSum != firstElement) { // Compare group sum with the first element
                return 0; // Return 0 if sums don't match
            }

            groupCounter++; // Move to the next group
            index += groupSize; // Update index to the start of the next group
            groupSize++; // Increment group size for the next iteration
        }

        return 1; // Return 1 if the array is a valid Madhav array
    }

    public static void main(String[] args) {
        int[] arr1 = { 10, 3, 7, 4, 1, 5 }; // Example 1
        int[] arr2 = { 6, 2, 4, 1, 2, 3 }; // Example 2

        // Output result for arr1
        if (isMadhavArray(arr1) == 1) {
            System.out.println("The array is a valid Madhav array.");
        } else {
            System.out.println("The array is NOT a valid Madhav array.");
        }

        // Output result for arr2
        if (isMadhavArray(arr2) == 1) {
            System.out.println("The array is a valid Madhav array.");
        } else {
            System.out.println("The array is NOT a valid Madhav array.");
        }
    }
}

public class findGroupSum3 {

    // Method to determine if the array can be divided into groups that all sum to
    // the first element
    public static int findGroupSumEqual(int[] arr) {
        int targetSum = arr[0]; // The target sum to match (the first element of the array)
        int groupSum; // Variable to hold the sum of the current group
        int groupIndex, currentIndex = 0; // Indices for group summation and tracking

        int groupSize = findGroup(arr); // Determine how many groups can be formed

        // If no valid group size found, return 0
        if (groupSize == -1) {
            return 0;
        }

        // Loop through the number of groups to check their sums
        for (int i = 0; i < groupSize; i++) {
            groupSum = 0; // Reset group sum for each group

            // Calculate the sum of the current group
            for (groupIndex = currentIndex; groupIndex <= i + currentIndex; groupIndex++) {
                groupSum += arr[groupIndex]; // Sum the elements in the current group
            }

            // Print the sum of the current group
            System.out.println("Group " + (i + 1) + ": Sum = " + groupSum);

            // If the group's sum does not match the target sum, return 0
            if (groupSum != targetSum) {
                return 0;
            }

            // Update the current index for the next group
            currentIndex = groupIndex + 1; // Move to the next group
        }

        return 1; // Return 1 if all groups match the target sum
    }

    // Method to find a valid group size based on cumulative sums
    public static int findGroup(int[] arr) {
        int n = arr.length; // Length of the array
        int cumulativeSum = 0; // Cumulative sum to track group sizes

        // Loop to calculate cumulative sums and find a valid group size
        for (int i = 1; i < n; i++) {
            cumulativeSum += i; // Add current index to cumulative sum
            if (cumulativeSum == n) { // Check if cumulative sum matches array length
                return i; // Return the group size if valid
            }
        }

        // Return -1 if no valid group size is found
        return -1;
    }

    // Main method to run the program and test the functions
    public static void main(String[] args) {
        int[] a = { 6, 2, 4, 1, 2, 3 }; // Test array 1
        int[] b = { 10, 6, 4, 1, 3, 7, 1, 2, 3, 4 }; // Test array 2
        int[] c = { 15, 10, 5, 5, 3, 7, 4, 1, 3, 7, 1, 2, 3, 4, 5 }; // Test array 3

        // Print results for each test array
        System.out.println("Result for array a: " + findGroupSumEqual(a));
        System.out.println(".....................");
        System.out.println("Result for array b: " + findGroupSumEqual(b));
        System.out.println(".....................");
        System.out.println("Result for array c: " + findGroupSumEqual(c));
    }
}

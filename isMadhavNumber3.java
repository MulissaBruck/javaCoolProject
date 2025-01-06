public class isMadhavNumber3 {

    public static int isMadhavArray(int[] arr) {
        int groupCount = 0, groupElement = 1, len = arr.length;

        // Check if the array length matches the sum of the series (1 + 2 + 3 + ...)
        while (len > 0) {
            len = len - groupElement;
            groupElement++;
            groupCount++;
        }
        if (len != 0) {
            return 0; // Not a Madhav array if length is invalid
        }

        int indexStart = 0, sum = 0, groupSize = 1;

        // Iterate through groups to check their sums
        for (int i = 0; i < groupCount; i++) {
            sum = 0;
            for (int j = indexStart; j < groupSize + indexStart; j++) {
                sum += arr[j]; // Calculate sum of current group
            }
            System.out.println("Sum of group " + (i + 1) + ": " + sum); // Debugging output

            if (sum != arr[0]) {
                return 0; // If any group sum doesn't match arr[0], it's invalid
            }
            indexStart = groupSize + indexStart; // Move indexStart to the next group
            groupSize++; // Increase group size for the next group
        }

        return 1; // Valid Madhav array
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

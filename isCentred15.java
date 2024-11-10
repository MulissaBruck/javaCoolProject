public class isCentred15 {

    public static int isCentered15(int[] a) {
        // If the array has less than 1 element, it's not centered.
        if (a.length < 3) {
            return 0;
        }

        // Start from the middle and progressively include elements from both sides.
        int mid = a.length / 2;

        // Odd-length array: check if a single middle element equals 15
        if (a[mid] == 15) {
            return 1;
        }

        // Check progressively larger subarrays centered around the middle
        for (int i = 1; i <= mid; i++) {
            int leftIndex = mid - i;
            int rightIndex = mid + i;

            if (leftIndex >= 0 && rightIndex < a.length) {
                int sum = 0;
                for (int j = leftIndex; j <= rightIndex; j++) {
                    sum += a[j];
                }
                if (sum == 15) {
                    return 1;
                }
            }
        }

        // If no centered sum equals 15, return 0
        return 0;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] givenArray1 = { 3, 2, 10, 4, 1, 6, 9 };
        System.out.println("Test Case 1 Result: " + isCentered15(givenArray1)); // Should return 1

        // Test case 2
        int[] givenArray2 = { 9, 15, 6 };
        System.out.println("Test Case 2 Result: " + isCentered15(givenArray2)); // Should return 1

        // Test case 3 with a focused example
        int[] givenArray3 = { 1, 4, 7, 3, 5, 6, 1, 8, 6, 9, 12, 0, 3 };
        System.out.println("Test Case 3 Result: " + isCentered15(givenArray3)); // Should return 0
    }
}

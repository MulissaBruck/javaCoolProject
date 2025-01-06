public class evenIncOddDecOrder2 {

    public static boolean isEvenIncOddDecOrder(int[] arr) {
        int evenLast = arr[0], oddLast = arr[1];

        for (int i = 2; i < arr.length; i++) {
            if (i % 2 == 0) { // Even index
                if (arr[i] < evenLast) {
                    return false; // Break if even sequence is not increasing
                }
                evenLast = arr[i]; // Update evenLast
            } else { // Odd index
                if (arr[i] > oddLast) {
                    return false; // Break if odd sequence is not decreasing
                }
                oddLast = arr[i]; // Update oddLast
            }
        }
        return true; // If all checks passed, return true
    }

    public static void main(String[] args) {
        int[] a = { 1, 6, 3, 4, 8, 2 }; // Test array

        System.out.println(isEvenIncOddDecOrder(a)); // Output: true or false
    }
}

public class findTransation3 {

    public static int TranstionCount(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int threshold = n; // Renamed variable for clarity
            if (arr[i] < threshold && arr[i + 1] > threshold) {
                count++; // Upward transition
            }
            if (arr[i] > threshold && arr[i + 1] < threshold) {
                count++; // Downward transition
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 5; // Threshold value

        int[] a = { 2, 3, 1, -6, 8, -3, -1, 2 }; // Example array

        // Print the result of nUpcount function
        System.out.println("Up count: " + TranstionCount(a, n));
    }
}

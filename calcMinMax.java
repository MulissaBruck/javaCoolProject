public class calcMinMax {
    public static int calcMinMax(int[] a) {

        // Check if the array is null or has less than 2 elements
        if (a == null || a.length < 2) {
            return -1; // Return -1 for invalid input
        }
        int length = a.length;
        int min = a[0], max = a[0];
        for (int i = 1; i < length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        // Example arrays
        int[] allelements1 = { 3, 4, 2, 6, 8, 54 }; // Valid input
        int[] allelements2 = { 5 }; // Single element, should return -1
        int[] allelements3 = null; // Null input, should return -1

        // Test cases
        System.out.println("Difference for allelements1: " + calcMinMax(allelements1)); // Expected output: 52
        System.out.println("Difference for allelements2: " + calcMinMax(allelements2)); // Expected output: -1
        System.out.println("Difference for allelements3: " + calcMinMax(allelements3)); // Expected output: -1
    }

}

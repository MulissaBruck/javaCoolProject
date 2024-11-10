public class calMinMax2 {

    public static int func6(int[] array) {
        // Check if the array is null or has less than 2 elements
        if (array == null || array.length < 2) {
            return -1; // Return -1 for invalid input
        }

        // Initialize belement and selement with the first element of the array
        int belement = array[0];
        int selement = array[0];

        int length = array.length;

        // Iterate through the array to find the maximum and minimum elements
        for (int i = 1; i < length; i++) {
            if (array[i] > belement) {
                belement = array[i]; // Update belement if the current element is larger
            }
            if (array[i] < selement) {
                selement = array[i]; // Update selement if the current element is smaller
            }
        }

        // Return the difference between the maximum and minimum elements
        return belement - selement;
    }

    public static void main(String[] args) {
        // Example arrays
        int[] allelements1 = { 3, 4, 2, 6, 8, 54 }; // Valid input
        int[] allelements2 = { 5 }; // Single element, should return -1
        int[] allelements3 = null; // Null input, should return -1

        // Test cases
        System.out.println("Difference for allelements1: " + func6(allelements1)); // Expected output: 52
        System.out.println("Difference for allelements2: " + func6(allelements2)); // Expected output: -1
        System.out.println("Difference for allelements3: " + func6(allelements3)); // Expected output: -1
    }
}

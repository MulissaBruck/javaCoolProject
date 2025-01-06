public class findFrequencyOfArray2 {

    public static int mostFrequentCount(int[] arr) {
        int maxElement = Integer.MIN_VALUE;

        // Find the maximum value in the array
        for (int value : arr) {
            if (value > maxElement) {
                maxElement = value;
            }
        }

        // Create a counted array large enough to hold frequencies of all possible
        // values
        int[] counted = new int[maxElement + 1];

        // Count occurrences
        for (int value : arr) {
            counted[value]++;
        }

        // Find the maximum frequency
        int maxCount = 0;
        for (int count : counted) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        // Example arrays with elements
        int[] a = { 4, 1, 1, 3, 1, 1 };
        int[] b = { 1, 1, 1, 2, 2 };

        // Print how many times the most frequent element occurs
        System.out.println("The most frequent element in array A occurs: " + mostFrequentCount(a) + " times");
        System.out.println("The most frequent element in array B occurs: " + mostFrequentCount(b) + " times");
    }
}

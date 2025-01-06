public class frequencyCounter4 {

    /**
     * Counts the frequency of each element in the array.
     * 
     * @param arr the input array of integers
     */
    public static void countElementFrequencies(int[] arr) {

        // Step 1: Find the maximum value in the array to size the frequency array
        // dynamically
        int max = 0;
        for (int num : arr) {
            if (num > max) {
                max = num; // Track the maximum value
            }
        }

        // Step 2: Create a frequency array sized to the maximum value
        int[] frequencyArr = new int[max + 1];

        // Step 3: Count occurrences of each number
        for (int num : arr) {
            frequencyArr[num]++;
        }

        // Step 4: Print the frequency of each unique element
        System.out.println("Element : Frequency");
        for (int i = 0; i < frequencyArr.length; i++) {
            if (frequencyArr[i] > 0) { // Only print elements with non-zero frequency
                System.out.println(i + " : " + frequencyArr[i]);
            }
        }
    }

    public static void main(String[] args) {
        // Example input array
        int[] arr = { 2, 3, 5, 6, 2, 3 };

        // Count and display element frequencies
        countElementFrequencies(arr);
    }
}

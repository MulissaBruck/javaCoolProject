public class frequencyCounter {

    /**
     * Counts the frequency of each element in the input array and prints the
     * results.
     * 
     * @param arr the input array of integers
     */
    public static void countElementFrequencies(int[] arr) {
        // Determine the maximum value in the array to set the size of the frequency
        // array
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) { // Expanded for loop
            int num = arr[i]; // Explicitly access the array element
            if (num > maxValue) {
                maxValue = num; // Update maxValue if current number is greater
            }
        }

        // Create a frequency array of size (maxValue + 1)
        int[] frequencyArray = new int[maxValue + 1]; // This assumes the numbers in arr are non-negative

        // Count the frequencies using expanded for loop and frequencyArray[arr[i]]++
        for (int i = 0; i < arr.length; i++) { // Expanded for loop
            frequencyArray[arr[i]]++; // Increment the frequency of the element arr[i]
        }

        // Print the frequencies of each element
        System.out.println("Element Frequencies:");
        for (int i = 0; i < frequencyArray.length; i++) { // Iterate over the frequency array
            if (frequencyArray[i] > 0) { // Only print elements with non-zero frequency
                System.out.println(i + " : " + frequencyArray[i]); // Print element and its frequency
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

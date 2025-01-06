public class findUniqueElements4 {
    public static int[] findUniqueElements(int[] arr) {
        // Step 1: Find the maximum value in the input array
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // Step 2: Create a frequency array to track occurrences of each element
        int[] frequency = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            frequency[arr[i]]++;
        }
        // Step 3: Count the number of unique elements
        int uniqueCount = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }
        // Step 4: Create an array to store only unique elements
        int[] uniqueElements = new int[uniqueCount];
        int index = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                uniqueElements[index] = i;
                index++;
            }
        }
        return uniqueElements; // Return the array containing only unique elements
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 3, 5, 6, 2 }; // Example input array
        int[] uniqueElements = findUniqueElements(arr);
        // Print unique elements
        System.out.print("Unique elements: ");
        for (int num : uniqueElements) {
            System.out.print(num + " "); // Output: 2 3 5 6
        }
    }
}

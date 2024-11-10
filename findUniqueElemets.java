public class findUniqueElemets {
    public static int[] findUniqueElements(int[] arr) {
        // Step 1: Count unique elements
        int uniqueCount = 0;

        // Temporary array to store unique elements
        int[] tempUnique = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true; // Assume the element is unique
            for (int j = 0; j < uniqueCount; j++) { // Check against current unique elements
                if (arr[i] == tempUnique[j]) {
                    isUnique = false; // Found a duplicate
                    break; // No need to check further
                }
            }
            if (isUnique) {
                // Store the unique element
                tempUnique[uniqueCount] = arr[i];
                uniqueCount++; // Increment count of unique elements
            }
        }

        // Step 2: Create an array of the exact size for unique elements
        int[] uniqueArray = new int[uniqueCount];
        for (int k = 0; k < uniqueCount; k++) {
            uniqueArray[k] = tempUnique[k]; // Copy unique elements
        }
        return uniqueArray;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 3, 5, 6, 2 }; // Example input array
        int[] uniqueElements = findUniqueElements(arr);

        // Print unique elements
        System.out.print("Unique elements: ");
        for (int num : uniqueElements) {
            System.out.print(num + " "); // Output should be: 3 5 2 6
        }
    }
}

public class isTrivalent2 {

    public static int isTrivalent(int[] a) {
        int[] triv = new int[3];
        triv[0] = a[0];
        int count = 1;

        // Step 1: Collect up to 3 unique values in triv
        for (int i = 1; i < a.length && count < 3; i++) {
            int matchCount = 0;

            // Check if the current element already exists in triv
            for (int j = 0; j < count; j++) {
                if (triv[j] == a[i]) {
                    matchCount++;
                }
            }

            // If the element is unique (no matches found), add it to triv
            if (matchCount == 0) {
                triv[count] = a[i];
                count++;
            }
        }

        // If less than 3 unique values found, the array is not trivalent
        if (count < 3) {
            return 0;
        }

        // Step 2: Check that each element matches one of the three values in triv
        for (int i = 0; i < a.length; i++) {
            int matchCount = 0;

            // Count occurrences of a[i] in triv
            for (int j = 0; j < 3; j++) {
                if (triv[j] == a[i]) {
                    matchCount++;
                }
            }

            // If matchCount is 0, the element does not belong to triv's unique values
            if (matchCount == 0) {
                return 0;
            }
        }

        // Print the unique values in triv for debugging purposes
        System.out.println("Unique values:");
        System.out.println("triv[0]: " + triv[0]);
        System.out.println("triv[1]: " + triv[1]);
        System.out.println("triv[2]: " + triv[2]);

        return 1; // Array is trivalent
    }

    public static void main(String[] args) {
        // Example array to check
        int[] arr = { 2, 5, 2, 3, 5, 3, 2, 5, 3, 5 };

        // Output result
        if (isTrivalent(arr) == 1) {
            System.out.println("The array is trivalent.");
        } else {
            System.out.println("The array is not trivalent.");
        }
    }
}

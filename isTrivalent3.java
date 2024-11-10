public class isTrivalent3 {

    public static int isTrivalent(int[] a) {
        int[] triv = new int[3];
        int count = 0;

        // Step 1: Collect up to 3 unique values in triv
        for (int i = 0; i < a.length && count < 3; i++) {
            int matchFound = 0;

            // Check if the current element already exists in triv
            for (int j = 0; j < count; j++) {
                if (triv[j] == a[i]) {
                    matchFound++;
                }
            }

            // If it's a new unique element, add it to triv
            if (matchFound == 0) {
                triv[count] = a[i];
                count++;
            }
        }

        // If less than 3 unique values are found, return 0 (not trivalent)
        if (count < 3) {
            return 0;
        }

        // Step 2: Verify that all elements in `a` match one of the unique values in
        // triv
        for (int i = 0; i < a.length; i++) {
            int isMatch = 0;

            // Check if the element in `a` matches any of the values in `triv`
            for (int j = 0; j < 3; j++) {
                if (triv[j] == a[i]) {
                    isMatch++;
                }
            }

            // If no match is found for an element, return 0 (not trivalent)
            if (isMatch == 0) {
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

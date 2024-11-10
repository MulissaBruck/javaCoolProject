public class match5 {

    public static int match(int[] a, int[] p) {
        int index_a = 0; // To keep track of the position in array 'a'

        for (int i = 0; i < p.length; i++) {
            int pValue = p[i]; // Get the current value from 'p'

            // If pValue is negative, convert it to positive for counting
            if (pValue < 0) {
                pValue = pValue * -1; // Convert pValue to positive
                // Negative match: Check if the next 'pValue' elements in 'a' are negative
                for (int j = index_a; j < pValue + index_a; j++) {
                    if (a[j] >= 0) { // If any element is positive or zero, return 0
                        return 0;
                    }
                }
            } else {
                // Positive match: Check if the next 'pValue' elements in 'a' are positive
                for (int j = index_a; j < pValue + index_a; j++) {
                    if (a[j] < 0) { // If any element is negative, return 0
                        return 0;
                    }
                }
            }

            // Update index_a to move forward in 'a' by the number of elements checked
            index_a += pValue;
        }

        // Ensure all elements of 'a' are processed
        return (index_a == a.length) ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, -5, -5, 2, 3, 18 }; // Example array 'a'
        int[] p = { 3, -2, 3 }; // Example pattern 'p'

        System.out.println(match(a, p)); // Output should be 1 if match, 0 if no match
    }
}

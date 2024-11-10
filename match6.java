public class match6 {

    public static int match(int[] a, int[] p) {
        int pLength = p.length;
        int aLength = a.length;
        int aCount = 0; // Tracks the current position in array 'a'
        int totalPatternLength = 0; // To check total length covered by pattern

        // Calculate total length of pattern segments
        for (int i = 0; i < pLength; i++) {
            totalPatternLength += Math.abs(p[i]);
        }

        // Check if total pattern length matches the length of 'a'
        if (totalPatternLength != aLength) {
            return 0; // Pattern length mismatch
        }

        // Process each segment defined in 'p'
        for (int i = 0; i < pLength; i++) {
            String pSign = (p[i] > 0) ? "Positive" : "Negative";
            int segmentLength = Math.abs(p[i]); // Get the length of the current segment
            int startCount = aCount; // Save the current aCount to check length later

            // Process the current segment
            for (int j = 0; j < segmentLength; j++) {
                if (aCount >= aLength) {
                    return 0; // Ensure we don't go out of bounds in 'a'
                }

                String aSign = (a[aCount] > 0) ? "Positive" : "Negative";

                // Compare signs
                if (!aSign.equals(pSign)) {
                    return 0; // Sign mismatch
                }

                aCount++; // Move to the next element in 'a'
            }

            // Check if the segment length matches exactly
            if (aCount - startCount != segmentLength) {
                return 0; // Segment length mismatch
            }
        }

        // Ensure all elements in 'a' were processed
        return (aCount == aLength) ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, -5, -5, 2, 3, 18 };
        int[] p = { 2, 1, -1, -1, 2, 1 };

        System.out.println(match(a, p)); // Expected output: 1 (pattern matches correctly)

        // Additional test cases
        int[] a2 = { 1, 2, 3, -5, -5, 2, 3, 18 };
        int[] p2 = { 4, -1, 3 };
        System.out.println(match(a2, p2)); // Expected output: 0 (pattern does not match)

        int[] a3 = { 1, 2, 3, -5, -5, 2, 3, 18 };
        int[] p3 = { 2, -3, 3 };
        System.out.println(match(a3, p3)); // Expected output: 0 (pattern does not match)
    }
}

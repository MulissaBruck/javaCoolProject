public class match3 {

    public static int matchPattern(int[] a, int[] p) {
        int counter = 0; // Counter to track matching elements
        int leftCounter = 0; // Tracks current position in `a`

        // Loop over each pattern segment
        for (int i = 0; i < p.length; i++) {
            int segmentLength;

            // Check if `p[i]` is positive or negative to determine the segment length
            if (p[i] > 0) {
                segmentLength = p[i];
            } else {
                segmentLength = -p[i];
            }

            // Process each element in the current segment
            for (int j = leftCounter; j < leftCounter + segmentLength; j++) {
                System.out.println("left counter :" + leftCounter);

                // Check if signs of `p[i]` and `a[j]` match
                if ((p[i] > 0 && a[j] <= 0) || (p[i] < 0 && a[j] >= 0)) {
                    return 0; // Mismatch in sign
                }

                // Increment the match counter if signs match
                counter++;
            }

            // Update `leftCounter` to the start of the next segment
            leftCounter += segmentLength;
        }

        System.out.println("Total matched counter :" + counter);

        // Ensure that every element in `a` was matched correctly
        return (counter == a.length) ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, -5, -5, 2, 3, 18 };
        int[] p = { 2, 1, -2, 2, 1 };

        System.out.println("Result: " + matchPattern(a, p)); // Expected output: 1
    }
}

public class match4 {

    public static int matchPattern(int[] a, int[] p) {
        int counter = 0; // Counter to track matching elements
        int leftCounter = 0; // Tracks current position in `a`

        // Loop over each pattern segment
        for (int i = 0; i < p.length; i++) {

            for (int j = leftCounter; j < leftCounter + Math.abs(p[i]); j++) {
                System.out.println("left counter :" + leftCounter);

                // Check if signs of the pattern segment and `a[j]` match
                if (checkNumber(p[i]) != checkNumber(a[j])) {
                    return 0; // Mismatch in sign
                }

                // Increment the match counter if signs match
                counter++;
            }

            // Update `leftCounter` to the start of the next segment
            leftCounter += Math.abs(p[i]);
        }

        System.out.println("Total matched counter :" + counter);

        // Ensure that every element in `a` was matched correctly
        return (counter == a.length) ? 1 : 0;
    }

    // Helper method to determine if a number is positive or negative
    public static int checkNumber(int number) {
        return (number > 0) ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, -5, -5, 2, 3, 18 };
        int[] p = { 2, 1, -2, 2, 1 };

        System.out.println("Result: " + matchPattern(a, p)); // Expected output: 1
    }
}

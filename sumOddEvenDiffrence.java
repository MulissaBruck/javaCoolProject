public class sumOddEvenDiffrence {

    public static int diffrence(int[] a) {

        int length = a.length;
        int oddSum = 0, evenSum = 0;

        for (int i = 0; i < length; i++) {

            if (a[i] % 2 == 0) {
                evenSum = evenSum + a[i];
            } else
                oddSum = oddSum + a[i];
        }

        return oddSum - evenSum;

    }

    public static void main(String[] args) {

        // Example array to calculate the difference
        int[] givenArray = { 2, 3, 7, 4, 1 };

        // Calculate and print the difference
        System.out.println("Difference between sum of odd and even numbers: " + diffrence(givenArray));

    }
}

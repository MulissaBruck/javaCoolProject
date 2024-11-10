public class isDivisable {

    public static int isDivisible(int[] a, int divisor) {

        int length = a.length;

        for (int i = 0; i < length; i++) {

            if (a[i] % divisor != 0) {

                return 0;
            }

        }

        return 1;
    }

    public static void main(String[] args) {
        // Initialize an array with some integers
        int[] a = { 6, 3, 9, 18, 20 };
        int[] b = { 6, 3, 9, 18 };

        // Specify the divisor
        int divisor = 3;

        // Call the isDivisible method and store the result
        int result = isDivisible(a, divisor);
        int result2 = isDivisible(b, divisor);

        // Print the result to the console
        System.out.println("Are all elements divisible by " + divisor + "? " + result);
        System.out.println("Are all elements divisible by " + divisor + "? " + result2);
    }
}

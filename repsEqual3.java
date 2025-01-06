public class repsEqual3 {
    public static int repsEqual(int[] arr, int n) {

        int expo = 1, length = arr.length, index = 1, sum = 0;
        for (int i = length - 1; i >= 0; i--) {

            sum = sum + arr[i] * expo;

            System.out.println(sum);
            expo = expo * 10;
        }

        return 1;
    }

    public static void main(String[] args) {
        // Define an array `a` representing the digits of the number (e.g., 3, 2, 4, 5
        // -> 3245)
        int[] a = { 3, 2, 4, 5 };

        // Define the number `n` that we want to compare with the number represented by
        // the array `a`
        int n = 3245;

        // Call the `repsEqual` method with the array `a` and the number `n`, and print
        // the result
        System.out.println(repsEqual(a, n)); // This should print 1 since `a` represents `n`

    }
}

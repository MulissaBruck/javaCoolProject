public class repsEqual {

    public static int repsEqual(int[] a, int n) {
        if (convertArray(a) == n) {

            return 1;
        } else
            return 0;

    }

    public static int convertArray(int[] a) {

        int sum = 0;
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            index = a.length - i;

            sum = sum + a[i] * exponent(index);
            System.out.println(sum);
        }

        return sum;
    }

    public static int exponent(int index) {
        int base = 1;
        int exp = index - 1;

        while (exp > 0) {

            base = base * 10;
            exp--;
        }

        return base;
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

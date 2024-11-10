public class reversInteger {

    public static int reverseInteger(int n) {

        int num = n;
        int count = 0;
        int sum = 0;

        if (n < 0) {

            num = n * -1;

        }
        int digit = num;
        while (digit > 0) {
            digit = digit / 10;
            count++;
        }
        while (num > 0) {

            int dig = num % 10;
            sum = sum + dig * exponent(count);
            count--;
            num = num / 10;

        }

        if (n < 0)
            return sum * -1;
        else
            return sum;

    }

    public static int exponent(int count) {
        int base = 1;
        while (count - 1 > 0) {
            base = base * 10;

            count--;
        }

        return base;
    }

    public static void main(String[] args) {
        // Test cases from the example
        System.out.println(reverseInteger(1234)); // Output: 4321
        System.out.println(reverseInteger(12005)); // Output: 50021
        System.out.println(reverseInteger(1)); // Output: 1
        System.out.println(reverseInteger(1000)); // Output: 1
        System.out.println(reverseInteger(0)); // Output: 0
        System.out.println(reverseInteger(-12345)); // Output: -54321
    }

}

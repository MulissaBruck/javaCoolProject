public class reversInteger3 {

    public static int reverseInteger(int n) {
        int countDigt = 0, digits = 0, sum = 0, numc = 0;

        boolean isNegative = n < 0 ? true : false;

        if (isNegative == true) {
            n = -1 * n;
        }
        numc = n;

        while (numc > 0) {
            numc = numc / 10;
            countDigt++;
        }
        while (n > 0) {
            System.out.println("after sign " + n);
            digits = n % 10;
            sum = sum + digits * (ExpoBase10(countDigt));
            System.out.println("exp" + ExpoBase10(countDigt));
            n = n / 10;
            countDigt--;
        }
        System.out.println(sum);
        if (isNegative == true) {
            sum = sum * -1;
        }
        return sum;
    }

    public static int ExpoBase10(int times) {
        int expSum = 1;
        while (times - 1 > 0) {
            expSum = expSum * 10;
            times--;
        }
        return expSum;
    }

    public static void main(String[] args) {
        // Test cases to validate the function
        System.out.println(reverseInteger(-78945));
        // Output: -54321
        /*
         * System.out.println(reverseInteger(12005)); // Output: 50021
         * System.out.println(reverseInteger(1)); // Output: 1
         * System.out.println(reverseInteger(1000)); // Output: 1
         * System.out.println(reverseInteger(0)); // Output: 0
         */// System.out.println(reverseInteger(-120)); // Output: -21
    }
}

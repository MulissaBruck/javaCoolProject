public class powerOf2AplusB3 {

    public static int powerOf2Plus(int a, int b, int n) {

        int sumOfPower = 0, sum = 0, index = 0;
        while (n > 0) {

            sumOfPower = sumOfPower + exponent(index);
            // System.out.println(exponent(index) + "........." + index);
            sum = a + b;
            System.out.println(sumOfPower * sum);
            n--;
            index++;
        }
        return 1;
    }

    public static int exponent(int n) {
        if (n == 0) {
            return 1;
        }
        int exp = 1;
        while (n > 0) {
            exp = exp * 2;
            n--;
        }
        return exp;
    }

    public static void main(String[] args) {
        int a = 0, b = 0, n = 0;
        a = 0;
        b = 2;
        n = 3;

        System.out.println(powerOf2Plus(a, b, n));
    }

}

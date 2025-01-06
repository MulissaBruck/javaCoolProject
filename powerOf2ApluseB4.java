public class powerOf2ApluseB4 {

    public static int powerOf2Plus(int a, int b, int n) {
        int powerSum = 0;
        for (int i = 0; i < n; i++) {
            int sum = a + b;
            powerSum = powerSum + power(i);
            System.out.println(powerSum * sum);
        }
        return 1;
    }

    public static int power(int n) {
        int exp = 1;
        if (n == 0) {
            return 1;
        }
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

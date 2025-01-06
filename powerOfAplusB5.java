public class powerOfAplusB5 {
    public static int powerOf2Plus(int a, int b, int n) {
        int expSum = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum = a + b;
            // System.out.println(Math.pow(2, i));
            expSum += Math.pow(2, i);
            System.out.println(expSum + "*" + sum);
        }

        return 1;
    }

    public static void main(String[] args) {
        int a = 0, b = 0, n = 0;
        a = 0;
        b = 2;
        n = 3;

        System.out.println(powerOf2Plus(a, b, n));
    }
}

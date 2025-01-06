public class findLCMmultiples2 {
    public static int findSmallCM(int n1, int n2) {

        int[] fact1 = new int[10];
        int GCD = 0;

        for (int i = 1; i < fact1.length; i++) {
            if (n1 % i == 0) {
                fact1[i - 1] = i;
                System.out.println(fact1[i - 1]);

            }
        }
        for (int i = fact1.length - 1; i > 0; i--) {
            if (n2 % i == 0) {
                int num = i;
                System.out.println(" i :" + i);
                for (int j = fact1.length - 1; j > 0; j--) {
                    if (fact1[j] == num) {
                        return (n1 * n2) / i;
                    }
                }

            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int n1 = 8, n2 = 12;

        System.out.println(findSmallCM(n1, n2));

    }

}

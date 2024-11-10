public class countSquarePairs {

    public static int countSquarePair(int[] a) {

        int sum = 0, k, count = 0, countNext = 1, j;
        for (int i = 0; i < a.length; i++) {
            sum = 0;
            for (j = 1; j < a.length; j++) {
                if (i == j) {
                    break;
                }
                sum = a[i] + a[j];
                k = 1;
                while (k * k != sum && k < sum / 2) {

                    k++;
                }
                if (k * k == sum) {
                    System.out.println(k * k + "== " + sum);
                    count++;
                }

            }

            if (count == 0) {
                return 0;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        // Example array to check
        int[] arr = { 9, 0, 4, 16 };

        // Output result
        System.out.println("Total square pairs: " + countSquarePair(arr));
    }
}

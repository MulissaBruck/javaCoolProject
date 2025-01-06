public class match7 {

    public static int matchPattern(int[] arr, int[] patrn) {

        int patrnSum = 0;
        for (int i = 0; i < patrn.length; i++) {

            if (patrn[i] > 0)
                patrnSum += patrn[i];
            else
                patrnSum += -1 * patrn[i];

        }

        if (arr.length != patrnSum) {
            return 0;
        }
        int indexStart = 0;
        for (int i = 0; i < patrn.length; i++) {
            for (int j = indexStart; j < patrn[j]; j++) {

                if (patrn[i] > 0 && arr[j] < 0 || patrn[i] < 0 && arr[j] > 0) {
                    return 0;
                }
                System.out.println("patern" + patrn[i]);
                System.out.println("arr " + arr[j]);

                if (patrn[j] > 0)
                    indexStart += patrn[j];
                else
                    indexStart += -1 * patrn[j];
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, -5, -5, 2, 3, 18, 9 };
        int[] p = { 2, 1, -2, 2, 1, 1 };

        System.out.println("Result: " + matchPattern(a, p)); // Expected output: 1
    }
}

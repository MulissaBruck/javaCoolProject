public class isGuthericSequence {

    public static int isGuthericSequence(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 == 1) {

                if (checkOddNextNum(a[i]) != a[i + 1]) {
                    return 0;

                }
            }
            if (a[i] % 2 == 0) {
                if (checkEvenNextNum(a[i]) != a[i + 1]) {
                    return 0;

                }

            }

        }
        return 1;
    }

    public static int checkOddNextNum(int currentNum) {

        int nextNum = currentNum * 3 + 1;

        return nextNum;
    }

    public static int checkEvenNextNum(int currentNum) {

        int nextNum = currentNum / 2;

        return nextNum;
    }

    public static void main(String[] args) {
        // Test case where the array matches the Guthrie sequence
        int[] a = { 5, 16, 8, 4, 2, 1 };
        System.out.println(isGuthericSequence(a)); // Output: 1

        int[] b = { 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1 };
        System.out.println(isGuthericSequence(b)); // Output: 1

    }

}

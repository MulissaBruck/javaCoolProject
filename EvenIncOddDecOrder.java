import java.util.Arrays;

public class EvenIncOddDecOrder {

    public static int evenInc(int[] a) {

        int length = a.length;

        for (int i = 0; i < length - 2; i++) {

            if (i % 2 == 0 && !(a[i] < a[i + 2])) {

                return 0;
            }
        }

        return 1;
    }

    public static int oddDec(int[] a) {

        int length = a.length;

        for (int i = 0; i < length - 1; i++) {

            if (i % 2 == 1 && !(a[i] > a[i + 2])) {
                return 0;

            }
        }

        return 1;
    }

    public static int EvenIncOddDecOrder(int[] a) {

        if (evenInc(a) == 1 && oddDec(a) == 1) {
            return 1;
        } else
            return 0;

    }

    public static void main(String[] args) {

        int[] a = { 1, 6, 3, 4, 8, 2 }; // This is the test array

        System.out.println((EvenIncOddDecOrder(a)));

    }

}

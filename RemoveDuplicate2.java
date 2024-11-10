import java.util.Arrays;

public class RemoveDuplicate2 {

    public static int[] removeDuplicate(int[] a) {

        int length = a.length;

        int[] ar = new int[length];

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length - 1; j++)

                if (a[i] != a[j] && exist(ar, a[i]) == 0) {
                    ar[i] = a[i];
                }

        }

        return ar;
    }

    public static int exist(int[] ar, int value) {
        int length = ar.length;
        for (int i = 0; i < length; i++) {
            if (value == ar[i]) {
                return 1;
            }

        }
        return 0;
    }

    public static void main(String[] args) {

        int[] a = { 2, 3, 5, 6, 5, 2 };
        System.out.println(Arrays.toString(removeDuplicate(a)));

    }

}
import java.util.Arrays;

public class commonElement {
    public static int[] commonElement(int[] a, int[] b) {

        int counter = 0;
        int index;

        if (a.length < b.length) {

            index = a.length;
        } else {
            index = b.length;

        }
        int[] common = new int[index];

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

                if (a[i] == b[j] && exist(common, a[i]) == 0) {
                    common[counter] = a[i];

                    counter++;

                }
            }
        }

        int[] c = new int[counter];
        for (int i = 0; i < counter; i++) {
            c[i] = common[i];
            System.out.println(c[i]);
        }

        return c;
    }

    public static int exist(int[] c, int value) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] == value) {
                return 1;
            }
        }
        return 0;

    }

    public static void main(String[] args) {

        int[] a = { 2, 3, 6, 7, 5, 8 };
        int[] b = { 4, 5, 2, 6, 8, 3 };

        System.out.println("Common elements are " + Arrays.toString(commonElement(a, b)));
    }

}

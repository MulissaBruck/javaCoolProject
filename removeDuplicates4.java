import java.util.Arrays;

public class removeDuplicates4 {
    int count = 0;

    public static int[] removeDuplicate(int[] arr) {
        int count = 0;
        int[] unique = new int[arr.length];
        //

        for (int i = 0; i < arr.length; i++) {

            if (CheckExist(unique, arr[i]) == 0) {
                unique[count] = arr[i];
                count++;

            }
        }
        System.out.println(count);
        int[] lastUnique = new int[count];

        for (int i = 0; i < count; i++) {

            lastUnique[i] = unique[i];
        }

        return lastUnique;
    }

    public static int CheckExist(int[] unique, int value) {

        for (int i = 0; i < count; i++) {
            if (unique[i] == value) {

                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] a = { 2, 3, 5, 6, 5, 2 };
        System.out.println(Arrays.toString(removeDuplicate(a)));
        int[] b = { 1, 2, 3, 1, 2, 4, 5 };
        System.out.println(Arrays.toString(removeDuplicate(b)));

    }
}

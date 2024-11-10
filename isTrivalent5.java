public class isTrivalent5 {

    public static int isTrivalent5(int[] a) {

        int n1 = a[0];
        int n2 = -1;
        int n3 = -1;

        int count1 = 0, count2 = 0, count3 = 0, count = 0;

        for (int i = 0; i < a.length; i++) {
            if (n1 == a[i]) {

                count1++;
            } else if (n2 == -1 || n2 == a[i]) {
                n2 = a[i];
                count2++;
            } else if (n3 == -1 || n3 == a[i]) {
                n3 = a[i];
                count3++;

            } else
                return 0;

        }
        return a.length == count1 + count2 + count3 ? 1 : 0;

    }

    public static void main(String[] args) {
        // Example array to check
        int[] arr = { 2, 5, 2, 3, 5, 3, 2, 5, 3, 5, 6 };

        // Output result
        if (isTrivalent5(arr) == 1) {
            System.out.println("The array is trivalent.");
        } else {
            System.out.println("The array is not trivalent.");
        }
    }

}

public class isTrivalent {

    public static int isTrivalent(int[] a) {

        int[] triv = new int[3];
        triv[0] = a[0];

        int count = 1;
        for (int i = 1; i < a.length && count < 3; i++) {
            if (count == 1) {
                if (triv[0] != a[i]) {

                    triv[i] = a[i];
                    count++;
                }

            }
            if (count == 2) {
                if (triv[1] != a[i] && triv[0] != a[i]) {

                    triv[2] = a[i];

                }

            }

        }
        System.out.println(" trv 1 :" + triv[0]);
        System.out.println(" trv 2 :" + triv[1]);
        System.out.println(" trv 3 :" + triv[2]);
        for (int i = 0; i < a.length; i++) {
            int match = 0;
            for (int j = 0; j < 3; j++) {
                if (triv[j] == a[i]) {
                    match++;
                }
                if (match < 0) {
                    return 0;
                }
            }
        }
        return 1;

    }

    public static void main(String[] args) {
        // Example array to check
        int[] arr = { 2, 5, 2, 3, 5, 3, 2, 5, 3, 5 };

        // Output result
        if (isTrivalent(arr) == 1) {
            System.out.println("The array is trivalent.");
        } else {
            System.out.println("The array is not trivalent.");
        }
    }
}

public class isTrivalent4 {
    public static int isTrivalent(int[] arr) {
        int max = 0, TrivalentCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int[] trivalent = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            trivalent[arr[i]]++;
        }

        for (int i = 0; i < trivalent.length; i++) {

            if (trivalent[i] > 0) {
                System.out.println(i);
                TrivalentCount++;
            }
        }
        System.out.println("Trivalent " + TrivalentCount);

        return (TrivalentCount == 3) ? 1 : 0;
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

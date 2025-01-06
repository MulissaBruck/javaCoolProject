public class isTrivalent9 {
    public static int isTrivalent(int[] arr) {
        int count = 0;
        int[] counted = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            if (!isCounted(arr[i], counted)) {
                counted[count] = arr[i];

                count++;
            }
        }
        System.out.println(count);

        return (count == 3) ? 1 : 0;
    }

    public static boolean isCounted(int num, int[] counted) {
        for (int i = 0; i < counted.length; i++) {

            if (num == counted[i]) {
                return true;
            }
        }

        return false;
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

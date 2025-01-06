public class countSquarePair4 {

    public static int countSquarePairs(int[] arr) {
        int countPair = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (isSquar(arr[i], arr[j])) {
                    countPair++;
                }
            }
        }
        return countPair;
    }

    public static boolean isSquar(int a1, int a2) {

        for (int i = 1; i * i <= a1 + a2; i++) {

            if (i * i == a1 + a2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Example array to check
        int[] arr = { 9, 0, 4, 16, 25 };

        // Output result
        System.out.println("Total square pairs: " + countSquarePairs(arr));
    }
}

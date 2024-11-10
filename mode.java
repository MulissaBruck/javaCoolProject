public class mode {

    public static int mostFrequentElement(int[] a) {
        int counter;
        int max = 0;
        int maxCount = 0;

        for (int i = 0; i < a.length; i++) {
            counter = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    counter++;

                }
            }
            if (counter > maxCount) {

                max = a[i];
                maxCount = counter;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] givenArray = { 5, 2, 2, 4, 2, 4, 3, 2, 4, 2, 1, 7, 2 };

        System.out.println("The most frequent element is: " + mostFrequentElement(givenArray));
    }

}

public class match {

    public static int matchPattern(int[] a, int[] p) {
        int counter = 0;
        int leftCounter = 0;
        int rightCounter = 0;

        for (int i = 0; i < p.length; i++) {

            if (p[i] < 0) {
                rightCounter = p[i] * -1;
            } else
                rightCounter = p[i];

            for (int j = leftCounter; j < leftCounter + rightCounter; j++) {
                System.out.println("left counter :" + leftCounter);

                if (checkNumber(p[i]) != checkNumber(a[j])) {

                    return 0;
                }
                if (checkNumber(p[i]) == checkNumber(a[j])) {

                    counter++;
                }

                System.out.println("matched counter :" + counter);

            }
            leftCounter = leftCounter + rightCounter;
        }
        System.out.println(counter);
        if (counter != a.length)
            return 0;
        else
            return 1;
    }

    public static int checkNumber(int number) {
        if (number > 0) {

            return 1;
        } else
            return 0;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, -5, -5, 2, 3, 18 };
        int[] p = { 2, 1, -2, 2, 1 };

        System.out.println(matchPattern(a, p)); // Expected output: 1
    }

}

public class printRightTringelStar {
    /*
     * Input : n = 5
     * Output:
     * 
     *** 
     ***** 
     */

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            // System.out.println('\n');
            System.out.println();

        }

    }

}

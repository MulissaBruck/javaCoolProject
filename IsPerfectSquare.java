public class IsPerfectSquare {

    public static int isSquare(int n) {
        if (n < 0)
            return 0; // Negative numbers cannot be perfect squares
        if (n == 0)
            return 1; // 0 is a perfect square (0 * 0 = 0)

        int i = 0;

        while (i * i <= n) {
            System.out.println(i + ":" + n / 2);
            if (i * i == n) {

                return 1; // n is a perfect square
            }
            i++;
        }
        return 0; // n is not a perfect square
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(isSquare(n)); // Output: 1 (true)

        int m = 0;
        // System.out.println(isSquare(m)); // Output: 1 (true)

        int k = 26;
        // System.out.println(isSquare(k)); // Output: 0 (false)
    }
}

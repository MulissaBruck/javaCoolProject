import java.math.BigDecimal;
import java.util.Scanner;

class bigDecimalSorting {

    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next(); // Read each number as a string
        }
        sc.close();

        // Manual sorting logic (Bubble Sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Convert strings to BigDecimal for numerical comparison
                BigDecimal num1 = new BigDecimal(s[j]);
                BigDecimal num2 = new BigDecimal(s[j + 1]);

                // Compare numerically in descending order
                if (num1.compareTo(num2) < 0) {
                    // Swap the strings if the first is smaller than the second
                    String temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }

        // Output the sorted array
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]); // Print each number in its original format
        }
    }
}

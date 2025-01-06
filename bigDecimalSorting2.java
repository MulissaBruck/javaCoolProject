import java.math.BigDecimal;
import java.util.*;

public class bigDecimalSorting2 {
    public static void main(String[] args) {
        // Input read section
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of elements
        sc.nextLine(); // Consume newline

        String[] numbers = new String[n]; // Array to store input numbers
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextLine(); // Read each number as a string
        }

        // Sorting logic
        Arrays.sort(numbers, (a, b) -> {
            // Convert strings to BigDecimal for numerical comparison
            BigDecimal numA = new BigDecimal(a);
            BigDecimal numB = new BigDecimal(b);

            // Compare numerically in descending order
            int comparison = numB.compareTo(numA);

            // If numbers are numerically equal, maintain original order (stable sorting)
            return comparison == 0 ? 0 : comparison;
        });

        // Output section
        for (String number : numbers) {
            System.out.println(number); // Print each number in original format
        }
    }
}

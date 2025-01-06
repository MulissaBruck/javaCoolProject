import java.util.*;
import java.text.*;
import java.util.Locale;

public class currency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Format the payment as currency for different locales
        // US currency
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);

        // Indian currency (Locale for India)
        Locale indiaLocale = new Locale("en", "IN");
        String india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);

        // Chinese currency
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);

        // French currency
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        // Print the results
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

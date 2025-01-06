import java.util.Calendar;
import java.util.Scanner;

public class calandarDMY2 {

    // Method to find the day of the week
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // Month is 0-based in Calendar
        String[] days = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
        return days[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter the month (1-12):");
        int month = scanner.nextInt();

        System.out.println("Enter the day (1-31):");
        int day = scanner.nextInt();

        System.out.println("Enter the year (e.g., 2015):");
        int year = scanner.nextInt();

        scanner.close(); // Close the scanner

        // Call the method and display the result
        System.out.println(findDay(month, day, year));
    }
}

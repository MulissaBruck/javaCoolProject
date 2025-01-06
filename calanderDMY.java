import java.io.*;
import java.util.*;

class Result {
    // Method to find the day of the week
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // Month is 0-based in Calendar
        String[] days = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
        return days[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }
}

public class calanderDMY {
    public static void main(String[] args) throws IOException {
        // Input reader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Output writer
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        // Read input
        System.out.println("Enter the date in format: month day year (e.g., 08 05 2015):");
        String[] firstMultipleInput = bufferedReader.readLine().trim().split(" ");

        // Parse the input
        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        // Get the result
        String res = Result.findDay(month, day, year);

        // Write to file
        bufferedWriter.write(res);
        bufferedWriter.newLine();

        // Close resources
        bufferedReader.close();
        bufferedWriter.close();

        // Confirm output
        System.out.println("The result has been written to output.txt");
    }
}

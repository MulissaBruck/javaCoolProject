public class IntegerStringConversion {
    public static void main(String[] args) {
        // Using Integer.parseInt
        String numString = "2024";
        int parsedNumber = Integer.parseInt(numString);
        System.out.println("Parsed integer: " + parsedNumber); // Output: Parsed integer: 2024

        // Using Integer.toString
        int year = 2024;
        String yearString = Integer.toString(year);
        System.out.println("Year as String: " + yearString); // Output: Year as String: 2024

        // Combining both methods
        String newYearString = Integer.toString(parsedNumber + 1); // Convert to string after calculation
        System.out.println("Next year as String: " + newYearString); // Output: Next year as String: 2025

        // Handling exceptions for parseInt
        try {
            String invalidInput = "123abc";
            int invalidParsed = Integer.parseInt(invalidInput);
            System.out.println(invalidParsed); // This line won't execute
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage()); // Output: Invalid input: For input string: "123abc"
        }
    }
}

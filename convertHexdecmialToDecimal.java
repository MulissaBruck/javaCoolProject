public class convertHexdecmialToDecimal {

    public static void main(String[] args) {
        String hex = "1AB"; // Input hexadecimal number
        int decimal = 0; // Variable to store the decimal result
        int base = 16; // Base of hexadecimal system
        int position = 0; // Position of the digit (starting from 0)

        // Loop through the hexadecimal number from right to left
        for (int i = hex.length() - 1; i >= 0; i--) {
            char digit = hex.charAt(i); // Get the current hexadecimal digit
            int value;

            // Convert hexadecimal digit to decimal value
            if (Character.isDigit(digit)) {
                value = digit - '0'; // Convert '0'-'9' to 0-9
            } else {
                value = Character.toUpperCase(digit) - 'A' + 10; // Convert 'A'-'F' to 10-15
            }

            decimal += value * Math.pow(base, position); // Add the value to the decimal result
            position++; // Move to the next position
        }

        // Output the decimal result
        System.out.println("Decimal equivalent: " + decimal);
    }
}

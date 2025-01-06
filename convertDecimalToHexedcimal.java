public class convertDecimalToHexedcimal {

    public static void main(String[] args) {
        int decimal = 427; // Input decimal number
        String hexadecimal = ""; // String to store the hexadecimal result

        // Loop to convert decimal to hexadecimal
        while (decimal > 0) {
            int remainder = decimal % 16; // Get the remainder
            char hexDigit;

            // Map remainder to hexadecimal character
            if (remainder < 10) {
                hexDigit = (char) (remainder + '0'); // Convert 0-9 to '0'-'9'
            } else {
                hexDigit = (char) (remainder - 10 + 'A'); // Convert 10-15 to 'A'-'F'
            }

            hexadecimal = hexDigit + hexadecimal; // Add the digit to the front of the result
            decimal = decimal / 16; // Update decimal value by dividing by 16
        }

        // Output the hexadecimal result
        System.out.println("Hexadecimal equivalent: " + hexadecimal);
    }
}

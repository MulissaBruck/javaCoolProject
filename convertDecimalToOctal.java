public class convertDecimalToOctal {

    public static void main(String[] args) {
        int decimal = 56; // Input decimal number
        String octal = ""; // String to store the octal result

        // Loop to convert decimal to octal
        while (decimal > 0) {
            int remainder = decimal % 8; // Get the remainder
            octal = remainder + octal; // Add remainder to the front of the octal string
            decimal = decimal / 8; // Update decimal value by dividing by 8
        }

        // Output the result
        System.out.println("Octal equivalent: " + octal);
    }
}

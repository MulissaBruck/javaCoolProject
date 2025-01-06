public class convertBinaryToDecimal {

    public static void main(String[] args) {
        String binary = "11001"; // Input binary number as a string
        int decimal = 0; // Variable to store the decimal result
        int position = 0; // Position index starting from 0

        // Loop through the binary string from right to left
        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i); // Get the current binary digit
            if (bit == '1') {
                decimal += Math.pow(2, position); // Add the value of the binary digit
            }
            position++; // Move to the next position
        }

        // Output the decimal result
        System.out.println("Decimal equivalent: " + decimal);
    }
}

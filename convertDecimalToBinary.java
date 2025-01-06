public class convertDecimalToBinary {

    public static void main(String[] args) {
        int decimal = 25; // Input decimal number
        String binary = ""; // String to store the binary result

        // Loop to convert decimal to binary
        while (decimal > 0) {
            int remainder = decimal % 2; // Get the remainder
            binary = remainder + binary; // Add the remainder to the front of the binary string
            decimal = decimal / 2; // Update decimal value by dividing by 2
        }

        // Output the binary result
        System.out.println("Binary equivalent: " + binary);
    }
}

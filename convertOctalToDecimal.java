public class convertOctalToDecimal {

    public static void main(String[] args) {
        int octal = 167; // Input octal number
        int decimal = 0; // Variable to store the decimal result
        int base = 8; // Base of octal system
        int position = 0; // Position of the digit (starting from 0)

        // Loop through each digit of the octal number
        while (octal > 0) {
            int lastDigit = octal % 10; // Extract the last digit
            decimal += lastDigit * Math.pow(base, position); // Convert and add to decimal
            octal /= 10; // Remove the last digit
            position++; // Move to the next position
        }

        // Output the result
        System.out.println("Decimal equivalent: " + decimal);
    }
}

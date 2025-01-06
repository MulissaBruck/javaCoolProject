public class binaryToOctalBruthForce {
    public static void main(String[] args) {
        String binary = "1100001"; // Example binary input
        StringBuilder octal = new StringBuilder();

        // Step 1: Group the binary digits in sets of 3 (starting from the right)
        int len = binary.length();
        int remainder = len % 3;

        // Add leading zeros to make the length a multiple of 3
        if (remainder != 0) {
            binary = "0".repeat(3 - remainder) + binary;
        }

        // Step 2: Convert each 3-digit group to its octal equivalent manually
        for (int i = 0; i < binary.length(); i += 3) {
            String group = binary.substring(i, i + 3);
            int octalDigit = binaryToOctal(group);
            octal.append(octalDigit);
        }

        // Output the result
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal.toString());
    }

    // Method to manually convert a 3-bit binary group to an octal digit
    public static int binaryToOctal(String binary) {
        int decimalValue = 0;
        int power = 2; // Start with 2^2 for the leftmost digit

        // Convert binary group to decimal manually
        for (int i = 0; i < 3; i++) {
            if (binary.charAt(i) == '1') {
                decimalValue += Math.pow(2, power); // Add the value of 2^power if the bit is 1
                System.out.println("dec" + decimalValue);
            }
            power--; // Decrease power for each digit
        }

        // Return the decimal value, which is the octal equivalent
        return decimalValue;
    }
}

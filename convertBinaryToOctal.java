public class convertBinaryToOctal {
    public static void main(String[] args) {
        String binary = "1100001"; // Example binary input

        // Convert binary to decimal
        int decimal = Integer.parseInt(binary, 2);

        // Convert decimal to octal
        String octal = Integer.toOctalString(decimal);

        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
    }
}

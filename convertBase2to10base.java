
public class convertBase2to10base {

    public static int convertToBaseTen(int given[]) {
        int length = given.length, lastNum = 0, expoSum = 1, base = 2, sum = 0;

        while (length > 0) {

            lastNum = given[length - 1];
            sum = sum + lastNum * expoSum;
            expoSum = expoSum * base;
            length--;
        }

        return sum;

    }

    public static void main(String[] args) {
        // Example input: a binary number 1011 represented as an array of digits
        // This is the binary number: 1*2^3 + 0*2^2 + 1*2^1 + 1*2^0 = 11 in decimal
        int[] given = { 1, 0, 1, 1 }; // Binary 1011

        // The base we are converting from is 2 (binary system)
        int base = 2; // You could change this to any other base, e.g., base 8, base 16, etc.

        // Call the method to convert the binary number to base 10 (decimal) and print
        // the result
        System.out.println(convertToBaseTen(given)); // Output should be 11 for this example
    }

}

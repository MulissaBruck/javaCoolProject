public class convertBase2to10 {

    public static int convertToBaseTen(int[] a) {
        int index = a.length;
        int num = 0;
        for (int i = 0; i < a.length; i++) {

            num = num + a[i] * exponenet(index);

            index--;
        }

        return num;
    }

    public static int exponenet(int index) {
        int expo = index - 1;
        int base = 1;
        while (expo > 0) {

            base = base * 2;
            expo--;

        }
        return base;

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

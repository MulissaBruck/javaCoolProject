public class charDemo {
    public static void main(String[] args) {

        // 1. Basic Declaration and Initialization
        char letter = 'A';
        char digit = '3';
        char symbol = '#';
        char heart = '\u2764'; // Unicode for heart emoji

        System.out.println("1. Basic Declaration and Initialization:");
        System.out.println("Letter: " + letter); // Output: Letter: A
        System.out.println("Digit: " + digit); // Output: Digit: 3
        System.out.println("Symbol: " + symbol); // Output: Symbol: #
        System.out.println("Heart: " + heart); // Output: Heart: ❤

        // 2. Character Arithmetic
        char nextLetter = (char) (letter + 1); // Shift to next letter
        System.out.println("\n2. Character Arithmetic:");
        System.out.println("Next Letter: " + nextLetter); // Output: Next Letter: B

        // 3. Character Comparison
        char a = 'A';
        char b = 'B';

        System.out.println("\n3. Character Comparison:");
        System.out.println("a == b: " + (a == b)); // Output: false
        System.out.println("a < b: " + (a < b)); // Output: true

        // 4. Converting Characters to and from Numeric Values
        int letterValue = (int) letter; // Convert to ASCII value
        char letterFromValue = (char) (letterValue + 1);

        System.out.println("\n4. Converting Characters to and from Numeric Values:");
        System.out.println("ASCII value of 'A': " + letterValue); // Output: 65
        System.out.println("Character for ASCII 66: " + letterFromValue); // Output: B

        // 5. Using Character Class Methods
        System.out.println("\n5. Using Character Class Methods:");
        System.out.println("Is letter a letter? " + Character.isLetter(letter)); // true
        System.out.println("Is digit a digit? " + Character.isDigit(digit)); // true
        System.out.println("Is symbol whitespace? " + Character.isWhitespace(symbol)); // false
        System.out.println("Lowercase of A: " + Character.toLowerCase(letter)); // Output: a
        System.out.println("Uppercase of b: " + Character.toUpperCase('b')); // Output: B

        // 6. Checking Vowels and Consonants
        char checkLetter = 'e';
        System.out.println("\n6. Checking Vowels and Consonants:");
        if (Character.isLetter(checkLetter)) {
            checkLetter = Character.toLowerCase(checkLetter);
            if (checkLetter == 'a' || checkLetter == 'e' || checkLetter == 'i' || checkLetter == 'o'
                    || checkLetter == 'u') {
                System.out.println(checkLetter + " is a vowel."); // Output: e is a vowel.
            } else {
                System.out.println(checkLetter + " is a consonant.");
            }
        } else {
            System.out.println(checkLetter + " is not a letter.");
        }

        // 7. Additional Character Class Methods
        char space = ' ';
        char nonBreakingSpace = '\u00A0';

        System.out.println("\n7. Additional Character Class Methods:");
        System.out.println("Is letter uppercase? " + Character.isUpperCase(letter)); // true
        System.out.println("Is letter a letter or digit? " + Character.isLetterOrDigit(letter)); // true
        System.out.println("Is non-breaking space a space char? " + Character.isSpaceChar(nonBreakingSpace)); // true
        System.out.println("Is space whitespace? " + Character.isWhitespace(space)); // true

        // Conversion to numeric value with radix (e.g., hexadecimal)
        int numericValue = Character.getNumericValue('A'); // Returns 10 in hexadecimal
        System.out.println("Numeric value of 'A' (hexadecimal): " + numericValue); // Output: 10

        // Convert code point to character array (e.g., emoji)
        char[] charsFromCodePoint = Character.toChars(128512); // Unicode for 😀 emoji
        System.out.println("Characters for code point 128512: " + new String(charsFromCodePoint)); // Output: 😀

        // 8. Utility Method Comparison
        System.out.println("\n8. Utility Method Comparison:");
        System.out.println("Comparison of 'A' and 'B': " + Character.compare('A', 'B')); // Output: -1 (A is less than
                                                                                         // B)
    }
}

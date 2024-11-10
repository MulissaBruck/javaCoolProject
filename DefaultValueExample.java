public class DefaultValueExample {
    // Declare variables without initialization
    static byte defaultByte;
    static short defaultShort;
    static int defaultInt;
    static long defaultLong;
    static float defaultFloat;
    static double defaultDouble;
    static char defaultChar;
    static boolean defaultBoolean;

    public static void main(String[] args) {
        // Print the default values of all primitive data types
        System.out.println("Default value of byte: " + defaultByte);       // Output: 0
        System.out.println("Default value of short: " + defaultShort);     // Output: 0
        System.out.println("Default value of int: " + defaultInt);         // Output: 0
        System.out.println("Default value of long: " + defaultLong);       // Output: 0
        System.out.println("Default value of float: " + defaultFloat);     // Output: 0.0
        System.out.println("Default value of double: " + defaultDouble);   // Output: 0.0
        System.out.println("Default value of char: " + defaultChar);       // Output: (null character)
        System.out.println("Default value of boolean: " + defaultBoolean); // Output: false
    }
}

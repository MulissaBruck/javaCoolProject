public class convertBooleanToString {
    public static void main(String[] args) {
        boolean value1 = true;
        boolean value2 = false;

        // Using Boolean.toString() to convert boolean to String
        String string1 = Boolean.toString(value1); // "true"
        String string2 = Boolean.toString(value2); // "false"

        // Output the string values
        System.out.println("String representation of value1: " + string1);
        System.out.println("String representation of value2: " + string2);
    }
}

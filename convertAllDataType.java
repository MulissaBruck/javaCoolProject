public class convertAllDataType {

    public static void main(String[] args) {

        // 1. Boolean to String
        boolean bool = true;
        String boolToString = Boolean.toString(bool);
        System.out.println("1. Boolean to String: " + boolToString);

        // 2. String to Double
        String strDouble = "42.5";
        double stringToDouble = Double.parseDouble(strDouble);
        System.out.println("2. String to Double: " + stringToDouble);

        // 3. Double to String
        double dbl = 42.5;
        String doubleToString = Double.toString(dbl);
        System.out.println("3. Double to String: " + doubleToString);

        // 4. String to Long
        String strLong = "12345";
        long stringToLong = Long.parseLong(strLong);
        System.out.println("4. String to Long: " + stringToLong);

        // 5. Long to String
        long lng = 12345L;
        String longToString = Long.toString(lng);
        System.out.println("5. Long to String: " + longToString);

        // 6. Int to Char
        int num = 65;
        char intToChar = (char) num;
        System.out.println("6. Int to Char: " + intToChar);

        // 7. Char to Int
        char ch = 'A';
        int charToInt = (int) ch;
        System.out.println("7. Char to Int: " + charToInt);

        // 8. String to Int
        String strInt = "42";
        int stringToInt = Integer.parseInt(strInt);
        System.out.println("8. String to Int: " + stringToInt);

        // 9. Int to String
        int num2 = 42;
        String intToString = Integer.toString(num2);
        System.out.println("9. Int to String: " + intToString);

        // 10. Char to String
        char charToStr = 'H';
        String charToString = Character.toString(charToStr);
        System.out.println("10. Char to String: " + charToString);

        // 11. String to Char
        String str = "Hello";
        char stringToChar = str.charAt(0);
        System.out.println("11. String to Char: " + stringToChar);

        // 12. Double to Int
        double dblToInt = 42.5;
        int doubleToInt = (int) dblToInt;
        System.out.println("12. Double to Int: " + doubleToInt);

        // 13. Int to Double
        int intToDbl = 42;
        double intToDouble = intToDbl;
        System.out.println("13. Int to Double: " + intToDouble);

        // 14. Float to String
        float flt = 42.5f;
        String floatToString = Float.toString(flt);
        System.out.println("14. Float to String: " + floatToString);

        // 15. String to Float
        String strFloat = "42.5";
        float stringToFloat = Float.parseFloat(strFloat);
        System.out.println("15. String to Float: " + stringToFloat);

        // 16. Char to Boolean
        char charToBool = 'T';
        boolean charToBoolean = (charToBool == 'T');
        System.out.println("16. Char to Boolean: " + charToBoolean);

        // 17. Boolean to Char
        boolean boolToChar = true;
        char booleanToChar = boolToChar ? 'T' : 'F';
        System.out.println("17. Boolean to Char: " + booleanToChar);

        // 18. String to Boolean
        String strBool = "true";
        boolean stringToBoolean = Boolean.parseBoolean(strBool);
        System.out.println("18. String to Boolean: " + stringToBoolean);

        // 19. Hexadecimal String to Int
        String hexStr = "1A";
        int hexToInt = Integer.parseInt(hexStr, 16);
        System.out.println("19. Hexadecimal to Int: " + hexToInt);

        // 20. Int to Hexadecimal String
        int intHex = 26;
        String intToHexString = Integer.toHexString(intHex);
        System.out.println("20. Int to Hexadecimal: " + intToHexString);
    }
}

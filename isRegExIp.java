import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class isRegExIp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    // Regular expression to validate an IP address
    String pattern = "^([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\." + // First segment (0-255)
            "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\." + // Second segment (0-255)
            "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\." + // Third segment (0-255)
            "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])$"; // Fourth segment (0-255)
}

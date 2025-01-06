public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "madam";

        // Manually reverse the string
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        // Compare the original string with the reversed string
        if (s.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

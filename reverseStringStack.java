
// Java program to reverse a string using Stack
import java.util.*;

class reverseStringStack {

    public static void main(String[] args) {

        String str = "Geeks";

        // initializing a stack of type char
        Stack<Character> s = new Stack<>();

        for (char c : str.toCharArray()) {
            // pushing all the characters
            s.push(c);
        }

        String res = "";

        while (!s.isEmpty()) {

            // popping all the chars and appending to temp
            res += s.pop();
        }

        System.out.println(res);

    }
}
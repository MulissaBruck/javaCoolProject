
// Java program to Reverse String
// Using StringBuilder
import java.io.*;

class reverseStringBuilder {

    public static void main(String[] args) {

        String s = "Geeks";

        // Object Initialised
        StringBuilder res = new StringBuilder();

        // Appending elements of s in res
        res.append(s);

        // reverse StringBuilder res
        res.reverse();

        // print reversed String
        System.out.println(res);
    }
}
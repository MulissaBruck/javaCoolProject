
// Java program to Reverse a String by
// Converting string to characters one
// by one
import java.io.*;

class reversetoCharArray {

    public static void main(String[] args) {

        String s = "Geeks";

        // Using toCharArray to copy elements
        char[] arr = s.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i]);
    }
}
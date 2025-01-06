
// Java program to Reverse the String
// Using StringBuffer
import java.io.*;

public class StringBufferReverse {

  public static void main(String[] args) {

    String s = "Geeks";

    // Conversion from String object
    // To StringBuffer
    StringBuffer sbf = new StringBuffer(s);

    // Reverse String
    sbf.reverse();

    System.out.println(sbf);
  }
}
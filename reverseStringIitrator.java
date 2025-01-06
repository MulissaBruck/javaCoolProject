
// Java program to Reverse a String
// Using ListIterator
import java.util.*;

class reverseStringIitrator {

  public static void main(String[] args) {

    String s = "Geeks";

    // Copying elements to Character Array
    char[] arr = s.toCharArray();

    // Creating new ArrayList
    List<Character> l = new ArrayList<>();

    // Adding char elements to ArrayList
    for (char c : arr)
      l.add(c);

    // Reversing the ArrayList
    Collections.reverse(l);

    // Using ListIterator
    ListIterator it = l.listIterator();

    while (it.hasNext())
      System.out.print(it.next());
  }
}
import java.util.*;

class Student {
}

class Rockstar {
}

class Hacker {
}

public class instanceOfKeyword {

    static String count(ArrayList mylist) {
        int a = 0, b = 0, c = 0;

        // Iterate over each element in the list
        for (int i = 0; i < mylist.size(); i++) {
            Object element = mylist.get(i);

            // Check if the element is an instance of Student class
            if (element instanceof Student)
                a++; // Increment counter for Student

            // Check if the element is an instance of Rockstar class
            if (element instanceof Rockstar)
                b++; // Increment counter for Rockstar

            // Check if the element is an instance of Hacker class
            if (element instanceof Hacker)
                c++; // Increment counter for Hacker
        }

        // Return the result as a string in the format "a b c"
        String ret = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
        return ret;
    }

    public static void main(String[] args) {
        // Create an ArrayList to store objects
        ArrayList mylist = new ArrayList();

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter the number of test cases
        System.out.println("Enter the number of test cases:");
        int t = sc.nextInt();

        // Ask user to enter each type for the test cases
        System.out.println("Enter the types (Student, Rockstar, Hacker) for each test case:");
        for (int i = 0; i < t; i++) {
            String s = sc.next();

            // Add objects based on input type
            if (s.equals("Student"))
                mylist.add(new Student());
            if (s.equals("Rockstar"))
                mylist.add(new Rockstar());
            if (s.equals("Hacker"))
                mylist.add(new Hacker());
        }

        // Call count method and print the result
        System.out.println(count(mylist));
    }
}

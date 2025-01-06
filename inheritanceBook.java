import java.util.*;

// Abstract class Book
abstract class Book {
    String title; // Title of the book

    // Abstract method that must be implemented by subclasses
    abstract void setTitle(String s);

    // Concrete method to return the title of the book
    String getTitle() {
        return title;
    }
}

// MyBook class extends Book and provides implementation for the abstract
// setTitle method
class MyBook extends Book {
    // Implement the abstract setTitle method to set the title of the book
    @Override
    void setTitle(String s) {
        title = s; // Set the title to the provided string
    }
}

public class inheritanceBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input

        // Ask the user to enter the title
        System.out.println("Enter the title:");

        // Read the title input from the user
        String title = sc.nextLine();

        // Create an instance of MyBook
        MyBook new_novel = new MyBook();

        // Set the title using the setTitle method of MyBook
        new_novel.setTitle(title);

        // Print the title using the getTitle method inherited from Book
        System.out.println("The title is: " + new_novel.getTitle());

        // Close the scanner
        sc.close();
    }
}

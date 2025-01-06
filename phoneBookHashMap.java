import java.util.*;
import java.io.*;

class phoneBookHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for the number of entries in the phone book
        System.out.print("Enter the number of phone book entries: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Create a map to store the phone book entries
        Map<String, String> phoneBook = new HashMap<>();

        // Read phone book entries
        System.out.println("Enter the phone book entries (name and phone number):");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine(); // Name of the person
            System.out.print("Enter phone number: ");
            String phoneNumber = sc.nextLine(); // Phone number of the person
            phoneBook.put(name, phoneNumber); // Add to the phone book map
        }

        // Read queries and print phone numbers or "Not found"
        System.out.println("Enter names to query for phone numbers:");
        while (sc.hasNext()) {
            String query = sc.nextLine(); // Name to query
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query)); // Print the phone number
            } else {
                System.out.println("Not found"); // If the name doesn't exist
            }
        }

        sc.close();
    }
}

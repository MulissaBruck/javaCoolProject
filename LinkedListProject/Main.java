package LinkedListProject;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Create instances of Customer
        Customer customer1 = new Customer("Alice", 1);
        Customer customer2 = new Customer("Bob", 2);
        Customer customer3 = new Customer("Charlie", 3);

        // Create a CustomLinkedList
        CustomLinkedList list = new CustomLinkedList();

        // Add customers to the linked list
        list.addLast(customer1);
        list.addLast(customer2);
        list.addLast(customer3);

        // Display the list of customers
        System.out.println("List of Customers:");
        list.display();
    }
}

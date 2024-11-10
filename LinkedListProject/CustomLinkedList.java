package LinkedListProject;

// CustomLinkedList.java
public class CustomLinkedList {
    private Node head; // Head of the list

    // Constructor to initialize an empty list
    public CustomLinkedList() {
        head = null; // Initially, the list is empty
    }

    // Method to add a Customer to the end of the list
    public void addLast(Customer customer) {
        Node newNode = new Node(customer); // Create a new node with the customer

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the last node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Add the new node at the end
        current.next = newNode;
    }

    // Method to display all customers in the list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        // Traverse and display each customer's information
        Node current = head;
        while (current != null) {
            System.out.println(current.customer.displayCustomer()); // Print customer details
            current = current.next; // Move to the next node
        }
    }
}

package LinkedListProject;

// Node.java
public class Node {
    Customer customer; // Customer object to store data
    Node next; // Reference to the next node in the list

    // Constructor to create a new node with a Customer object
    public Node(Customer customer) {
        this.customer = customer;
        this.next = null; // By default, next is null
    }
}

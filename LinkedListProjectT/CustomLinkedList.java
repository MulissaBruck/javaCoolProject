package LinkedListProjectT;

public class CustomLinkedList<T> {

    // Inner class to represent each element (node) in the linked list
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // The head of the linked list
    private Node head;

    // Constructor
    public CustomLinkedList() {
        head = null;
    }

    // Method to add an item to the linked list
    public void add(T item) {
        Node newNode = new Node(item);

        if (head == null) { // If the list is empty, set the head to the new node
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) { // Traverse to the end of the list
                current = current.next;
            }
            current.next = newNode; // Set the next of the last node to the new node
        }
    }

    // Method to find an item in the linked list
    public boolean find(T item) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false; // If the item is not found
    }

    // Method to print the linked list (in string format)
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();
    }
}

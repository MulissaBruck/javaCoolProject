package LinkedListProject;

// Customer.java
public class Customer {
    String name;
    int id;

    // Constructor to create a new customer
    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display customer details
    public String displayCustomer() {
        return "Customer Information: [ID=" + id + ", Name=" + name + "]";
    }
}

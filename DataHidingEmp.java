// Java Program showing working of data hiding

// Importing required libraries
import java.io.*;

// Class created named Bank
class Bank {

    // Private data (data hiding) - current balance
    private long CurBalance = 0;

    // Public fields for bank_id and name
    long bank_id;
    String name;

    // Getter method to access private data (CurBalance)
    public long get_balance(long Id) {

        // Checking if the user is authorized
        // Authorization is based on matching bank_id
        if (this.bank_id == Id) {
            // Return current balance for authorized users
            return CurBalance;
        }

        // For unauthorized users, return -1 as an error code
        return -1;
    }

    // Setter method to update the private data (CurBalance)
    public void set_balance(long balance, long Id) {
        // Check if the user is authorized
        if (this.bank_id == Id) {
            // Update the balance for the valid user
            CurBalance = CurBalance + balance;
        }
    }
}

// Driver class - Emp
public class DataHidingEmp {
    public static void main(String[] args) {
        // Creating a Bank object representing an employee account
        Bank _emp = new Bank();

        // Assigning initial values for bank_id and name
        _emp.bank_id = 12345;
        _emp.name = "Roshan";

        // Attempting to set balance using the setter method
        // Providing correct bank_id for authorization
        _emp.set_balance(10000, 12345);

        // Attempting to get balance using the getter method
        // Providing correct bank_id for authorization
        long emp_balance = _emp.get_balance(12345);

        // Printing the user details and balance
        System.out.println("User Name: " + _emp.name);
        System.out.println("Bank_ID: " + _emp.bank_id);
        System.out.println("Current Balance: " + emp_balance);

        // Attempting unauthorized access with incorrect bank_id
        long unauthorized_access = _emp.get_balance(99999);
        System.out.println("Unauthorized Access Result: " + unauthorized_access);
    }
}

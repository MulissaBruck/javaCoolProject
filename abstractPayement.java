// Abstract class Payment
abstract class Payment {
    // Abstract method to process payment
    public abstract void processPayment();

    // Concrete method to show the type of payment
    public void showPaymentType() {
        System.out.println("Payment method is: " + this.getClass().getSimpleName());
    }
}

// CreditCardPayment class extends Payment and implements processPayment method
class CreditCardPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing payment through Credit Card.");
    }
}

// PaypalPayment class extends Payment and implements processPayment method
class PaypalPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing payment through PayPal.");
    }
}

// Driver class to test the program
public class abstractPayement {
    public static void main(String[] args) {
        // Creating objects of CreditCardPayment and PaypalPayment
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new PaypalPayment();

        // Using the showPaymentType method to display payment type
        payment1.showPaymentType();
        payment1.processPayment();

        payment2.showPaymentType();
        payment2.processPayment();
    }
}

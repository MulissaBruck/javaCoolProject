// Interface defining the contract for products
interface Product {
    // A constant for tax rate
    final double TAX_RATE = 0.1;

    // Method to calculate price, to be implemented by each product class
    double getPrice();
}

// Electronics class implements Product interface
class Electronics implements Product {
    private double basePrice;

    // Constructor to initialize base price
    public Electronics(double basePrice) {
        this.basePrice = basePrice;
    }

    // Method to calculate price with tax for Electronics
    public double getPrice() {
        return basePrice + (basePrice * TAX_RATE);
    }
}

// Clothing class implements Product interface
class Clothing implements Product {
    private double basePrice;

    // Constructor to initialize base price
    public Clothing(double basePrice) {
        this.basePrice = basePrice;
    }

    // Method to calculate price with tax for Clothing
    public double getPrice() {
        return basePrice + (basePrice * TAX_RATE);
    }
}

// Main class to test the implementation
class ECommerceSystem {
    public static void main(String[] args) {
        // Creating instances of Electronics and Clothing
        Product laptop = new Electronics(1000); // Base price of laptop is $1000
        Product tshirt = new Clothing(50); // Base price of T-shirt is $50

        // Printing the prices after tax
        System.out.println("Laptop Price (with tax): $" + laptop.getPrice());
        System.out.println("T-shirt Price (with tax): $" + tshirt.getPrice());
    }
}

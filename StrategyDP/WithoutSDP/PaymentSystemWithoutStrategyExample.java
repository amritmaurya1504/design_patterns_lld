
/**
 *While the code you provided may work for its intended purpose, it has a potential problem related to flexibility and extensibility.
 * The issue arises when you want to introduce a new payment method or make changes to the existing ones. Let's consider a few scenarios:
 * 1. Adding a New Payment Method:
 * If you want to add a new payment method, you would need to modify the ShoppingCartWithoutStrategy class to include the
 * logic for the new payment method. This violates the Open-Closed Principle, which states that a class should be open for
 * extension but closed for modification.
 */

package DesignPatterns.StrategyDP.WithoutSDP;

// Concrete implementation of Credit Card payment
class CreditCardPayment {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
        // Additional credit card payment logic
    }
}

// Concrete implementation of PayPal payment
class PayPalPayment {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal.");
        // Additional PayPal payment logic
    }
}

// Context class that directly uses payment logic
class ShoppingCartWithoutStrategy {
    private CreditCardPayment creditCardPayment;
    private PayPalPayment payPalPayment;

    public void setCreditCardPayment(CreditCardPayment creditCardPayment) {
        this.creditCardPayment = creditCardPayment;
    }

    public void setPayPalPayment(PayPalPayment payPalPayment) {
        this.payPalPayment = payPalPayment;
    }

    public void checkoutWithCreditCard(int amount) {
        creditCardPayment.pay(amount);
    }

    public void checkoutWithPayPal(int amount) {
        payPalPayment.pay(amount);
    }
}

// Client code
public class PaymentSystemWithoutStrategyExample {
    public static void main(String[] args) {
        // Create payment instances
        CreditCardPayment creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "12/24", "123");
        PayPalPayment payPalPayment = new PayPalPayment("example@example.com");

        // Create a shopping cart without strategy pattern
        ShoppingCartWithoutStrategy cart = new ShoppingCartWithoutStrategy();

        // Set the payment instances for the shopping cart
        cart.setCreditCardPayment(creditCardPayment);
        cart.setPayPalPayment(payPalPayment);

        // Perform checkout with Credit Card
        cart.checkoutWithCreditCard(100);

        // Perform checkout with PayPal
        cart.checkoutWithPayPal(50);
    }
}


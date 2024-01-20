package DesignPatterns.StrategyDP.WithSDP;

// Concrete implementation of PaymentStrategy for credit card payment
public class CreditCardPaymentStrategy implements PaymentStrategy {
    private String creditCardNumber;
    private String cvv;
    private String expiryDate;

    // Constructor to initialize credit card details
    public CreditCardPaymentStrategy(String creditCardNumber, String cvv, String expiryDate) {
        this.creditCardNumber = creditCardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    // Implementation of the pay method for credit card payment
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using credit card: " + creditCardNumber);
        // Additional credit card payment logic can be added here if needed
    }
}

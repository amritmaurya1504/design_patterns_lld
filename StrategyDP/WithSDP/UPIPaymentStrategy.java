package DesignPatterns.StrategyDP.WithSDP;

// Concrete implementation of PaymentStrategy for UPI payment
public class UPIPaymentStrategy implements PaymentStrategy {
    private String upiId;

    // Constructor to initialize UPI ID
    public UPIPaymentStrategy(String upiId) {
        this.upiId = upiId;
    }

    // Implementation of the pay method for UPI payment
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI: " + upiId);
        // Additional UPI payment logic can be added here if needed
    }
}

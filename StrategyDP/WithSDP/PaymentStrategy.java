package DesignPatterns.StrategyDP.WithSDP;

// Interface that defines the payment strategy contract
public interface PaymentStrategy {
    // Method to perform the payment
    // @param amount: the amount to be paid
    public void pay(int amount);
}

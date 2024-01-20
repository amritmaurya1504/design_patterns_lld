package DesignPatterns.StrategyDP.WithSDP;

// Context class that utilizes the Strategy Design Pattern for payment strategies
public class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    // Constructor to set the initial payment strategy
    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Method to perform checkout using the selected payment strategy
    public void checkout(int amount){
        paymentStrategy.pay(amount);
        // Additional checkout logic can be added here if needed
    }
}

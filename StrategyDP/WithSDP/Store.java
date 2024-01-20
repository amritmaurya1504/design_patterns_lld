package DesignPatterns.StrategyDP.WithSDP;
// Client code demonstrating the Strategy Design Pattern in a store scenario
public class Store {
    public static void main(String[] args) {
        // Create a Credit Card Payment Strategy with specific details
        CreditCardPaymentStrategy ccPs = new CreditCardPaymentStrategy("123456789", "123", "04/24");

        // Create a UPI Payment Strategy with a specific UPI ID
        UPIPaymentStrategy upiPs = new UPIPaymentStrategy("9100121222@ybl");

        // Create a shopping cart with the Credit Card Payment Strategy
        ShoppingCart sc = new ShoppingCart(ccPs);

        // Create another shopping cart with the UPI Payment Strategy
        ShoppingCart sc2 = new ShoppingCart(upiPs);

        // Perform checkout with the Credit Card Payment Strategy for the first shopping cart
        sc.checkout(5000);

        // Perform checkout with the UPI Payment Strategy for the second shopping cart
        sc2.checkout(10000);
    }
}

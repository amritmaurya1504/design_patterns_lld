// Main class to demonstrate the Factory Design Pattern
package DesignPatterns.FactoryDP;

public class Store {
    public static void main(String[] args) {
        // Using the MobileFactory to create a Mobile object based on the brand
        Mobile mobile = MobileFactory.getMobile("OnePlus");

        // Calling the getMobile method to get information about the mobile
        mobile.getMobile();
    }
}

// Implementation of the Mobile interface for IPhone
package DesignPatterns.FactoryDP;

public class Iphone implements Mobile {
    @Override
    public void getMobile() {
        System.out.println("Getting Iphone, Price : " + 50000);
    }
}

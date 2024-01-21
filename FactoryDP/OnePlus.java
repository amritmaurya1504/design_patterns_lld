// Implementation of the Mobile interface for OnePlus
package DesignPatterns.FactoryDP;

public class OnePlus implements Mobile {
    @Override
    public void getMobile() {
        System.out.println("Getting OnePlus, Price : " + 30000);
    }
}

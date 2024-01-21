// Implementation of the MobileFactory using a static method
package DesignPatterns.FactoryDP;

public class MobileFactory {
    // Static method to create and return a Mobile object based on the brand
    public static Mobile getMobile(String brand) {
        if (brand == null || brand.isEmpty()) {
            return null;
        } else if ("IPhone".equals(brand)) {
            return new Iphone();
        } else if ("OnePlus".equals(brand)) {
            return new OnePlus();
        } else if ("Xiaomi".equals(brand)) {
            // Assuming you have a class named Xiaomi for the Xiaomi brand
            return new Xiaomi();
        } else {
            return null;
        }
    }
}

package DesignPatterns.AbstractFactoryDP;

public class PhoneStore {
    public static void main(String[] args) {
        MobileFactory phone = new IphoneFactory();
        phone.orderPhone("Iphone13");
    }
}

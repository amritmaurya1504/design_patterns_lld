package DesignPatterns.AbstractFactoryDP;

abstract public class MobileFactory {
    public Phone orderPhone(String brand){
        Phone phone = createPhone(brand);
        phone.getPhone();
        return phone;
    }

    abstract public Phone createPhone(String brand);
}

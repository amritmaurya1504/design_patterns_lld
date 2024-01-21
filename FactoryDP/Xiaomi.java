package DesignPatterns.FactoryDP;

public class Xiaomi implements Mobile{
    @Override
    public void getMobile() {
        System.out.println("Getting Xiaomi, Price : " + 20000);
    }
}

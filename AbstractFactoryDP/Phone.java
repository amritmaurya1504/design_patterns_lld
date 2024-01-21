package DesignPatterns.AbstractFactoryDP;

public class Phone {
    private String phoneName;
    private String phoneModel;
    private int phonePrice;

    public Phone(String phoneName, String phoneModel, int phonePrice) {
        this.phoneName = phoneName;
        this.phoneModel = phoneModel;
        this.phonePrice = phonePrice;
    }

    public void getPhone(){
        System.out.println("Getting : " + this.phoneName + this.phoneModel);
    }
}

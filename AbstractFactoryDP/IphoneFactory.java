package DesignPatterns.AbstractFactoryDP;

public class IphoneFactory extends MobileFactory{
    @Override
    public Phone createPhone(String modelName) {
        if(modelName.equals("Iphone13")){
            return new Iphone13();
        }else if(modelName.equals("Iphone14")){
            return new Iphone14();
        }else{
            return null;
        }
    }
}

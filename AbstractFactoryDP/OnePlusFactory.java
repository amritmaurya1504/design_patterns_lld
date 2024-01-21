package DesignPatterns.AbstractFactoryDP;

public class OnePlusFactory extends MobileFactory{
    @Override
    public Phone createPhone(String modelName) {
        if(modelName.equals("OnePlus8")){
            return new OnePlus8();
        }else if(modelName.equals("OnePlus9")){
            return new OnePlus9();
        }else{
            return null;
        }
    }
}

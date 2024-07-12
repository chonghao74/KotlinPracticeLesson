package com.designpattern.factory;

public class CakeMakeFactoryJava implements CakeFactoryJava{
    @Override
    public CakeJava createCake(String choiceCake) {
        CakeJava cakeCreate = null;

        switch (choiceCake){
            case "1": cakeCreate= new AppleCakeJava();
                break;
            case "2": cakeCreate= new BlueberryCakeJava();
                break;
            default: cakeCreate= new FruitCakeJava();
        }

        return cakeCreate;
    }
}

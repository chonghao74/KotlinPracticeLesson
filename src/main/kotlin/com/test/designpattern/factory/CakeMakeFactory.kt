package com.test.designpattern.factory

class CakeMakeFactory:CakeFactory {
    override fun createCake(choiceCake: String): Cake? {
        var cakeCreate:Cake? = null;

        val cakeDataNonUseFactory = when(choiceCake){
            "1" ->{
                cakeCreate = AppleCake()
            }
            "2" ->{
                cakeCreate = BlueberryCake()
            }
            else->{
                cakeCreate =FruitCake()
            }
        }
        return cakeCreate;
    }
}
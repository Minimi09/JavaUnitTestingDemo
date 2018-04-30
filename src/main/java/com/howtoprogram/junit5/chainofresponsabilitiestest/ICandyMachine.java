package com.howtoprogram.junit5.chainofresponsabilitiestest;

public abstract class ICandyMachine {
    abstract void setNextChain (ICandyMachine nextChain);
    abstract void dispense (ProductsMachine productsMachine);
    int calcular(ProductsMachine productsMachine, double price)
    {
        int contador=0;
        double money = productsMachine.getMoney();
        while (money>=price)
        {
            contador ++;
            money= (int) (money-price);
        }
        productsMachine.setMoney(money);
        return contador;
    }
}

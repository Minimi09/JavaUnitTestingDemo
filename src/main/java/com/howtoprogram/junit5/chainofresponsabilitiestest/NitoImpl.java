package com.howtoprogram.junit5.chainofresponsabilitiestest;

public class NitoImpl extends ICandyMachine {

    private  ICandyMachine chain;
    private double price = 2;
    private int contador ;


    @Override
    public void setNextChain(ICandyMachine nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(ProductsMachine productsMachine) {

        contador= calcular(productsMachine, this.price);

        productsMachine.setNitos(contador);

         if (this.chain!=null)
         {this.chain.dispense(productsMachine) ;}
    }


}

package com.howtoprogram.junit5.chainofresponsabilitiestest;

public class GansitoImpl extends ICandyMachine {

    private  ICandyMachine chain;
    private double price = 12;
    private int contador ;


    @Override
    public void setNextChain(ICandyMachine nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(ProductsMachine productsMachine) {

        contador= calcular(productsMachine, this.price);

        productsMachine.setGansitos(contador);


        if (this.chain!=null)
        {this.chain.dispense(productsMachine) ;}
    }


}

package com.howtoprogram.junit5.chainofresponsabilitiestest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandyMachineTest {

    @Test
    void validateCandyMachineChains()
    {
        ICandyMachine c1 = new GansitoImpl();
        ICandyMachine c2 = new LollipopImpl();
        ICandyMachine c3 = new NitoImpl();

        c1.setNextChain(c2);
        c2.setNextChain(c3);

        double myMoney = 1119;
        ProductsMachine productsMachine = new ProductsMachine();
        productsMachine.setMoney(myMoney);
        c1.dispense(productsMachine);
        System.out.println(String.format("Gansitos: %d", productsMachine.getGansitos()));
        System.out.println(String.format("Lollipop: %d", productsMachine.getLollipops()));
        System.out.println(String.format("Nitos: %d", productsMachine.getNitos()));
        System.out.println(String.format("Money : %f", productsMachine.getMoney()));

        assertEquals(93, productsMachine.getGansitos());
        assertEquals(0, productsMachine.getLollipops());
        assertEquals(1, productsMachine.getNitos());
        assertEquals(1, productsMachine.getMoney());
    }

}

package com.howtoprogram.junit5.facadetest;

public class AutomovilFacade {

    public static void arrancar ()
    {
        ComprobarLiquidos liquidos = new ComprobarLiquidos();
        ComprobarGasolina gasolina = new ComprobarGasolina();
        ComprobarAsientos asientos = new ComprobarAsientos();
        ComprobarEspejos espejos = new ComprobarEspejos();
        Arrancar arrancar = new Arrancar();

        liquidos.comprobar();
        gasolina.comprobar();
        asientos.comprobar();
        espejos.comprobar();
        arrancar.encender();

        System.out.println("Vamonos");

    }
}

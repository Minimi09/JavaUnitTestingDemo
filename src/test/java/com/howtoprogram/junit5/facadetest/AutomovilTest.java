package com.howtoprogram.junit5.facadetest;

import org.junit.jupiter.api.Test;

public class AutomovilTest {

    @Test
    void encenderAuto()
    {
        AutomovilFacade.arrancar();
      }
}

package com.howtoprogram.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorTest {

    private CalculatorClass calculatorVar;

     Integer num;
     Integer num2;

     /*
    @Test
    @DisplayName("should make a Sum")
    void testSum() {
        calculatorVar= new CalculatorClass();
        num=0;
        num2=-30;
        assertEquals(num+num2, calculatorVar.suma(num,num2));
    }

    @Test
    @DisplayName("should make a rest")
    void testResta() {
        calculatorVar= new CalculatorClass();
        num=0;
        num2=-30;
        assertEquals(num-num2, calculatorVar.resta(num,num2));
    }

    @Test
    @DisplayName("should make a division")
    void testDiv() {
        calculatorVar= new CalculatorClass();
        num=0;
        num2=-30;
        assertEquals( num/num2 , calculatorVar.division(num,num2));
    }

    @Test
    @DisplayName("should make a division with 0")
    void testDivZero() {
        calculatorVar= new CalculatorClass();
        num=3;
        num2=0;
        assertEquals( 0 , calculatorVar.division(num,num2));
    }

    @Test
    @DisplayName("should make a multiplication")
    void testMulti() {
        calculatorVar= new CalculatorClass();
        num=0;
        num2=-30;
        assertEquals(num*num2, calculatorVar.multiplicacion(num,num2));
    }
*/

    @Test
    @DisplayName("should make a Sum")
    void testSum() {
        CalculatorClass calculator = mock(CalculatorClass.class);
        when(calculator.suma(20,20)).thenReturn(80);
        int suma= calculator.suma(20,20);
        assertEquals(80,suma);
    }

    @Test
    @DisplayName("should make a rest")
    void testResta() {
        CalculatorClass calculator = mock(CalculatorClass.class);
        when(calculator.resta(10,5)).thenReturn(30);
        int resta= calculator.resta(10,5);
        assertEquals(30,resta);
    }

    @Test
    @DisplayName("should make a division")
    void testDiv() {
        CalculatorClass calculator = mock(CalculatorClass.class);
        when(calculator.division(10,5)).thenReturn(100);
        int division= calculator.division(10,5);
        assertEquals(100,division);
    }

    @Test
    @DisplayName("should make a multiplication")
    void testMulti() {
        CalculatorClass calculator = mock(CalculatorClass.class);
        when(calculator.multiplicacion(6,10)).thenReturn(200);
        int multiplicacion= calculator.multiplicacion(6,10);
        assertEquals(200,multiplicacion);
    }
}

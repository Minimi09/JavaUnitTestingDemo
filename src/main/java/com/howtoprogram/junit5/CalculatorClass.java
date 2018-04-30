package com.howtoprogram.junit5;

public class CalculatorClass {
    private Integer num1;
    private Integer num2;


    public int suma(int num1, int num2)
    {
        return num1+num2;
    }

    public int resta(int num1, int num2)
    {
        return num1-num2;
    }

    public int division(int num1, int num2)
    {

       return num2!=0 ? (num1/num2) : 0;
    }

    public int multiplicacion(int num1, int num2)
    {
        return num1*num2;
    }

    public static class FizzBuzz {


    }
}

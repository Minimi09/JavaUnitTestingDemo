package com.howtoprogram.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {


    @Test
    @DisplayName("Should validate Fizz")
    void validateFizz()
    {
        Integer num1 = 3;
        Integer num2 = 3;
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Fizz");
        List<String> result= FizzBuzz.fizzBuzz(num1,num2);
        assertEquals(expectedList, result);
    }

    @Test
    @DisplayName("Should validate Buzz")
    void validateBuzz()
    {
        Integer num1 = 5;
        Integer num2 = 5;
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Buzz");
        List<String> result= FizzBuzz.fizzBuzz(num1,num2);
        assertEquals(expectedList, result);
    }

    @Test
    @DisplayName("Should validate FizzBuzz")
    void validateFizzBuzz()
    {
        Integer num1 = 1;
        Integer num2 = 7;
        List<String> expectedList = new ArrayList<>();
        expectedList.add("1");
        expectedList.add("2");
        expectedList.add("Fizz");
        expectedList.add("4");
        expectedList.add("Buzz");
        expectedList.add("Fizz");
        expectedList.add("7");
        List<String> result= FizzBuzz.fizzBuzz(num1,num2);
        assertEquals(expectedList, result);
    }

    /*
    @Test
    @DisplayName("Should validate value 0 as In")
    void validateZeros()
    {
        Integer num1=0;
        Integer num2=0;
        List<String> expectedList = new ArrayList<>();
        expectedList.add("0");
        List<String> result= FizzBuzz.fizzBuzz(num1,num2);
        assertEquals(expectedList, result);
    }
    */
    @Test
    void validateRange()
    {
        Integer num1=9;
        Integer num2=1;
        List<String> expectedList = new ArrayList<>();
        expectedList.add("0");
        List<String> result= FizzBuzz.fizzBuzz(num1,num2);
        assertEquals(expectedList, result);

    }
}

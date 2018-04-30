package com.howtoprogram.junit5.observablepractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObservablesDemoTest {

    int[] numbersList = {1,5,10,20};
    int[] emptyList = {};

    @Test
    @DisplayName("Should return number that are greater than 10")
    void shouldReturnGreaterThanTen()
    {
        int[] expectedList= {20};
        int[] result = ObservablesDemo.getGreaterThanTen(numbersList);
        assertArrayEquals(expectedList,result);
    }

    @Test
    @DisplayName("Should return two times number")
    void shouldReturnNumberTwoTimes()
    {
        int[] expectedList= {2,10,20,40};
        int[] result = ObservablesDemo.getDuplicate(numbersList);
        assertArrayEquals(expectedList,result);
    }

    @Test
    @DisplayName("Should validate empty")
    void shouldValidateEmptyDuplicate()
    {
        int[] expectedList= {};
        int[] result = ObservablesDemo.getDuplicate(emptyList);
        assertArrayEquals(expectedList,result);
    }

    @Test
    @DisplayName("Should validate empty")
    void shouldValidateEmptyGreater()
    {
        int[] expectedList= {};
        int[] result = ObservablesDemo.getGreaterThanTen(emptyList);
        assertArrayEquals(expectedList,result);
    }
}

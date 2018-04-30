package com.howtoprogram.junit5.observablepractice;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.testng.annotations.Test;

public class ObservableDemoIntegerTest {
    Integer[] numbersList = {1,5,10,20};
    Integer[] emptyList = {};

    @Test
    void shouldReturnGreaterThanTen()
    {
        Integer[] expectedList= {20};
        Integer[] result = ObservableDemoInteger.getGreaterThanTen(numbersList);
        assertArrayEquals(expectedList,result);
    }

    @Test
    void shouldReturnNumberTwoTimes()
    {
        Integer[] expectedList= {2,10,20,40};
        Integer[] result = ObservableDemoInteger.getDuplicate(numbersList);
        assertArrayEquals(expectedList,result);
    }

    @Test
    void shouldValidateEmptyDuplicate()
    {
        Integer[] expectedList= {};
        Integer[] result = ObservableDemoInteger.getDuplicate(emptyList);
        assertArrayEquals(expectedList,result);
    }

    @Test
    void shouldValidateEmptyGreater()
    {
        Integer[] expectedList= {};
        Integer[] result = ObservableDemoInteger.getGreaterThanTen(emptyList);
        assertArrayEquals(expectedList,result);
    }
}
//Observable sin el suscbribe me fijo que regrsa y ya
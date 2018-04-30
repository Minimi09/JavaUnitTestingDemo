package com.howtoprogram.junit5;

import io.reactivex.Flowable;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(Integer num1, Integer num2) {

        List<String> result = new ArrayList<>();

        /*
                Flowable.range(num1, num2)
                .map(v -> "Fizz" ? v % 3 == 0)
                .toList()
                       .map()
                .subscribe(v -> {});
       */

        if (num2>=num1) {
            for (int i = num1; i <= num2; i++) {
                if ((i % 3 == 0 && i % 5 == 0)) {
                    result.add("FizzBuzz");
                } else if ((i % 5 == 0) ) {
                    result.add("Buzz");
                } else if (i % 3 == 0 ) {
                    result.add("Fizz");
                } else {
                    result.add(Integer.toString(i));
                }
            }
            return result;
            }
            result.add("0");
            return result;
        }

}

package com.howtoprogram.junit5.observablepractice;


import io.reactivex.Flowable;
import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObservablesDemo {


    public static int[] getGreaterThanTen(int[] numbersList) {

        Integer[] numberList2 = Arrays.stream(numbersList).boxed().toArray(Integer[]::new);
        List<Integer> resultList = new ArrayList<>();

        Flowable.fromArray(numberList2).filter(x -> x > 10).toList().subscribe(x -> {resultList.addAll(x);});

         //Observable.fromArray(numberList2).filter(x -> x > 10).subscribe();
        return  resultList.stream().mapToInt(x -> x).toArray();
    }

    public static int[] getDuplicate(int[] numbersList) {

       // Observable.fromArray(Arrays.stream(numbersList)).filter(x -> x > 10);
        Integer[] numberList2 = Arrays.stream(numbersList).boxed().toArray(Integer[]::new);
        List<Integer> resultList = new ArrayList<>();

        Flowable.fromArray(numberList2).map(x -> x * 2).toList().subscribe(x -> {resultList.addAll(x);});

        //Observable.fromArray(numberList2).filter(x -> x > 10).subscribe();
        return  resultList.stream().mapToInt(x -> x).toArray();
    }
}

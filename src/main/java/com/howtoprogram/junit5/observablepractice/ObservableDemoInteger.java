package com.howtoprogram.junit5.observablepractice;
import io.reactivex.Flowable;
import java.util.ArrayList;
import java.util.List;

public class ObservableDemoInteger {

    public static Integer[] getDuplicate(Integer[] numbersList) {

        List<Integer> resultList = new ArrayList<>();

        Flowable.fromArray(numbersList).map(x -> x * 2).toList().subscribe(x -> {resultList.addAll(x);});

            //Integer[] result = resultList.toArray(new Integer[0]);
            //El stream me convierte las cosas a listas manejables.
        return  resultList.stream().toArray(Integer[]::new);
    }

    public static Integer[] getGreaterThanTen(Integer[] numbersList) {
        List<Integer> resultList = new ArrayList<>();

        Flowable.fromArray(numbersList).filter(x -> x > 10).toList().subscribe(x -> {resultList.addAll(x);});

        Integer[] result = resultList.toArray(new Integer[0]);
        return result;
    }
}

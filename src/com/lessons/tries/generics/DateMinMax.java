package com.lessons.tries.generics;

import java.time.LocalDate;

public class DateMinMax {
    public static void main(String[] args) {
        LocalDate[] dates = {
                LocalDate.of(1981, 02, 10),
                LocalDate.of(1984, 10, 05),
                LocalDate.of(2008, 11, 11),
                LocalDate.of(2015, 12, 04)
        };

        Pair<LocalDate> datePair = ArrayAlg.minMax(dates);
        System.out.println("Minimum is " + datePair.getValue1());
        System.out.println("Maximum is " + datePair.getValue2());
    }
}
class ArrayAlg {
    public static <T extends Comparable> Pair<T> minMax (T[] array){
        if (array == null || array.length == 0) return null;
        T min = array[0];
        T max = array[0];
        for (T arr : array){
            if (min.compareTo(arr) > 0) min =arr;
            if (max.compareTo(arr) < 0) max =arr;
        }
        return new Pair<>(min, max);
    }
}

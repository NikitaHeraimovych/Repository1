package com.gmail.nikita00.wade;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main (String[] args) {
        int[] arr = new int[]{5, 4, 3, 11, 22, 0, 33, 43, 12, 15, 10, 0};
        System.out.println (Arrays.toString (arr));
        System.out.printf ("%.2f%n  ", task1 (Arrays.stream (arr)));
        System.out.println (task2 (Arrays.stream (arr)));
        System.out.println (task3 (Arrays.stream (arr)));
        System.out.println (task4 (Arrays.stream (arr)));
        System.out.println (Arrays.toString (task5 (Arrays.stream (arr))));
    }

    //    1. Найти среднее значение элементов массива
    public static Double task1 (IntStream intStream) {
        return intStream.average ( ).getAsDouble ( );
    }

    //  2. Найти минимальный элемент, значение и индекс
    public static String task2 (IntStream intStream) {
        ArrayList<Integer> arr = intStream.boxed ( ).collect (Collectors.toCollection (ArrayList::new));
        Optional<Integer> minInt = arr.stream ( ).min (Comparator.comparing (Integer::intValue));
        int min;
        if (minInt.isEmpty ( )) {
            return "err";
        }
        min = minInt.get ( );
        return min + ", index - " + arr.indexOf (min);
    }

    //  3. Посчитать количество элементов равных нулю
    public static long task3 (IntStream intStream) {
        return intStream.filter (a -> a == 0).count ( );
    }

    //  4. Посчитать количество элементов больше нуля
    public static long task4 (IntStream intStream) {
        return intStream.filter (a -> a > 0).count ( );
    }

    // 5. Помножить элементы массива на число
    public static int[] task5 (IntStream intStream) {
        return intStream.map (a -> a * 4).toArray ( );
    }
}

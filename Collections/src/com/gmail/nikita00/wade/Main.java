package com.gmail.nikita00.wade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Task2  ---- Написать реализацию коллекции (например, ArrayList) в которую можно добавлять данные и нельзя удалять.
//
//
public class Main {

    public static void main(String[] args) {;
        ArrayList<Integer> arr = new ArrayList<> ( List.of ( 1,1,2,2,2,3,10,5,5,5,5 ) );
        task1 (arr);
    }


    //Есть ArrayList<Integer> - ов. За один проход подсчитать количество повторений каждого элемента.
    public static void task1(ArrayList<Integer> arr){
        Map<Integer, Integer> map = new HashMap<> ();

        for (int i : arr) {
            map.computeIfPresent (i, (s, a) -> a+=1);
                map.putIfAbsent (i, 1);
        }
        System.out.println (map );
    }
}

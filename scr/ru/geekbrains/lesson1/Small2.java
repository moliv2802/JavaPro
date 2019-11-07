package ru.geekbrains.lesson1;

import java.util.ArrayList;

public class Small2 {

    public static <E> ArrayList<E> toList(E[] arr){
        ArrayList<E> array = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            array.add(arr[i]);
        }
        return array;

    }

}

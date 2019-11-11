package ru.geekbrains.forester;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Forester {
    public static void main(String[] args) {
     int mass[] = {5,1,5,2,2,4,1,4,5,1,5,3,2,4,4,4,5,1,3,4,2,2,1,2,4,4,4,5,4,3,5,4,4,5,5,1,4,1,5,3,1,4,5,3,3,4,2,2,4,4,5,5,1,1,1,4,5,5,
        4,4,2,4,3,1,3,3,1,1,3,1,3,4,4,3,2,2,1,3,4,4,2,3,4,2,4,4,1,4,4,4,2,1,2,4,1,5,2,2,5,4,2,2,3,1,5,5,3,5,3,1,4,5,4,2,1,3,
        1,2,1,4,1,3,4,2,2,};
     Map<Integer,Integer> map = new HashMap<>();
     int count = 1;
        for (int i = 0; i < mass.length ; i++) {
            if (map.containsKey(mass[i])){
                map.put(mass[i],map.get(mass[i]) +1);
            }else map.put(mass[i],count);
        }

        for (Integer keyValue: map.keySet()) {
            String key = keyValue.toString();
            String value = map.get(keyValue).toString();
            System.out.println(key + " повторяется " + value + " раз");
        }
//        System.out.println(Arrays.asList(map));
   }
}

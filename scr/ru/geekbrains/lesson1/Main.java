package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Box b = new Box();
        b.putFruit(new Orange());
        b.putFruit(new Orange());

        List<String> test = Small2.toList(new String[] {"Hello", "World"} );
        String[] mass = {"Hello", "World"};
        Small1.swap(mass, 0, 1);
        System.out.println(Arrays.toString(mass));

    }
}

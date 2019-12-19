package ru.geekbrains.arraysorting;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        ArraySorting<Integer> arr = new ArraySorting<>(1000000);
        for (int i = 0; i < 999999 ; i++) {
            arr.add(rand.nextInt(10));
        }
        long sSel = System.currentTimeMillis();
        System.out.println(sSel);
        arr.selectionSort();
        long fSel = System.currentTimeMillis();
        System.out.println(fSel);
        System.out.println("Время выполнения сортировки методом выбора: " + (fSel - sSel));
        System.out.println(arr);






    }
}

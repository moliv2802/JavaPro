package ru.geekbrains.arraysorting;

import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        ArraySorting<Integer> arr = new ArraySorting<>(1000000);
        for (int i = 0; i < 999999; i++) {
            arr.add(rand.nextInt(100));
        }

        long sSel = System.currentTimeMillis();
        System.out.println(sSel);
        arr.selectionSort();
        long fSel = System.currentTimeMillis();
        System.out.println(fSel);
        System.out.println("Время выполнения сортировки методом выбора: " + (fSel - sSel));


        long sIn = System.currentTimeMillis();
        System.out.println(sIn);
        arr.insertionSort();
        long fIn = System.currentTimeMillis();
        System.out.println(fIn);
        System.out.println("Время выполнения сортировки методом вставки: " + (fIn - sIn));

        long sB = System.currentTimeMillis();
        System.out.println(sB);
        arr.bubbleSort(Comparator.naturalOrder());
        long fB = System.currentTimeMillis();
        System.out.println(fB);
        System.out.println("Время выполнения сортировки пузырьковым методом: " + (fB - sB));
        //System.out.println(arr);

    }
}

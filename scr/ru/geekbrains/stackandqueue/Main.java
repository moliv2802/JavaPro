package ru.geekbrains.stackandqueue;

public class Main {
    public static void main(String[] args) {
        MyDeque<Integer> md = new MyDeque<>(100);
        md.insertRight(1);
        md.insertRight(2);
        md.insertRight(3);
        md.insertRight(4);
        md.insertLeft(55);


        for (int i = 0; i < 5; i++) {
            System.out.println(md.removeLeft());
        }


    }
}
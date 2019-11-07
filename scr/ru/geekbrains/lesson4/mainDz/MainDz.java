package ru.geekbrains.lesson4.mainDz;

public class MainDz {
    public static void main(String[] args) throws InterruptedException {

        Thread tread1 = new Thread(new A());
        tread1.start();
        Thread tread2 = new Thread(new B());
        tread2.start();
        Thread tread3 = new Thread(new C());
        tread3.start();


    }
}

package ru.geekbrains.lesson4.mainDz;

public class A implements Runnable, Synchronized{
    @Override
    public void run() {
        synchronized (object) {

            for (int i = 0; i < 5; i++) {
                System.out.print("А");
                try {
                    object.wait();
                    object.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

package ru.geekbrains.lesson4.mainDz;

public class C implements Runnable, Synchronized{
    @Override
    public void run() {
        synchronized (object) {

            for (int i = 0; i < 5; i++) {
                System.out.print("C");
                try {
                    object.notify();
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

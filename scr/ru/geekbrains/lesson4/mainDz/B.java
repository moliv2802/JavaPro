package ru.geekbrains.lesson4.mainDz;

public class B implements Runnable, Synchronized{
    @Override
    public void run() {
        synchronized (object) {

            for (int i = 0; i < 5; i++) {
                System.out.print("B");
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

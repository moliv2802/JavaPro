package ru.geekbrains.lesson4.dopDz;

public class Worker implements Runnable{
    public String name;
    public Worker(String name) {
        this.name = name;
        System.out.println(this.name + " пошел к МФУ...");
    }

    public  void print() throws InterruptedException {
        System.out.println(this.name + " печатает...");
        Thread.sleep(3000);
        System.out.println(this.name + " закончил печатать");
    }

    public void scan() throws InterruptedException {
        System.out.println(this.name + " сканирует...");
        Thread.sleep(4000);
        System.out.println(this.name + " закончил сканировать");
    }

    @Override
    public void run() {
            try {
                print();
                Thread.sleep(1000);
                scan();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Принтер сломался!");
                e.printStackTrace();
            }
    }
}

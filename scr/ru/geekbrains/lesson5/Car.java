package ru.geekbrains.lesson5;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class Car implements Runnable {

    private volatile static AtomicInteger CARS_COUNT;
    static {
        CARS_COUNT = new AtomicInteger();
    }
    private CountDownLatch start;
    private CountDownLatch finish;
    private Race race;
    private int speed;
    private String name;
    public String getName() {
        return name;

    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed, CountDownLatch start, CountDownLatch finish) {
        this.race = race;
        this.speed = speed;
        this.start = start;
        this.finish = finish;
        CARS_COUNT.incrementAndGet();
        this.name = "Участник #" + CARS_COUNT;
    }
    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            start.countDown();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            start.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (NullPointerException e){
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        if (finish.getCount() == CARS_COUNT.get()){
            System.out.println(this.name + " WIN");
        }
        finish.countDown();
        try {
            finish.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


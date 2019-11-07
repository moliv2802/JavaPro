package ru.geekbrains.lesson4.dopDz;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Worker> arrOffice = new ArrayList<>();

        arrOffice.add(new Worker("Игорь"));
        arrOffice.add(new Worker("Вова"));
        arrOffice.add(new Worker("Дима"));

        for (Worker worker : arrOffice) {
            new Thread(worker).start();
            Thread.currentThread().join(10000); // Не понял как по другому
        }
        for (Worker worker : arrOffice) {
            new Thread(worker).interrupt();
        }
    }
}

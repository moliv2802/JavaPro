package ru.geekbrains.lesson1;

import java.util.ArrayList;

public class Box <E extends Fruit> {
    ArrayList<E> box= new ArrayList<>();

    public void putFruit(E o){
        box.add(o);
    }

    public float getWeight(){
        float sum = 0;
        for (int i = 0; i <box.size() ; i++) {
            sum = sum + box.get(i).getWeight();
        }
        return sum;
    }

    public boolean compareBox(Box<?> b){
        return this.getWeight() == b.getWeight();
    }

    public void swapBox(Box<E> b){

        for (int i = 0; i < this.box.size() ; i++) {
            b.putFruit(this.box.get(i));
        }
        this.box.clear();

    }




}


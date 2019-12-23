package ru.geekbrains.stackandqueue;

import java.util.EmptyStackException;

public class MyDeque<T> {
    private T[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private int begin = 0;
    private int end = 0;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {

        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public boolean isFull() {

        return size == list.length;
    }

    public boolean isEmpty() {

        return size == 0;
    }

    private int nextIndex(int index) {

        return (index + 1) % list.length;
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[begin];
    }

    public void insertRight(T value) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        list[end] = value;
        size++;
        end = nextIndex(end);
    }

    public T removeLeft() {
        T temp = peekFront();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;

    }


    public void insertLeft(T value) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        T[] arr = (T[]) new Object[list.length + 1];
        arr[0] = value;
        for (int i = 0; i < list.length + 1; i++) {
            arr[i + 1] = list[i];
        }

        System.arraycopy(arr, 0, list, 0, list.length);
        size++;
        end = nextIndex(end);
    }

    public T removeRight() {
        T temp = list[end];
        list[end] = list[end - 1];
        size--;
        return temp;
    }


}

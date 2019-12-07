package ru.geekbrains.JUnit;

public class NewArrAfter4 {
    public int[] arrAfter4(int[] arr) {
        int num1 = -1;
        int num2 = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                num1 = i;
            }
        }
        if (num1 == -1) {
            throw new RuntimeException("4 не найдена");
        }
        int[] arr1 = new int[num2 - num1];
        System.arraycopy(arr, num1 + 1, arr1, 0, arr1.length);
        return arr1;
    }
}

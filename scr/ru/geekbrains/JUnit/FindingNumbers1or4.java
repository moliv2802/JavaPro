package ru.geekbrains.JUnit;

public class FindingNumbers1or4 {
    public boolean contains1or4(int[] arr) {
        boolean num1 = false;
        boolean num2 = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) num1 = true;
            if (arr[i] == 4) num2 = true;
        }
        return (num1 && num2);
    }
}

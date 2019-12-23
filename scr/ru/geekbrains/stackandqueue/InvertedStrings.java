package ru.geekbrains.stackandqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class InvertedStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку для переворота:");
        String str = reader.readLine();
        char[] strToArray = str.toCharArray();
        char[] invArray = new char[strToArray.length];
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < strToArray.length; i++) {
            stack.push(strToArray[i]);
        }
        for (int i = 0; i < strToArray.length; i++) {
            invArray[i] = stack.peek();
            stack.pop();
        }
        System.out.println("Перевернутая строка:");
        System.out.println(new String(invArray));
    }
}
package ru.geekbrains.spiral;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Spiral {

    public static void main(String[] args) throws IOException {
        int k = 1;
        int direction;
        int iteration;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество строк: ");
        int str = Integer.parseInt(reader.readLine());
        System.out.println("Введите количество столбцов: ");
        int col = Integer.parseInt(reader.readLine());
        int [][] spiralArr = new int[str][col];
        System.out.println("Вы ввели массив размерностью [" + str + "][" + col + "], создаем спиральный массив...");
        for (int n = 0; k <= str*col; n++) {
            direction = n % 4;
            iteration = n / 4;
            switch (direction) {
                case 0:
                    for (int j = iteration; j < str - iteration; j++, k++) {
                        spiralArr[iteration][j] = k;
                    }
                    break;
                case 1:
                    for (int i = iteration + 1; i < col - iteration; i++, k++) {
                        spiralArr[i][str - iteration - 1] = k;
                    }
                    break;
                case 2:
                    for (int j = str - iteration - 2; j >= iteration; j--, k++) {
                        spiralArr[col - iteration - 1][j] = k;
                    }
                    break;
                case 3:
                    for (int i = col - iteration - 2; i > iteration; i--, k++) {
                        spiralArr[i][iteration] = k;
                    }
                    break;
            }
        }
        for (int x = 0; x < str; x++) {
            for (int y = 0; y < col; y++) {
                System.out.print(spiralArr[x][y] + " ");
            }
            System.out.println();
        }
    }
}

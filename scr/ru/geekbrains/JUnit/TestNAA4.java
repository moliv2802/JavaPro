package ru.geekbrains.JUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestNAA4 {
    private NewArrAfter4 newArrAfter4;

    @BeforeEach
    void start() {
        newArrAfter4 = new NewArrAfter4();
    }

    @Test
    void test1() {
        int[] arr = {2, 5, 6, 7, 4, 5, 5, 5, 5, 5};
        int[] arr1 = {5, 5, 5, 5, 5};
        Assertions.assertArrayEquals(arr1, newArrAfter4.arrAfter4(arr));
    }

    @Test
    void test2() {
        int[] arr = {3, 5, 6, 7, 8, 9, 9, 0};
        Assertions.assertThrows(RuntimeException.class, () -> newArrAfter4.arrAfter4(arr));
    }

}

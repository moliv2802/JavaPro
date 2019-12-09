package ru.geekbrains.JUnit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFN1or4 {
    private FindingNumbers1or4 findingNumbers1or4;

    @BeforeEach
    void start() {
        findingNumbers1or4 = new FindingNumbers1or4();
    }

    @Test
    void test1() {
        int[] arr = {3, 4, 6, 7, 8, 9, 0, 1, 5, 7, 8, 5};
        Assertions.assertTrue(findingNumbers1or4.contains1or4(arr));
    }

    @Test
    void test2() {
        int[] arr = {2, 1, 5, 6, 7, 7, 8, 9, 0};
        Assertions.assertFalse(findingNumbers1or4.contains1or4(arr));
    }

    @Test
    void test3() {
        int[] arr = {3, 4, 5, 7, 7, 8, 9, 0};
        Assertions.assertFalse(findingNumbers1or4.contains1or4(arr));
    }
}

package com.study.javadatastructure.chap02;

import org.junit.jupiter.api.Test;

import static com.study.javadatastructure.chap02.ReverseArray.reverseArray;
import static com.study.javadatastructure.chap02.ReverseArray.sumOf;

public class ReverseArrayTest {
    private final ReverseArray reverseArray = new ReverseArray();

    @Test
    void reverseArrayTest() {
        int[] a = {5, 10, 73, 2, -5, 42};
        reverseArray(a);
        for (int num : a) {
            System.out.println("a = " + num);
        }
        System.out.println("sum = " + sumOf(a));
    }
}

package com.study.javadatastructure.chap02;

import org.junit.jupiter.api.Test;

public class CloneArrayTest {
    @Test
    void cloneArrayTest() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone(); // b는 a의 복제를 참조
        int[] c = a;            // c는 a를 참조

        b[2] = 0;
        for (int num : a) {
            System.out.println("a = " + num);
        }
        System.out.println("==========================");
        for (int num : b) {
            System.out.println("b = " + num);
        }
        System.out.println("==========================");
        for (int num : c) {
            System.out.println("c = " + num);
        }
        c[1] = 0;       // c는 a를 참조함으로 값을 변경하면 참조하는 a의 값이 변경된다.
        System.out.println("==========================");
        for (int num : c) {
            System.out.println("c = " + num);
        }
        System.out.println("==========================");
        for (int num : a) {
            System.out.println("a = " + num);
        }
    }
}

package com.study.javadatastructure.chap02;

import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    private static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    public static void main(String[] args) {
        int[] a = {5, 10, 73, 2, -5, 42};
        reverseArray(a);
        for (int num : a) {
            System.out.println("a = " + num);
        }
    }

    public static int sumOf(int[] a) {
        return Arrays.stream(a).sum();
    }
}

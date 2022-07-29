package com.study.javadatastructure;

public class SelectionSort {
    public int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int lowestNumberIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[lowestNumberIndex]) {
                    lowestNumberIndex = j;
                }
            }

            if (lowestNumberIndex != i) {
                int temp = array[i];
                array[i] = array[lowestNumberIndex];
                array[lowestNumberIndex] = temp;
            }
        }
        return array;
    }
}

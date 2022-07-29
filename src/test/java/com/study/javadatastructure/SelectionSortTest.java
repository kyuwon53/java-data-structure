package com.study.javadatastructure;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {
    @Autowired
    private final SelectionSort selectionSort;

    SelectionSortTest() {
        selectionSort = new SelectionSort();
    }

    @Test
    void selectionSortTest() {
        int[] array = {4, 2, 7, 1, 3};
        assertArrayEquals(new int[]{1, 2, 3, 4, 7}, selectionSort.selectionSort(array));
    }

}
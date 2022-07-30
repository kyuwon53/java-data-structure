package com.study.javadatastructure;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntersectionSetTest {
    @Autowired
    private final IntersectionSet intersectionSet;

    IntersectionSetTest() {
        intersectionSet = new IntersectionSet();
    }

    @Test
    public void IntersectionSetTest() throws Exception {
        //given
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {0, 2, 4, 6, 8};
        //when

        //then
        assertEquals(Arrays.asList(2, 4), intersectionSet.intersectionSet(array1, array2));
    }
}
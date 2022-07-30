package com.study.javadatastructure;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuplicateValueTest {
    @Autowired
    private final DuplicateValue duplicateValue;


    DuplicateValueTest() {
        duplicateValue = new DuplicateValue();
    }

    @Test
    public void DuplicateValueTest() {
        //given
        String[] array = {"a", "b", "c", "d", "c", "e", "f"};
        //when
        assertEquals("c", duplicateValue.duplicateValue(array));
        //then
    }
}
package com.study.javadatastructure;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstNonDuplicateTest {
    @Autowired
    private final FirstNonDuplicate firstNonDuplicate = new FirstNonDuplicate();

    @Test
    public void FirstNonDuplicateTest() throws Exception {
        //given
        String sentence = "minimum";
        assertEquals("n", firstNonDuplicate.firstNonDuplicate(sentence));
    }

}
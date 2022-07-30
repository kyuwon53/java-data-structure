package com.study.javadatastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AlphabetFindTest {
    private final AlphabetFind alphabetFind;

    AlphabetFindTest() {
        alphabetFind = new AlphabetFind();
    }
    @Test
    public void AlphabetFindTest() throws Exception {
        //given
        String sentence = "the quick brown box jumps over a lazy dog";

        assertEquals("f", alphabetFind.findAlphabet(sentence));
    }
}
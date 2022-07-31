package com.study.javadatastructure;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecursiveTest {

    @Autowired
    private final Recursive recursive = new Recursive();

    @Test
    public void RecursiveTest() throws Exception {
        List<String> array = new ArrayList<>();
        array.add("ab");
        array.add("c");
        array.add("def");
        array.add("ghij");
        assertEquals(10, recursive.characterCount(array));
    }

    @Test
    public void 삼각수_테스트() throws Exception {
        assertEquals(28, recursive.triangularNumbers(7));
        assertEquals(21, recursive.triangularNumbers(6));
    }

    @Test
    public void X_위치_반환_테스트() throws Exception {
        assertEquals(23, recursive.indexOfX("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void 유일_경로_테스트() throws Exception {
        assertEquals(28, recursive.uniquePaths(3, 7));
    }
}
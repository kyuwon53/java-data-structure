package com.study.javadatastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackQueueTest {
    private final StackQueue stackQueue = new StackQueue();

    @Test
    public void StackQueueTest() throws Exception {
        //given
        String string = "abcde";

        assertEquals("edcba", stackQueue.reverseString(string));
    }
    @Test
    public void 스택을_사용해_문자열을_거꾸로_출력() throws Exception {
        //given
        String string = "abcde";

        assertEquals("edcba", stackQueue.reverseStringStack(string));
    }

}
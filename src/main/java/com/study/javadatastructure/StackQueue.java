package com.study.javadatastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackQueue {
    public String reverseString(String string) {
        List<String> stack = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            stack.add(string.substring(i, i + 1));
        }

        String result = "";

        for (int i = 0; i < stack.size(); i++) {
            result += stack.get(stack.size() - i - 1);
        }
        return result;
    }

    public String reverseStringStack(String string) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.substring(i, i + 1));
        }

        String result = "";
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            result += stack.pop();
        }
        return result;
    }
}

package com.study.javadatastructure;

import java.util.HashMap;
import java.util.Map;

public class AlphabetFind {
    public String findAlphabet(String sentence) {
        String alpahbet = "abcdefghijklmnopqrstuvwxyz";
        Map<String, Boolean> hash = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            hash.put(sentence.substring(i, i + 1), true);
        }

        for (int i = 0; i < alpahbet.length(); i++) {
            if (!hash.containsKey(alpahbet.substring(i, i + 1))) {
                return alpahbet.substring(i, i + 1);
            }
        }
        return "None";
    }
}

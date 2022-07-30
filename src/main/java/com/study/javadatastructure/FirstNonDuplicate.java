package com.study.javadatastructure;

import java.util.HashMap;
import java.util.Map;

public class FirstNonDuplicate {
    public String firstNonDuplicate(String sentence) {
        Map<String, Integer> hash = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            String key = sentence.substring(i, i + 1);
            if (hash.containsKey(key)) {
                hash.put(key, hash.get(key) + 1);
            } else {
                hash.put(key, 1);
            }
        }

        for (int i = 0; i < sentence.length(); i++) {
            if (hash.get(sentence.substring(i, i + 1)) == 1) {
                return sentence.substring(i, i + 1);
            }
        }
        return "None";
    }
}

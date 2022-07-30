package com.study.javadatastructure;

import java.util.HashMap;
import java.util.Map;

public class DuplicateValue {

    public String duplicateValue(String[] array) {
        Map<String, Boolean> hash = new HashMap<>();
        for (String s : array) {
            if (hash.containsKey(s)) {
                return s;
            }
            hash.put(s, true);
        }
        return null;
    }
}

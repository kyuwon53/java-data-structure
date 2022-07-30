package com.study.javadatastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionSet {
    public List<Integer> intersectionSet(int[] array1, int[] array2) {
        Map<Integer, Boolean> set = new HashMap<>();
        List<Integer> integerList = new ArrayList<>();
        for (int num : array1) {
            set.put(num, true);
        }

        for (int num : array2) {
            if(set.containsKey(num)){
                integerList.add(num);
            }
        }
        return integerList;
    }
}

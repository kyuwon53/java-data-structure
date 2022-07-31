package com.study.javadatastructure;

import java.util.List;

public class Recursive {

    public int characterCount(List<String> array) {
        if (array.size() == 0) {
            return 0;
        }
        return array.get(0).length() + characterCount(array.subList(1, array.size()));
    }

    public int triangularNumbers(int number) {
        if (number == 1) {
            return 1;
        }
        return number + triangularNumbers(number - 1);
    }

    public int indexOfX(String str) {
        if (str.substring(0, 1).equals("x")) {
            return 0;
        }
        return indexOfX(str.substring(1, str.length())) + 1;
    }

    public int uniquePaths(int rows, int colunms) {
        if (rows == 1 || colunms == 1) {
            return 1;
        }
        return uniquePaths(rows - 1, colunms) + uniquePaths(rows, colunms - 1);
    }
}

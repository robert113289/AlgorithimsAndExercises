package com.exercises.leetcode.strings.easy;

import java.util.Arrays;

//https://leetcode.com/problems/reorder-data-in-log-files/
public class ReorderDataInLogFiles {

    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs,
                (log1, log2) -> {
                    int limit = 2;
                    String[] log1arr = log1.split(" ", limit);
                    String firstWord1 = log1arr[0];
                    String words1 = log1arr[1];
                    boolean isDigit1 = Character.isDigit(words1.charAt(0));
                    String[] log2arr = log2.split(" ", limit);
                    String firstWord2 = log2arr[0];
                    String words2 = log2arr[1];
                    boolean isDigit2 = Character.isDigit(words2.charAt(0));

                    if (!isDigit1 && !isDigit2) {
                        int cmp = words1.compareTo(words2);
                        if (cmp != 0) return cmp;
                        return firstWord1.compareTo(firstWord2);
                    } else {
                        if (!isDigit1) {
                            return -1;
                        } else if (!isDigit2) {
                            return 1;
                        } else {
                            return 0;
                        }

                    }
                });
        return logs;
    }
}

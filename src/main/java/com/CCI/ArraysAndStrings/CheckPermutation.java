package com.CCI.ArraysAndStrings;

public class CheckPermutation {
    public static boolean isPermutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] lettersValueOccurrence = new int[128];
        for (int i = 0; i < s.length(); i++) {
            lettersValueOccurrence[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            lettersValueOccurrence[t.charAt(i)]--;
            if (lettersValueOccurrence[t.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }
}

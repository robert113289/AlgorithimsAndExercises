package com.CCI.chapter_one_arrays_and_strings;

public class IsPermutation {
    //given 2 strings, write a method to decide if one is a permutation of the other.
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

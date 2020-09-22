package com.CCI.chapter_one_arrays_and_strings;

import java.util.Arrays;
import java.util.BitSet;

public class IsUnique {
    public boolean isUnique(String s){
        if(s.length() > 128) return false;
        boolean[] letters = new boolean[128];
        Arrays.fill(letters, false);
        for(char c : s.toCharArray()){
            if(letters[c]){
                return false;
            } else {
                letters[c] = true;
            }
        }
        return true;
    }

    public boolean isUniqueUsingBitSet(String s) {
        if (s.length() > 128) return false;
        BitSet letters = new BitSet();
        for (char c : s.toCharArray()) {
            if (letters.get(c)) {
                return false;
            } else {
                letters.set(c);
            }
        }
        return true;
    }
}

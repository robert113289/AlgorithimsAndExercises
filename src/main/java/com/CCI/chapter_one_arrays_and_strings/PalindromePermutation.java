package com.CCI.chapter_one_arrays_and_strings;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {

    //check if the string is a permutation of a palindrome.
    public boolean isPalindromePermutation(String s){
        Map<Character,Integer> letterFrequency = new HashMap<>();
        for(Character c : s.toCharArray()){
            if(c == ' ') continue;
            c = Character.toLowerCase(c);
            if(letterFrequency.containsKey(c)){
                letterFrequency.put(c, letterFrequency.get(c) + 1);
            } else {
                letterFrequency.put(c,1);
            }
        }
        return numValuesOdd(letterFrequency.values()) <= 1;
    }
    public int numValuesOdd(Collection<Integer> values){
        int count = 0;
        for(Integer num : values){
            if(num % 2 != 0){
                count++;
            }
        }
        return count;
    }
}

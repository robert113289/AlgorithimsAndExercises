package com.CCI.chapter_one_arrays_and_strings;

import java.util.ArrayDeque;
import java.util.Deque;

public class OneAway {
    //check if two strings are one "edit" away from being the same
    public boolean isOneEditAway(String a, String b){
        if (a.equals(b)) return true;
        if (Math.abs(a.length() - b.length()) > 1) return false;
        Deque<Character> q = new ArrayDeque<>(); //pale
        int countChanges = 0;
        String longerString = a.length() > b.length() ? a : b; //pales
        String shorterString = a.length() > b.length() ? b : a; //pale
        for(Character c : shorterString.toCharArray()){
            q.add(c);
        }
        for(Character c : longerString.toCharArray()){
            if(q.peek() == null || !q.peek().equals(c)) {
                countChanges++;
                if(a.length() == b.length()){
                    q.poll();
                }
            } else{
                q.poll();
            }
        }
        return countChanges <= 1;
    }
}

package com.CCI;

public class ArraysAndStrings {
    //check if 2 strings are permutation of each other
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

    // converts a char array with extra space for additional characters to a url string in place with O(n) time
    public static String urlIfy(char[] chars, int actualLength){
        int j = chars.length - 1;
        for(int i = actualLength - 1; i >= 0; i--){
            //check if space
            if(Character.isSpaceChar(chars[i])){
                //move
                chars[j - 2] = '%';
                chars[j - 1] = '2';
                chars[j]= '0';
                j -= 3;
            } else {
                chars[j] = chars[i];
                j--;
            }
        }
        return new String(chars);
    }

    //converts a string to a url using a string builder.
    public static String urlIfy(String str){
        str = str.trim(); //may have trailing white space
        StringBuilder builder = new StringBuilder();
        for(char c : str.toCharArray()){
            if(!Character.isSpaceChar(c)) {
                builder.append(c);
            }else{
                builder.append("%20");
            }
        }
        return builder.toString();
    }
}

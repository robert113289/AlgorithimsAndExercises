package com.CCI.chapter_one_arrays_and_strings;

public class StringCompression {

    public static String stringCompression(String str){

        StringBuilder b = new StringBuilder();
        int co = 0;
        for(int i = 0; i < str.length(); i++){
           co++;
           if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)){
               b.append(str.charAt(i)).append(co);
               co = 0;
           }
        }
        return b.toString().length() < str.length() ? b.toString() : str;
    }
}

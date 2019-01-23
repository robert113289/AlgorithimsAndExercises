package com.CCI.chapter_one_arrays_and_strings;

public class URLConversion {
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

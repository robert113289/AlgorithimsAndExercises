package com.exercises;

import static com.company.Main.askUserForStr;

public class Alice{
    private static String msg = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

    public static void main(String[] args) {
        // write your code here
        System.out.println(
                Alice.search(askUserForStr(
                        "what do you want to search for")
                )
        );
    }

    public static boolean search(String str){
        return str.contains(str);
    }
}
package com.company.Amazon;

// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM

import java.util.*;

class Solution {
    List<String> retrieveMostFrequentlyUsedWords(String helpText,
                                                 List<String> wordsToExclude) {
        // WRITE YOUR CODE HERE
        Map<String, Integer> wordFreqTable = new HashMap<>();
        helpText = helpText.replaceAll("[^\\p{Alpha} ]", " ").toLowerCase();
        //fill wordFreqTable with the word and the number of times it occured in helpText
        for (String word : helpText.split("\\s+")) {

            if (!wordsToExclude.contains(word)) {
                wordFreqTable.put(word.toLowerCase(), wordFreqTable.getOrDefault(word, 0) + 1);
            }

        }
        int max = 0;
        for (Integer count : wordFreqTable.values()) {
            if (count > max) {
                max = count;
            }
        }
        List<String> words = new ArrayList<>();
        for (String word : wordFreqTable.keySet()) {
            if (wordFreqTable.get(word) >= max) {
                words.add(word);
            }
        }
        return words;
    }
// This solution has a runtime of O(n). It's main component is using a hashmap to count the number of times that a word has occurred, in a real world scenario it could be possible to preprocess this step in order to increase efficiency.
// It then finds the max number of times any word has occurred and builds a list of all the words that occurred the max number of times. Future improvements would be to modularize the code out into different methods such as building the frequency table and finding the max value in an array. I think it could also be possible to do a one liner for finding the max value.
// I was unable to get all test cases passing. I could've done better at considering edge cases because I think one of the reasons tests were failing was because I was splitting the String on one space instead of \\s+. I'm sure that with more time and or more experience with regex I could develop a more robust solution that accommodates the test cases.
}

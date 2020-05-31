package com.exercises.leetcode.strings.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ReorderDataInLogFilesTest {
    @Test
    public void reorderLogFiles() {
        ReorderDataInLogFiles underTest = new ReorderDataInLogFiles();
        String[] input = new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        String[] inputCopy = new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        String[] expected = new String[]{"let1 art can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1", "dig2 3 6"};

        String[] actual = underTest.reorderLogFiles(input);
        System.out.println("Input:    " + Arrays.toString(inputCopy));
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Actual:   " + Arrays.toString(actual));

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < input.length; i++) {
            String expectedWord = expected[i];
            String actualWord = actual[i];
            assertSame(expectedWord, actualWord);
        }
    }

    @Test
    public void reorderLogFiles2() {
        ReorderDataInLogFiles underTest = new ReorderDataInLogFiles();
        String[] input = new String[]{"1 n u", "r 527", "j 893", "6 14", "6 82"};
        String[] inputCopy = new String[]{"1 n u", "r 527", "j 893", "6 14", "6 82"};
        String[] expected = new String[]{"1 n u", "r 527", "j 893", "6 14", "6 82"};

        String[] actual = underTest.reorderLogFiles(input);
        System.out.println("Input:    " + Arrays.toString(inputCopy));
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Actual:   " + Arrays.toString(actual));

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < input.length; i++) {
            String expectedWord = expected[i];
            String actualWord = actual[i];
            assertSame(expectedWord, actualWord);
        }
    }
}
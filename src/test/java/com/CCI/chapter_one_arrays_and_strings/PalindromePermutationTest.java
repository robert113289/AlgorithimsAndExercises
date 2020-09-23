package com.CCI.chapter_one_arrays_and_strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromePermutationTest {
private PalindromePermutation underTest = new PalindromePermutation();

    @Test
    public void isPalindromePermutation() {
        assertTrue(underTest.isPalindromePermutation("Tact Coa"));
    }
}
package com.CCI.chapter_one_arrays_and_strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IsPermutationTest {

    @Test
    public void isPermutation() {
        assertEquals(true, IsPermutation.isPermutation("gene", "gene"));
        assertEquals(true, IsPermutation.isPermutation("gene", "enge"));
        assertEquals(false, IsPermutation.isPermutation("gene", "gfne"));
    }

}
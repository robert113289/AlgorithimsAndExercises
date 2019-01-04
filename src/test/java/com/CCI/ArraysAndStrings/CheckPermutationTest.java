package com.CCI.ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckPermutationTest {

    @Test
    public void isPermutation() {
        assertEquals(true, CheckPermutation.isPermutation("gene", "gene"));
        assertEquals(true, CheckPermutation.isPermutation("gene", "enge"));
        assertEquals(false, CheckPermutation.isPermutation("gene", "gfne"));
    }
}
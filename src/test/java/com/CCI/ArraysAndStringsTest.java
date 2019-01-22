package com.CCI;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraysAndStringsTest {


    @Test
    public void isPermutation() {
        assertEquals(true, ArraysAndStrings.isPermutation("gene", "gene"));
        assertEquals(true, ArraysAndStrings.isPermutation("gene", "enge"));
        assertEquals(false, ArraysAndStrings.isPermutation("gene", "gfne"));
    }

    @Test
    public void urlIfy() {
        String str = "Mr John Smith    ";
        char[] chars = str.toCharArray();

        assertEquals("Mr%20John%20Smith", ArraysAndStrings.urlIfy(chars, 13));
    }

    @Test
    public void urlIfy1() {
        String str = "Mr John Smith    ";

        assertEquals("Mr%20John%20Smith", ArraysAndStrings.urlIfy(str));

    }
}
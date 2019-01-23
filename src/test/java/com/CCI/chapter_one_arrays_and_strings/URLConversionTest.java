package com.CCI.chapter_one_arrays_and_strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class URLConversionTest {

    @Test
    public void urlIfy() {
        String str = "Mr John Smith    ";
        char[] chars = str.toCharArray();

        assertEquals("Mr%20John%20Smith", URLConversion.urlIfy(chars, 13));
    }

    @Test
    public void urlIfy1() {
        String str = "Mr John Smith    ";

        assertEquals("Mr%20John%20Smith", URLConversion.urlIfy(str));

    }
}
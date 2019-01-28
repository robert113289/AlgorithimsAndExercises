package com.CCI.chapter_one_arrays_and_strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCompressionTest {

    @Test
    public void stringCompression() {

        assertEquals("a2b1c5a3", StringCompression.stringCompression("aabcccccaaa"));

    }
}
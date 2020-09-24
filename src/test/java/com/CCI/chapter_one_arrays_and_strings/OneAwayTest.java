package com.CCI.chapter_one_arrays_and_strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OneAwayTest {
    private OneAway underTest = new OneAway();

    @Test
    public void isOneEditAway() {
        assertTrue(underTest.isOneEditAway("pale", "ple"));
        assertTrue(underTest.isOneEditAway("pales", "pale"));
        assertTrue(underTest.isOneEditAway("pale", "bale"));
        assertFalse(underTest.isOneEditAway("pale", "bake"));
    }
}
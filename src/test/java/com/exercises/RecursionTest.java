package com.exercises;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.assertEquals;

public class RecursionTest {

    @Test
    public void iterativeFactorial() {
        assertEquals(120, Recursion.recursiveFactorial(5));
        assertEquals(1, Recursion.recursiveFactorial(0));
    }

    @Test
    public void recursiveFactorial() {
        assertEquals(120, Recursion.recursiveFactorial(5));
        assertEquals(1, Recursion.recursiveFactorial(0));
    }

    @Test
    public void isPalindrome() {
        assertEquals(true, Recursion.isPalindrome("a"));
        assertEquals(true, Recursion.isPalindrome("rotor"));
        assertEquals(false, Recursion.isPalindrome("motor"));
    }

    @Test
    public void pow() {
        assertEquals( new BigDecimal(16), Recursion.pow(2,4));
        assertEquals(new BigDecimal(1), Recursion.pow(20,0));
        assertEquals(new BigDecimal(0.33).setScale(1, RoundingMode.FLOOR), Recursion.pow(3,-1));
    }
}
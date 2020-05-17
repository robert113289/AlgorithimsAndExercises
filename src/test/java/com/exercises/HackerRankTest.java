package com.exercises;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class HackerRankTest {

    @Test
    public void repeatedString() {
        assertEquals(7, HackerRank.repeatedString("aba", 10));
        assertEquals(1000000000000L, HackerRank.repeatedString("a", 1000000000000L));
    }

    @Test
    public void isBalanced() {
        assertEquals("YES", HackerRank.isBalanced("{[()]}"));
        assertEquals("NO", HackerRank.isBalanced("}][}}(]{))]"));
        assertEquals("YES", HackerRank.isBalanced("[()][{}()][](){}([{}(())([[{}]])][])[]([][])(){}{{}{[](){}}}()[]({})[{}{{}([{}][])}]"));
        assertEquals("NO", HackerRank.isBalanced("(])[{{{][)[)])(]){(}))[{(})][[{)(}){[(]})[[{}(])}({)(}[[()}{}}]{}{}}()}{({}](]{{[}}(([{]"));
        assertEquals("NO", HackerRank.isBalanced("){[]()})}}]{}[}}})}{]{](]](()][{))])(}]}))(}[}{{)}{[[}[]}(]}){"));
    }

    @Test
    public void testRunningMedian() {
        int[] arr = new int[]{6, 12, 4, 5, 3, 8, 7};
        double[] expectedResult = {12.0, 8.0, 5.0, 4.5, 5.0, 6.0};
        double[] actualResult = HackerRank.runningMedian(arr);
        System.out.println("Expected: " + Arrays.toString( expectedResult));
        System.out.println("Actual:   " + Arrays.toString(actualResult));

        assertEquals(expectedResult.length, actualResult.length);
        for(int i = 0; i < expectedResult.length; i++){
            assertEquals(expectedResult[i],actualResult[i],0.01d);
        }
    }
}
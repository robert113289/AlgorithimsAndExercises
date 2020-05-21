package com.exercises.Leetcode.Matrix;

import org.junit.Test;

import static org.junit.Assert.*;

public class RottingOrangesTest {
    RottingOranges underTest = new RottingOranges();
    @Test
    public void orangesRotting() {
        int[][] input = new int[][]{
                 {2,1,1}
                ,{1,1,0}
                ,{0,1,1}
        };
        int expectedOutput = 4;
        int resultOrangesRotting = underTest.orangesRotting(input);
        assertSame(expectedOutput, resultOrangesRotting);
    }

    @Test
    public void orangesRottingReturnsNeg1WhenNotAllOrangesCanGoRotten() {
        int[][] input = new int[][]{
                 {2,1,1}
                ,{0,1,1}
                ,{1,0,1}
        };
        int expectedOutput = -1;
        int resultOrangesRotting = underTest.orangesRotting(input);
        assertSame(expectedOutput, resultOrangesRotting);
    }
}
package com.CCI.chapter_one_arrays_and_strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZeroMatrixTest {


    @Test
    public void zeroMatrix() {
        int[][] matrix = new int[][] {
                {1,0,3,4},
                {5,10,0,15},
                {7,8,3,2}
        };
        int[][] expectedMatrix = new int[][]{
                {0,0,0,0},
                {0,0,0,0},
                {7,0,0,2}
        };
        ZeroMatrix.zeroMatrix(matrix);
        assertEquals(expectedMatrix,matrix);
    }
}
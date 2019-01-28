package com.CCI.chapter_one_arrays_and_strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixRotationTest {

    @Test
    public void matrixRotation() {
        int[][] matrix = new int[][] {
                {1,2,3,4},
                {5,1,9,3},
                {6,8,4,5},
                {9,5,4,3}
        };
        int[][] expectedMatrix = new int[][] {
                {9,6,5,1},
                {5,8,1,2},
                {4,4,9,3},
                {3,5,3,4}
        };
        MatrixRotation.rotate(matrix);
        assertEquals(1,1);
        assertEquals(expectedMatrix, matrix);
    }
}
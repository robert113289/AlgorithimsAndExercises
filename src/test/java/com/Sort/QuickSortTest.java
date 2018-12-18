package com.Sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {

    @Test
    public void sort() {
        int[] expectedArray = {7,9,10,11,12,14};
        int[] array = {12,7,14,9,10,11};
        QuickSort.sort(array);
        assertArrayEquals(expectedArray, array);

        int[] expectedArrayTwo = {2,3,6,7,9,11,12,14};
        int[] arrayTwo = {3,7,12,14,2,6,9,11};
        QuickSort.sort(arrayTwo);
        assertArrayEquals(expectedArrayTwo, arrayTwo);
    }
}
package com.Sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void mergeSort() {
        int[] expectedArray = {2,3,6,7,9,11,12,14};
        int[] array = {3,7,12,14,2,6,9,11};
        MergeSort.sort(array);

        assertArrayEquals(expectedArray, array);
    }
}
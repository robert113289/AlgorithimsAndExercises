package com.Sort;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {

    @Test
    public void sort() {
        int[] ints = {2,1,4,3};
        SelectionSort.sort(ints);
        int[] expected = {1,2,3,4};
        Assert.assertArrayEquals(expected, ints);
    }
}
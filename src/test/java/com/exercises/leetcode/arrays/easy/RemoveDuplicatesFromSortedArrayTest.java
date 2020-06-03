package com.exercises.leetcode.arrays.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class RemoveDuplicatesFromSortedArrayTest {

    RemoveDuplicatesFromSortedArray underTest = new RemoveDuplicatesFromSortedArray();

    @Test
    public void removeDuplicates() {
        int[] input = new int[]{0,0,1,1,1,2,2,3,3,4};
        int actualRemoveDuplicates = underTest.removeDuplicates(input);
        assertThat(actualRemoveDuplicates).isEqualTo(5);
    }
}
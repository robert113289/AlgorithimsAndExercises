package com.Sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void mergeSort() {
        int[] expectedArray = {2,3,6,7,9,11,12,14};
        int[] array = {3,7,12,14,2,6,9,11};
        MergeSort.mergeSort(array);
        assertArrayEquals(expectedArray, array);

        Random random = new Random();
        array = new int[51];
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(999);
        }
        expectedArray = Arrays.copyOf(array, array.length);

        System.out.println("preActual: " + Arrays.toString(array));
        System.out.println("preExpected: " + Arrays.toString(expectedArray));

        MergeSort.mergeSort(array);
        Arrays.sort(expectedArray);

        System.out.println("Actual: " + Arrays.toString(array));
        System.out.println("Expected: " + Arrays.toString(expectedArray));

        assertArrayEquals(expectedArray, array);
    }
}
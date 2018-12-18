package com.Sort;

import java.util.Arrays;

public class InsertionSort {

    private static void insert(int[] array, int rightIndex, int value ){
        int i;
        for( i = rightIndex; i >= 0 && array[i] > value; i--){
            array[i + 1] = array[i];
        }
        array[i + 1] = value;
    }

    public static void sort(int[] array){
        for(int i = 0; i + 1 < array.length; i++){
            insert(array, i, array[i + 1]);
            System.out.println(Arrays.toString(array));
        }

    }
}

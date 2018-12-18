package com.Sort;

import java.util.Arrays;

public class SelectionSort {


    private static void swap(int[] array,int firstIndex, int secondIndex ){
        int firstIndexStore = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = firstIndexStore;
    }

    private static int indexOfMinimum(int[] array, int startIndex){
        int minValue = array[startIndex];
        int minIndex = startIndex;
        for(int i = startIndex; i < array.length; i++){
            if (minValue > array[i]) {
                minIndex = i;
                minValue = array[minIndex];
            }
        }
        return minIndex;
    }

    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            swap(array,i,indexOfMinimum(array,i));
        }
        System.out.println(Arrays.toString(array));
    }
}

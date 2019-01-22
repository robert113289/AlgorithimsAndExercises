package com.Sort;


import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] arr){

        mergeSort(arr, 0, arr.length - 1 );
    }

    private static void mergeSort(int[] arr, int p, int r) {
        if(p < r){
            int q = (p + r) / 2;
            Math.floor(q);
            mergeSort(arr, p, q ); //bottom half
            mergeSort(arr, q + 1, r); //top half
            merge(arr, p , q, r);
        }
    }

    private static void merge(int[] arr, int p, int q, int r) {
        int[] lower = Arrays.copyOfRange(arr, p, q + 1); // q + 1 because copy of range is not inclusive
        int[] upper = Arrays.copyOfRange(arr, q + 1, r + 1);
        int k = p;
        int i = 0;
        int j = 0;

        while(i < lower.length && j < upper.length){
            if(lower[i] < upper[j]){
                arr[k] = lower[i];
                i++;
            } else {
              arr[k] = upper[j];
              j++;
            }
            k++;
        }
        while(i < lower.length ){
            arr[k] = lower[i];
            i++;
            k++;
        }
        while(j < lower.length ){
            arr[k] = upper[j];
            j++;
            k++;
        }
    }


}

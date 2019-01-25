package com.Sort;


import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] array){
        mergeSort(array,0, array.length - 1);
    }

    private static void merge(int[] array, int p, int q, int r){
        int[] lowerHalf = new int[(q - p) + 1];
        int[] higherHalf = new int[r - q];

        int k = p;
        int i;
        int j;

        for( i = 0; k <= q; i++,k++){
            lowerHalf[i] = array[k];
        }
        for(j = 0; k <= r; j++,k++){
            higherHalf[j] = array[k];
        }
        System.out.println("merging higherHalf " + Arrays.toString(higherHalf));
        System.out.println("into");
        System.out.println("lowerHalf " + Arrays.toString(lowerHalf));

        k = p;
        i = 0;
        j = 0;

        while(i < lowerHalf.length && j < higherHalf.length){
            if(lowerHalf[i] < higherHalf[j]){
                array[k] = lowerHalf[i];
                i++;
                k++;
            } else {
              array[k] = higherHalf[j];
              j++;
              k++;
            }
        }
        while(i < lowerHalf.length){
            array[k] = lowerHalf[i];
            i++;
            k++;
        }
        while(j < higherHalf.length){
            array[k] = higherHalf[j];
            j++;
            k++;
        }
    }

    private static void mergeSort(int[] array, int p, int r){
        if(p < r){
            System.out.println();
            System.out.println("Sorting indexes " + p + " -> " + r + " in arr: " + Arrays.toString(array));
            System.out.println();
            int q = (p + r) / 2;
            Math.floor(q);
            mergeSort(array, p, q);
            mergeSort(array, q + 1, r);
            merge(array, p, q, r);
        }

    }
}

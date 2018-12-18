package com.Sort;

public class QuickSort {
    public static void sort(int[] array){
        quickSort(array,0, array.length - 1 );
    }
    private static void quickSort(int[] array, int p, int r){
        if(r - p > 0){
            int q = partition(array, p, r);
            quickSort(array, p, q - 1);
            quickSort(array, q + 1, r);
        }
    }

    private static int partition(int[] array, int p, int r){
        int q = p;
        int j;
        for(j = p; j < r; j++){
            if(array[j] <= array[r]) {
                int temp = array[j];
                array[j] = array[q];
                array[q] = temp;
                q++;
            }
        }
        int temp = array[r];
        array[r] = array[q];
        array[q] = temp;

        return q;
    }

}

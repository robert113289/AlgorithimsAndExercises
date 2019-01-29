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

class QuickSortTwo {
    //https://www.youtube.com/watch?v=SLauY6PpjW4&index=8&list=PLsn6T340evTTsIu-ziXa2-e58idI3kkl1&frags=wn

    public static void sort(int[] array){
        quickSort(array,0, array.length - 1 );
    }

    private static void quickSort(int[] array, int left, int right) {
        if(left >= right){
            return;
        }
        int pivot = array[(left + right) / 2];
        int index = partition(array,left,right,pivot);
        quickSort(array, left, index - 1);
        quickSort(array, index, right);
    }

    private static int partition(int[] array, int left, int right, int pivot) {
        while(left <= right){
            while(array[left] < pivot){
                left++;
            }
            while(array[right]> pivot){
                right--;
            }
            if(left <= right){
                swap(array,left,right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}

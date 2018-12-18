package com.Search;

public class Binary {

//    public static boolean searchArray(int[] arr, int num){
//        int middleOfArr = 0;
//        if(arr.length % 2 == 0){
//            middleOfArr = arr[arr.length / 2];
//        }
//        if(num == middleOfArr){
//            return true;
//        }
//        if(num < middleOfArr){
//            return searchArray(Arrays.copyOfRange(arr,0, arr.length / 2), num);
//        }
//        if(num > middleOfArr){
//            return searchArray(Arrays.copyOfRange(arr,arr.length / 2, arr.length - 1), num);
//        }
//        return false;
//    }
//
//    public static boolean contains(int num){
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        return searchArray(arr, num);
//    }

    public static boolean checkPrime(int num) {
        int[] primeNums = new int[]{2,3,5,7,11,13,17,19,23,19,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
        return searchArray(primeNums, 0, primeNums.length - 1, num );
    }

    public static boolean searchArray(int[] arr, int min, int max, int num) {
        int mid = (min + max) / 2;
        Math.floor(mid);

        if(max < min){
            return false;
        }
        if(arr[mid] == num){
            System.out.println("found number as prime");
            return true;
        }

        if(arr[mid] < num){
            min =  mid + 1;
            System.out.println("Guess: " + mid  + " Min: " + min + " Max: " + max);
            return searchArray(arr, min, max,num);
        }
        else if(arr[mid] > num){
            max = mid - 1;
            System.out.println("Guess: " + mid + " Min: " + min + " Max: " + max);
            return searchArray(arr, min, max, num);
        }

        return false;
    }
}
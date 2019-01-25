package com.Search;

public class Binary {



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


    public static boolean binarySearch(int[] arr, int x){
        int m = arr.length / 2;
        Math.floor(m);
        int l = 0;
        int r = arr.length - 1;
        if(arr.length == 0){
            return false;
        }
        return helperSearch(arr, x, l, r);
    }

    private static boolean helperSearch(int[] arr,int x, int l, int r ){
        //base case
        int m = (l + r) / 2;
        Math.floor(m);
        if(arr[m] == x){
            return true;

        }else if (l >= r){

            return false;

        }else if (x > arr[m]){ //the element at m is greater than x so x must in the top half of the arr

            return helperSearch(arr, x, m + 1, r);

        }else { // the element may be in the bottom half

            return helperSearch(arr, x, l, m - 1);

        }

    }

    public static boolean iterativeSearch(int[] arr, int num){
        int max = arr.length - 1;
        int min = 0;
        int mid;
        while(min <= max){
            mid = min + max / 2;
            Math.floor(mid);
            if(arr[mid] == num){
                return true;
            }
            else if(arr[mid] < num){
                min = mid + 1;
            }
            else{
                max = mid - 1;
            }
        }
         return false;
    }
}
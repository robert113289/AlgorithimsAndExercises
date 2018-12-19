package com.exercises;

import java.util.Arrays;

public class BinaryNumbers {
    public static void main(String[] args) {
        System.out.println(countConsecutiveOnes(6));
    }

    //13 is 1101
    public static int[] getAsBinaryArray(int num) {
        int[] binaryNumsArray = new int[9]; //8 bits per byte

        int numDivisor = num;
        int index = 8;
        while (numDivisor > 0) {
            binaryNumsArray[index] = numDivisor % 2;
            numDivisor /= 2;
            index--;
        }
        System.out.println(Arrays.toString(binaryNumsArray));
        return binaryNumsArray;
    }

    public static int countConsecutiveOnes(int n) {

        int counter = 0, max =0;
        while (n > 0) {
            int rem = n%2;
            if (rem==1) counter++;
            else counter=0;
            max = Math.max(counter, max);
            n/=2;
        }
        return max;
    }
}

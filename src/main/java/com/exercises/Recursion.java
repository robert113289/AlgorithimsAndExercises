package com.exercises;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Recursion {
    //5! = 5 * 4!
    // 5! = 5*4*3*2*1

    public static int iterativeFactorial(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
    public static int summation(int n){
        //base case: we are at the end
        if(n <= 0){
            System.out.println("We're at the end");
            return 0;
        }
        //recursive case: keep going
        else{
            System.out.println("keep going:" + n);
            System.out.println( n + " summation("+ n +"-1)" + n + summation(n-1));
            return n + summation(n - 1);
        }
    }

    public static int recursiveFactorial(int n){
        //base case: what you wouldn't have to compute; ex: 0! = 1
        if(n <= 0){
            return 1; //multiplicative identity
        }
        //recursive case
        else {
            return n * recursiveFactorial(n - 1);
        }
    }

    public static boolean isPalindrome(String word){
        //base case
        if(word.length() <= 1){
            return true;
        }
        //base case 2
        if(!word.substring(0,1).equalsIgnoreCase(word.substring(word.length() - 1))) {
            return false;
        }
        //recursive case
        else {
            return isPalindrome(word.substring(1, word.length() - 1));
        }
    }

    // 2^4 = 2 * 2^3
    // 2^4 = 2 * 2 * 2 * 2
    public static BigDecimal pow(int num, int exp){
        //base case
        if(exp == 0){
            return new BigDecimal(1); // x^0 = 1
        }
        // 2^4 = 2^2 * 2^2
        if(exp % 2 == 0){
            BigDecimal y = pow(num, exp / 2);
            return y.multiply(y);
        }
        if(exp < 0){
            return new BigDecimal(1).divide(pow(num, -exp),1,RoundingMode.HALF_UP);
        }
        //recursive case
        else {
            return new BigDecimal(num).multiply(pow(num, exp - 1));
        }
    }


}

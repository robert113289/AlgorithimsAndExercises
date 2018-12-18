package com.company;

import java.util.Scanner;

public class TempConv{
    public static void main(String[] args){
        double fahrenheit;
        double celsius;
        Scanner in = new Scanner(System.in);

        int[] someInts = new int[10];
        int[] someOtherInts = { 1, 1, 2,3,5,8};

        System.out.println("Enter the temp in F:");
        fahrenheit = in.nextDouble();

        celsius = (fahrenheit - 32) * 5.0/9.0;

        System.out.println("The temperature in C is: " + celsius);
    }

}

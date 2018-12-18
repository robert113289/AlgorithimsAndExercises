package com.company;

import com.exercises.Shape;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here=
        int[] array = {1,3,6,48,9,2,7,5,6};
        //InsertionSort.sort(array);

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        String str = "hellow";

        //printStairs(4);
        //StringBuffer str = new StringBuffer(7).append("####",0,6);
        int[] grades = {73,67,38,33};
        System.out.println(Arrays.toString(gradingStudents(grades)));
}

    static int countwrongcharacters(String string){
        String sos = "SOS";
        int count = 0;
        for(int i = 0; i <= 3; i++){
            if(string.charAt(i) != (sos.charAt(i))){
                count++;
            }
        }
        return count;
    }

    static int[] gradingStudents(int[] grades) {
        for(int i = 0; i < grades.length; i++){
            if(isRoundable(grades[i])){
                grades[i] = round(grades[i]);
            }
        }
        return grades;
    }
    private static int round(int grade){
        while(grade % 5 != 0){
            grade++;
        }
        return grade;
    }
    private static boolean isRoundable(int grade) {
        if (grade >= 38 && grade % 5 <= 2) {
            return true;
        }
        return false;
    }
    public static int camelCase(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                count += 1;
            }
        }
        return count + 1;
    }

    public static String repeat(String str, int times){
        return new String( new char[times]).replace("\0", str );
    }

    public static void printStairs(int n){
        for(int i = 1; i <= n; i++ ){
            StringBuffer row = new StringBuffer();
            row.append(repeat(" ",n - i));
            row.append(repeat("#", i));
            System.out.println(row);
        }

    }

    public static void printStairCase(int n){
        for(int i = n -1; i >= 0; i--){
            printLine(i, n - i );
        }

    }
    public static void printLine(int numSpaces, int numHash){

        StringBuilder lineStr = new StringBuilder();
        for( int i = 1; i <=  numSpaces + numHash; i++){
            if( i <= numSpaces){
                lineStr.append(" ");
            } else{
                lineStr.append("#");
            }
        }

        System.out.println(lineStr);
    }





    public static void greetUser(){
        String name = askUserForStr("Whats your name");
        System.out.println(name);
    }
    public static String askUserForStr(String question){
        System.out.println(question + ": ");
        String answer = in.next();
        return answer;
    }
    public static double askUserForDouble(String question){
        System.out.println(question + ": ");
        double answer = in.nextDouble();
        return answer;
    }
    public static double calculateArea(){
        double length = askUserForDouble("Enter Length");
        double width = askUserForDouble("Enter width");
        double height = askUserForDouble("height");
        Shape rectangle = new Shape(length, width, height);
        return rectangle.getArea();
    }

    static int sockMerchant(int n, int[] ar) {
        //navigate through each sock in arr looking for pair, if pair is found zero out             values
        //store values in hashmap with the key as the value and value as number of pairs
        //navigate through list of socks counting how many of a value you see and then
        // a pair is floor /2
        //sort the list and then count how many pairs
        //binary search and then remove the values
        //compare numSockTypes to total
        int numPairs = 0;
        HashMap<Integer, Integer> sockTypes = new HashMap<Integer, Integer>();
        for(int sock : ar){
            if(sockTypes.containsKey(sock)){
                sockTypes.put(sock, sockTypes.get(sock) + 1);
            }else{
                sockTypes.put(sock, 1);

            }
        }
        for(int numSocksPerType : sockTypes.values()){
            numPairs += Math.floor(numSocksPerType / 2);
        }
        return numPairs;


    }


}

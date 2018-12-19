package com.exercises;

public class Matrix {
    //private static int[][] arr = {{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}};
    //private static int[][] arr = {{-1,-1,0,-9,-2,-2},{-2,-1,-6,-8,-2,-5},{-1,-1,-1,-2,-3,-4},{-1,-9,-2,-4,-4,-5},{-7,-3,-3,-2,-9,-9},{-1,-3,-1,-2,-4,-5}};
    private static int[][] arr = {{-1,1,-1,0,0,0},{0,-1,0,0,0,0},{-1,-1,-1,0,0,0},{0,-9,2,-4,-4,0},{-7,0,0,-2,0,0},{0,0,-1,-2,-4,0}};
    public static void main(String[] args) {
        printMatrix();
        System.out.println();
        System.out.println("HourGlass's: ");
        printHourGlass();
        System.out.println("Max Sum: " + getMaxSum(arr));
    }

    public static int getMaxSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = 0;
                for (int x = j; x <= j + 2; x++) {
                    sum += arr[i][x];
                    if (x == j + 1) {
                        sum += arr[i + 1][j + 1];
                    }
                    sum += arr[i + 2][x];
                }
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }


    public static void printMatrix(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printHourGlass(){
        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <=3; j++){
                System.out.println("HourGlass: " + (i + j + 1));
                int sum = 0;
                for(int t = j; t <=  j + 2; t++){
                    System.out.print(" " + arr[i][t]); //print top of hourglass
                    //System.out.print("T");
                    sum += arr[i][t]; // sum top
                    if(t == j + 1){
                        sum += arr[i + 1][j + 1]; // sum middle
                    }
                    sum += arr[i + 2][t]; //sum bottom

                }
                System.out.println();
                System.out.println("   " + arr[i + 1][j + 1] + "  "); //print middle of hourglass
                //System.out.println(" M ");
                for(int b = j; b <= j + 2; b++){
                    System.out.print(" " + arr[i + 2][b]); // print bottom of hourglass
                    //System.out.print("B");
                }
                System.out.println();
                System.out.println();
                System.out.println("Sum: " + sum);
                System.out.println();
                System.out.println();
            }
        }
    }
}

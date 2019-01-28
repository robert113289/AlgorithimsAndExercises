package com.CCI.chapter_one_arrays_and_strings;

import java.util.HashSet;
import java.util.Set;

public class ZeroMatrix {
    //write an algorithm such that if an element in an M x N matrix is 0, its entire row and column ar set to 0
    public static void zeroMatrix(int[][] matrix){
        Set<Integer> rows = new HashSet<Integer>();
        Set<Integer> columns = new HashSet<Integer>();
        //find rows and columns with a 0 in them
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        //zero out the rows and columns with 0's in them.
        if(!rows.isEmpty()){
            for(int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (rows.contains(i) || columns.contains(j)) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
}

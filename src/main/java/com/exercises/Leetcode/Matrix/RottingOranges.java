package com.exercises.Leetcode.Matrix;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/rotting-oranges/
public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int numAllOranges = 0;
        int numRottenOranges = 0;
        int mntsPassed = 0;
        Queue<int[]> rottenOranges = new LinkedList();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                int orangeBox = grid[i][j];
                if(orangeBox > 0){
                    numAllOranges++;
                }
                if(orangeBox == 2){
                    numRottenOranges++;
                    rottenOranges.add(new int[]{i,j});
                }
            }
        }
        if (numAllOranges == 0) {
            return 0;
        }
        int[][] dirs = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        while(!rottenOranges.isEmpty()){
            if(numAllOranges == numRottenOranges){
                return mntsPassed;
            }
            int size = rottenOranges.size();
            for(int i = 0; i < size; i++){
                int[] curr = rottenOranges.poll();
                for(int[] dir : dirs){
                    int ni = curr[0] + dir[0];
                    int nj = curr[1] + dir[1];
                    if(ni >= 0 && ni < grid.length && nj >=0 && nj < grid[0].length){
                        int orangeBox = grid[ni][nj];
                        if(orangeBox == 1) {
                            grid[ni][nj] = 2;
                            numRottenOranges++;
                            rottenOranges.add(new int[]{ni,nj});
                        }
                    }
                }
            }
            mntsPassed++;
        }
        return -1;
    }
}

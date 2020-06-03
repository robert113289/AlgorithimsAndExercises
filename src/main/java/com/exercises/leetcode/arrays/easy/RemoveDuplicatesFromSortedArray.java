package com.exercises.leetcode.arrays.easy;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int distinctNums = 1;
        int idx = 1;
        int num = nums[0];
        while (idx < nums.length) {
            for (int i = idx; i < nums.length; i++) {
                if (nums[i] > num) {
                    distinctNums++;
                    int temp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = temp;
                    num = nums[idx];
                    break;
                }
            }
            idx++;
        }
        return distinctNums;
    }
}

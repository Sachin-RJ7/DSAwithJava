package com.Sachin.Sorting.Easy;

import java.util.Arrays;

// Question Link:
// https://leetcode.com/problems/sort-array-by-parity/description/

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] arr = {0,1,2};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int count = 0;

        if (nums.length == 0){
            return null;
        }

        while (i < nums.length){
            if (nums[i] % 2 == 0){
                swap(nums, count, i );
                count++;
            }
            i++;
        }
        return nums;
    }

    public static void swap(int[] arr, int pos, int index){
        int temp = arr[index];
        arr[index] = arr[pos];
        arr[pos] = temp;
    }

}

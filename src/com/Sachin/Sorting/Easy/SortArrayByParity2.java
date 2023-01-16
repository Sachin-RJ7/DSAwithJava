package com.Sachin.Sorting.Easy;

import java.util.Arrays;

// Question link:
// https://leetcode.com/problems/sort-array-by-parity-ii/description/

public class SortArrayByParity2 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 6, 1, 3};
        System.out.println(Arrays.toString(sortArrayByParityII(arr)));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int i = 0; // Initializing the even values from 0;
        int j = 1; // initializing the odd values from 1.
        int n = nums.length;

        // Here idea is that we will find even values at even indexes such 0, 2, 4, 6....,
        // And odd values at odd indexes such as 1, 3, 5,...
        // So if a even or odd values are already present on its right place then we will increase the value of i and j
        // by 2 and if the values are not its right place then, we will swap it.

        while (i < n && j < n) {
            while (i < n && nums[i] % 2 == 0) {
                i += 2;
            }
            while (j < n && nums[j] % 2 == 1) {
                j += 2;
            }
            if (i < n && j < n) {
                swap(nums, i, j);
            }
        }
        return nums;
    }
    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

}

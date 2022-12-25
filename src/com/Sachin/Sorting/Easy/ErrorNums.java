package com.Sachin.Sorting.Easy;

// Question link:
// https://leetcode.com/problems/set-mismatch/


import java.util.Arrays;

public class ErrorNums {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length){
            // firstly we will check, the item is placed in its right place or not
            if (nums[i] != i+1){
                // if item is not placed its right position, then we will find its correct index
                int correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex]){ // if the item is not in its right place, then swap it.
                    swap(nums, i, correctIndex);
                }
                else {  // if already item is placed in its right place, it means we have found our answer.
                    i++;
                }
            }
            // if item is placed at right index, then we will check for next item
            else {
                i++;
            }
        }

        // find dublicate and missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1){
                return new int[] {nums[index], index + 1};
            }
        }
        return new int[] {-1, -1};
    }

    // swapping function
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

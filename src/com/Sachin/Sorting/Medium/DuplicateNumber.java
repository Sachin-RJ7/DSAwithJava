package com.Sachin.Sorting.Medium;

// question link:
// https://leetcode.com/problems/find-the-duplicate-number/description/

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,1};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums){
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
                    return nums[i];
                }
            }
            // if item is placed at right index, then we will check for next item
            else {
                i++;
            }
        }
        return -1;

    }

    // swapping function
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

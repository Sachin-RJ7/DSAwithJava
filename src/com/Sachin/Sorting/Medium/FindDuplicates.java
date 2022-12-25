package com.Sachin.Sorting.Medium;

import java.util.ArrayList;
import java.util.List;

// Question link:
// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(arr));
    }

    public static List<Integer> findDuplicates(int[] nums){
        List<Integer> ans = new ArrayList<>();

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

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }

    // swapping function
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

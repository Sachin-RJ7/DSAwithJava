package com.Sachin.BinarySearch.Easy;

import java.util.Arrays;

// Question link:
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
// Input: arr = [5,7,7,8,8,10], target = 8
// Output: [3,4]

// Example 2:
// Input: arr = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]

// Example 3:
// Input: arr = [], target = 0
// Output: [-1,-1]

public class SearchRange {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(findRange(arr, target)));
    }

    public static int[] findRange(int[] arr, int target) {
        // Creating a new array ans and initializing the default values.
        // If the desired value is not got, then these value will be return
        int[] ans = { -1 , -1};

        ans[0] = binarySearch(arr, target, true); // this condition is for searching the first value of the range

        // if the the first value of the range is not found, then we will not check for the second value
        if(ans[0] != -1){
            ans[1] = binarySearch(arr, target, false); // this condition is for searching the second value of the range
        };

        // if the first and last position of the target value is found,then it will return the positions,
         // otherwise -1, -1 will return according to the condition.
         return ans;

    }

    private static int binarySearch(int[] arr, int target, boolean firstIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        // condition will run till it is true
        while(start <= end) {
            // finding the middle index of the array
            int mid = start + (end - start) / 2;

            // if the target value is less than the middle value, then we have to reduce the value of end
            if(target < arr[mid]) {
                end = mid - 1;
            }
            // if the target value is less than the middle value, then we have to reduce the value of end
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else {
                ans = mid; // if the value is at middle index,

                // If we are here, it means we have to check for other possibilities.
                // there can be multiple duplicate values we have to find the index of first and last position of the target.
                // this condition is for checking whether the another same value is present before or after the current value;
                if(firstIndex) {
                    // if condition is true, then we have to check on the left side to find that there is same value is
                    // present or not
                    end = mid - 1;
                }
                // if condition is true, then we have to check on the right side to find that there is same value is
                // present or not
                else {
                    start = mid + 1;
                }
            }
        }
        // if the target is found, then it will return the index of the value,
        // otherwise it will return -1;
        return ans;
    }

}

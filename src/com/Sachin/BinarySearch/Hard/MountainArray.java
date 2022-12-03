package com.Sachin.BinarySearch.Hard;

// Question Link:
// https://leetcode.com/problems/find-in-mountain-array/

// Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target.
// If such an index does not exist, return -1.
// You cannot access the mountain array directly. You may only access the array using a MountainArray interface:

// Example 1:
// Input: array = [1,2,3,4,5,3,1], target = 3
// Output: 2

// Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.

// Example 2:
// Input: array = [0,1,2,4,2,1], target = 3
// Output: -1

// Explanation: 3 does not exist in the array, so we return -1.


public class MountainArray {
    public static void main(String[] args) {
        int[] arr = { 22, 33, 44, 55, 66,55,44,33,11};
        int target = 11;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        int peak = peakInMountainArray(arr);
        int firstTry = orderAgnosticsBS( arr, target, 0, peak);

        if(firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticsBS(arr, target, peak + 1, arr.length-1);
    }

    static int peakInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + ( end - start ) / 2;

            if ( arr[mid] > arr[mid + 1]) {
                // we are in decreasing part of array
                end = mid;
            } else {
                // we are in acending part of array
                start = mid + 1;
            }
        }
        // at last, start == end..
        return start; // or return end can be written

    }

    static int orderAgnosticsBS(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else
            {
                if (target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}

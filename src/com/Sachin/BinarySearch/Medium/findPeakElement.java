package com.Sachin.BinarySearch.Medium;

//  Question Link::
//  https://leetcode.com/problems/find-peak-element/

//  About Question :-
//  A peak element is an element that is strictly greater than its neighbors.
//  Given a 0-indexed integer array nums, find a peak element, and return its index.
//  If the array contains multiple peaks, return the index to any of the peaks.

//  Example 1:
//  Input: nums = [1,2,3,1]
//  Output: 2
//  Explanation: 3 is a peak element and your function should return the index number 2.

//  Example 2:
//  Input: nums = [1,2,1,3,5,6,4]
//  Output: 5
//  Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.

public class findPeakElement {
    public static void main(String[] args) {
        int[] arr = {6, 7,1, 9, 6, 5, 4, 3, 9, 1,0};
        System.out.println(findPeak(arr));
        System.out.println(peakElement(arr));
    }


    // Ist Approack
    public static int peakElement(int[] arr) {
        if (arr.length == 1) {
            return 0;
        }

        int n = arr.length;

        if(arr[0] > arr[1]) {
            return 0;
        }

        if (arr[n-1] > arr[n-2]) {
            return n - 1;
        }

        int start = 1;
        int end = arr.length-2;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if(arr[mid] > arr[mid + 1])
                end = mid;
            else {
                start = mid + 1;
            }
        }
        return -1;

    }

    // Simple Approach
    public static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] > nums[mid + 1]) {
                end = mid;          // we are in dec part of the array
            }
            else {
                start = mid + 1;    // we are in inc part of array
            }
        }
        return start;
    }
}

package com.Sachin.BinarySearch.Hard;

//  https://leetcode.com/problems/split-array-largest-sum/

//  About Question
//  Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
//  Return the minimized largest sum of the split.
//  A subarray is a contiguous part of the array.

//  Example 1:
//  Input: nums = [7,2,5,10,8], k = 2
//  Output: 18
//  Explanation: There are four ways to split nums into two subarrays.
//  The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.

public class splitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(arr, m));
    }

    public static int splitArray(int[] arr, int m) {
        int max = 0;
        int sum = 0;

        for (int val : arr) {
            sum += val;
            max = Math.max(val, max);
        }

        if (m == arr.length) {
            return max;
        }

        int start = max;
        int end = sum;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(arr, mid, m)) {
                ans = mid;
                end = mid - 1;
            }
            else  {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] arr, int mid, int M) {
        int subArray = 1;
        int sum = 0;

        for (int j : arr) {
            sum += j;
            if (sum > mid) {
                subArray += 1;
                sum = j;
            }

        }
        return subArray <= M;
    }

}

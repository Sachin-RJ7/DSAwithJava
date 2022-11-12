package com.Sachin.BinarySearch.Medium;

import java.util.Arrays;

//  https://leetcode.com/problems/frequency-of-the-most-frequent-element/

//  About Question:
//  The frequency of an element is the number of times it occurs in an array.
//  You are given an integer array nums and an integer k. In one operation, you can choose an index of nums and increment
//  the element at that index by 1.
//  Return the maximum possible frequency of an element after performing at most k operations.

//  Example 1:
//  Input: nums = [1,2,4], k = 5
//  Output: 3
//  Explanation: Increment the first element three times and the second element two times to make nums = [4,4,4].
//  4 has a frequency of 3.

//  Example 2:
//  Input: nums = [1,4,8,13], k = 5
//  Output: 2
//  Explanation: There are multiple optimal solutions:
//  - Increment the first element three times to make nums = [4,4,8,13]. 4 has a frequency of 2.
//  - Increment the second element four times to make nums = [1,8,8,13]. 8 has a frequency of 2.
//  - Increment the third element five times to make nums = [1,4,13,13]. 13 has a frequency of 2.

public class maxFrequency {
    public static void main(String[] args) {
        int[] arr = {1,4,8,13};
        int k = 5;
        System.out.println(findMaxFrequency(arr, k));
    }

    public static int findMaxFrequency(int[] arr, int k) {
        long sum = 0;
        int i = 0;
        int res = 1;

        Arrays.sort(arr);
        for(int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if(sum + k < (long)arr[j] * (j - i + 1)) {
                sum -= arr[i];
                i += 1;
            }
            res = Math.max(res, j-i+1);
        }
        return res;
    }

}

package com.Sachin.BinarySearch.Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//  https://leetcode.com/problems/find-the-duplicate-number/

// About question
// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
// There is only one repeated number in nums, return this repeated number.
// You must solve the problem without modifying the array nums and uses only constant extra space.

// Example 1:
// Input: nums = [1,3,4,2,2]
// Output: 2

// Example 2:
// Input: nums = [3,1,3,4,2]
// Output: 3

public class findDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {8,1,1,9,5,4,2,7,3,6};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        int len = nums.length;
//
//        for (int i = 0; i < len; i++) {
//            if (!set.add(nums[i])) {
//                return nums[i];
//            }
//        }
//        return len;


        int len = nums.length;
        int low = 1;
        int high = len - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int cnt = 0;
            for (int i = 0; i < len; i++) {
                if (nums[i] <= mid) {
                    cnt++;
                }
            }

            if (cnt <= mid) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;



    }

}

package com.Sachin.BinarySearch.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// About Question
// https://leetcode.com/problems/4sum/submissions/

// Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
// 0 <= a, b, c, d < n
// a, b, c, and d are distinct.
// nums[a] + nums[b] + nums[c] + nums[d] == target
// You may return the answer in any order.

// Example 1:
// Input: nums = [1,0,-1,0,-2,2], target = 0
// Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

// Example 2:
// Input: nums = [2,2,2,2,2], target = 8
// Output: [[2,2,2,2]]


public class FourSum {
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(fourSum(arr, target));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-3; i++) {
            for (int j = i + 1; j < nums.length-2; j++) {

                long target2 = (long) target - ((long) nums[i] + (long) nums[j]);
                int left = j + 1, right = n - 1;

                while (left < right) {
                    int twoSum = nums[left] + nums[right];

                    if (twoSum < target2)
                        left++;
                    else if (twoSum > target2)
                        right--;
                    else {
                        List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
                        ans.add(quad);

                        while (left < right && nums[left] == quad.get(2))
                            left++;
                        while (left < right && nums[right] == quad.get(3))
                            right--;
                    }
                }

                while (j + 1 < n && nums[j] == nums[j + 1])
                    j++;
            }

            while (i + 1 < n && nums[i] == nums[i + 1])
                i++;
        }

        return ans;
    }
}

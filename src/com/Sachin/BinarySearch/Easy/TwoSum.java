package com.Sachin.BinarySearch.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// About Question
// https://leetcode.com/problems/two-sum/

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]

public class TwoSum {

    // Brute force code
    public static int[] twoSum(int nums[], int target) {
        int[] ans = new int[2];
        if(nums.length < 2){
            return ans;
        }

        for(int i = 0; i < nums.length-1; i++) {
            int j = i + 1;
            while(j < nums.length) {
                if(nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
                j++;
            }

        }
        return ans;
    }


    // Optimised Code
    public static int[] twoSumPair(int nums[], int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // get the complement using the target value
            int complement = target - nums[i];

            // search in the hashmap for complement, if found, we got our answer
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            //if not found, put the element in hashmap for subsequent searches
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }


    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(arr, target)));
        System.out.println(Arrays.toString(twoSumPair(arr, target)));
    }
}

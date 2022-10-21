package com.Sachin.BinarySearch.Medium;

import java.util.*;

//  https://leetcode.com/problems/3sum/

//  Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//  Notice that the solution set must not contain duplicate triplets.

//  Example 1:
//  Input: nums = [-1,0,1,2,-1,-4]
//  Output: [[-1,-1,2],[-1,0,1]]

//  Explanation:
//  nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//  nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//  nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//  The distinct triplets are [-1,0,1] and [-1,-1,2].
//  Notice that the order of the output and the order of the triplets does not matter.

public class ThreeSumEqualToZero{
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] arr) {
        Set<List<Integer>> res = new HashSet<>();

        if (arr.length == 0) {
            return new ArrayList<>(res);
        }

        Arrays.sort(arr);
        for (int i = 0; i < arr.length-2; i++) {
            int j = i+1;
            int k = arr.length - 1;

            while (j<k) {
                int sum = arr[j] + arr[k];
                if (sum == -arr[i]) {
                    res.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;
                }
                else if (sum > -arr[i]) {
                    k--;
                } else if (sum < -arr[i]) {
                    j++;
                }
            }
        }
        return new ArrayList<>(res);
    }
}

package com.Sachin.BinarySearch.Medium;

//  https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

//  Given the sorted rotated array nums of unique elements, return the minimum element of this array.
//  You must write an algorithm that runs in O(log n) time.

//  Example 1:
//  Input: nums = [3,4,5,1,2]
//  Output: 1
//  Explanation: The original array was [1,2,3,4,5] rotated 3 times.

//  Example 2:
//  Input: nums = [4,5,6,7,0,1,2]
//  Output: 0
//  Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.

public class Minimum {
    public static void main(String[] args) {
//        int[] arr = {4,5,6,7,1,2};
        int[] arr = {11,13,15,17};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length -1;

        if(nums[start] > nums[end]){
            while(start <= end) {
                int mid = start + (end - start) / 2;

                if(end > mid && nums[mid] > nums[mid + 1])
                    return nums[mid + 1];

                if(mid > start && nums[mid] < nums[mid - 1])
                    return nums[mid];

                if(nums[start] >= nums[mid])
                    end = mid;

                if(nums[start] < nums[mid])
                    start = mid + 1;
            }
        }
        return nums[0];
    }
}

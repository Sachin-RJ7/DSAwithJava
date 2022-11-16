package com.Sachin.BinarySearch.Hard;


// Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.
//You must decrease the overall operation steps as much as possible.

//Example 1:
//Input: nums = [1,3,5]
//Output: 1

//Example 2:
//Input: nums = [2,2,2,0,1]
//Output: 0

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {2,2,2,0,1};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {
        int lo = 0, hi = nums.length - 1;

        if (nums[lo] < nums[hi]) return nums[lo];

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] > nums[hi]) {
                lo = mid + 1;
            } else if (nums[mid] < nums[hi]) {
                hi = mid;
            } else {
                hi--;
            }
        }

        return nums[hi];
    }

}

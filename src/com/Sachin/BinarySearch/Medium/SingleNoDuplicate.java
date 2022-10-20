package com.Sachin.BinarySearch.Medium;


//   https://leetcode.com/problems/single-element-in-a-sorted-array/

//  You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
//  Return the single element that appears only once.
//  Your solution must run in O(log n) time and O(1) space.

//  Example 1:
//  Input: nums = [1,1,2,3,3,4,4,8,8]
//  Output: 2

//  Example 2:
//  Input: nums = [3,3,7,7,10,11,11]
//  Output: 10

public class SingleNoDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(noDuplicate(arr));
    }

    public static int noDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start)/2;

            if(mid%2 == 0 && arr[mid] == arr[mid+1] || mid%2 == 1 && arr[mid] == arr[mid-1]) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return arr[start];
    }

}

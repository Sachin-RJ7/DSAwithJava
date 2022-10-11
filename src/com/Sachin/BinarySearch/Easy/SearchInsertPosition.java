package com.Sachin.BinarySearch.Easy;

//        https://leetcode.com/problems/search-insert-position/

//  About Question:-
//  Given a sorted array of distinct integers and a target value, return the index if the target is found.
//  If not, return the index where it would be if it were inserted in order.
//  You must write an algorithm with O(log n) runtime complexity.

//  Example 1:
//   Input: nums = [1,3,5,6], target = 5
//   Output: 2

//  Example 2:
//   Input: nums = [1,3,5,6], target = 7
//   Output: 4

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(arr, target));
    }

    public static int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target == arr[mid]) {
                return mid;
            }

            if(target > arr[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start ;  // end + 1;
    }
}

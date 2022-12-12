package com.Sachin.BinarySearch.Easy;

// Question Links:
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class MinimumInSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(findMinInRotatedSortedArray(arr));
    }

    public static int findMinInRotatedSortedArray(int[] arr){
        int pivot = findPivot(arr);
        if (pivot == -1){
            return arr[0];
        }
        return arr[pivot + 1];
    }

    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + ( end - start ) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

}

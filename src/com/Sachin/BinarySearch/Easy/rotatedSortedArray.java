package com.Sachin.BinarySearch.Easy;

// Question links:
// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class rotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,3};
        int target = 0;
        System.out.println(searchInRotatedArray(arr, target));
    }

    public static int searchInRotatedArray(int[] arr, int target) {
        int pivot = findPivot(arr);

        if(pivot == -1) {
            // just do normal binary search
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        if(target == arr[pivot]) {
            return pivot;
        }

        if(target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot -1 );
        }

        return binarySearch(arr, target, pivot + 1, arr.length -1);
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

    public static int binarySearch(int[] arr,int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

}

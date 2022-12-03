package com.Sachin.BinarySearch.Hard;



public class MountainArray {
    public static void main(String[] args) {
        int[] arr = { 22, 33, 44, 55, 66,55,44,33,11};
        int target = 11;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        int peak = peakInMountainArray(arr);
        int firstTry = orderAgnosticsBS( arr, target, 0, peak);

        if(firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticsBS(arr, target, peak + 1, arr.length-1);
    }

    static int peakInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + ( end - start ) / 2;

            if ( arr[mid] > arr[mid + 1]) {
                // we are in decreasing part of array
                end = mid;
            } else {
                // we are in acending part of array
                start = mid + 1;
            }
        }
        // at last, start == end..
        return start; // or return end can be written

    }

    static int orderAgnosticsBS(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else
            {
                if (target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}

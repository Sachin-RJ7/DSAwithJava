package com.Sachin.BinarySearch.Easy;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {22, 33, 44, 55, 66, 44, 77, 88};
        System.out.println(sortedArray(arr, 0));
    }

    public static boolean sortedArray(int[] arr, int start) {

        boolean result = helper(arr, 0);
            return result;
    }

    private static boolean helper(int[] arr, int start) {
        if(start == arr.length - 1) {
            return true;
        }

        return arr[start] <= arr[start + 1] && helper(arr,start + 1);
    }
}

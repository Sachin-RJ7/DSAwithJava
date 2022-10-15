package com.Sachin.BinarySearch.Easy;

import java.util.ArrayList;
import java.util.Arrays;

//  https://leetcode.com/problems/intersection-of-two-arrays-ii/

//  Given two integer arrays nums1 and nums2, return an array of their intersection.
//  Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

//  Example 1:
//  Input: nums1 = [1,2,2,1], nums2 = [2,2]
//  Output: [2,2]

//  Example 2:
//  Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//  Output: [4,9]
//  Explanation: [9,4] is also accepted.

public class IntersectionOfTwoArrays2 {
    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(intersect(arr1, arr2)));
    }

    public static int[] intersect(int[] arr1, int[]arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList<Integer> arr = new ArrayList<Integer>();

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                i++;
            }
            else if(arr1[i] > arr2[j]) {
                j++;
            }
            else {
                arr.add(arr1[i]);
                i++;
                j++;
            }
        }

        int[] output = new int[arr.size()];
        int index = 0;
        for (int k : arr) {
            output[index++] = k;
        }
        return output;
    }

}

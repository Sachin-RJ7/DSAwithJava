package com.Sachin.BinarySearch.Hard;

// About Question:
// https://leetcode.com/problems/median-of-two-sorted-arrays/

// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//The overall run time complexity should be O(log (m+n)).

// Example 1:
// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.

// Example 2:
// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n3=n1+n2;
        int[] a3 =new int[n3];
        int i=0;
        int j=0;
        int k=0;

        while(i<n1 && j<n2)
        {
            if(nums1[i]<nums2[j])
            {
                a3[k]=nums1[i];
                k++;
                i++;
            }
            else
            {
                a3[k]=nums2[j];
                k++;
                j++;

            }
        }

        while(i<n1)
        {
            a3[k]=nums1[i];
            k++;
            i++;
        }

        while(j<n2)
        {
            a3[k]=nums2[j];
            k++;
            j++;
        }

        if(n3%2==1){
            return (double)a3[(n3-1)/2];
        }

        int idx=(n3-2)/2;
        int idx1=n3/2;
        float ans=(a3[idx]+a3[idx1]);
        return (double)ans/2;



    }
}

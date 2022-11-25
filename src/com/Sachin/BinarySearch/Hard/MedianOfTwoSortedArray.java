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

import java.util.Arrays;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {3, 5, 7, 10, 15};
        int[] nums2 = {2, 4, 12};
        System.out.println(findMedianSortedArrays(nums1,nums2));
        System.out.println(findMedianSortedArrays2(nums1,nums2));
        System.out.println(medianOfTwoSortedArrays(nums1,nums2));
    }

    // optimised code
    public static double medianOfTwoSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] merged = new int[length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged[k] = nums1[i];
                i++;
                k++;
            }
            else {
                merged[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i < nums1.length) {
            merged[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {
            merged[k] = nums2[j];
            j++;
            k++;
        }

        double median = 0.0;
        int mid = merged.length / 2;
        if (merged.length % 2 == 1) {
            median = merged[mid];
        }
        else{
            median = (merged[mid] + merged[mid - 1]) / 2.0;
        }

        return median;

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

    // Simple approach....My own approach
    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {

        // determines length of firstArray
        int a1 = nums1.length;

        // determines length of secondArray
        int b1 = nums2.length;

        // resultant array size
        int c1 = a1 + b1;

        // create the resultant array
        int[] c = new int[c1];

        // using the pre-defined function arraycopy
        System.arraycopy(nums1, 0, c, 0, a1);
        System.arraycopy(nums2, 0, c, a1, b1);

        Arrays.sort(c);

        // prints the resultant array
        System.out.println(Arrays.toString(c));


        int start = 0;
        int end = c.length-1;

        int mid = start + (end - start)/ 2;

        double sum = 0.0;

        if(c.length % 2 == 0) {
            sum = (c[mid] + c[mid+1])/2.0;
            return sum;
        }
        else {
            sum = c[mid];
            return sum;
        }

    }

}

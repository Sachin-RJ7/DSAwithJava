package com.Sachin.Sorting.Easy;

// Question Link:
// https://leetcode.com/problems/merge-sorted-array/description/

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = nums2.length;

        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        // here we will do this problem with Two Pointer Approach method
        // Since, we already knows that these both arrays are sorted in increasing order, right ?
        // It means, the first is already sorted in increasing order, so we don't need two sort them again. we will not touch them.
        // So, we will start merging and comparing from the last index.
        // firstly, we will compare both arrays value, and which will satisfies the condition, put that value at the last index.
        // We will start putting values from the last index because we knows that starting values are already sorted (given in the question)

        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j >= 0 ){
            if (i >= 0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else {
                nums1[k--] = nums2[j--];
            }
        }

        for(int x = 0; x < nums1.length; x++) {
            System.out.println(nums1[x]);
        }

    }

}

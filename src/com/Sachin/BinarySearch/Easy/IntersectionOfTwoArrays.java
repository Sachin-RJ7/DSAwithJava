package com.Sachin.BinarySearch.Easy;

import java.util.HashSet;

//  https://leetcode.com/problems/intersection-of-two-arrays/

//  Given two integer arrays nums1 and nums2, return an array of their intersection.
//  Each element in the result must be unique and you may return the result in any order.

//  Example 1:
//
//  Input: nums1 = [1,2,2,1], nums2 = [2,2]
//  Output: [2]
//  Example 2:
//
//  Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//  Output: [9,4]
//  Explanation: [4,9] is also accepted

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] ans=intersection(nums1,nums2);
        for(int x:ans)
            System.out.print(x+" ");

    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        // firstly, we will create a hashset
        HashSet<Integer> set = new HashSet<Integer>();

        // Now we will copy the num1 array into Hashmap
        for(int i: nums1) {
            set.add(i);
        }

        // Create new Hashset to keep intersection values
        HashSet<Integer> intersect = new HashSet<Integer>();

        for (int i : nums2) {
            if(set.contains(i)) {
                intersect.add(i);
            }
        }

        // Now converting hashset to array
        int index = 0;
        int[] result = new int[intersect.size()];

        for(int i : intersect) {
            result[index++] = i;
        }

        return result;

    }

}

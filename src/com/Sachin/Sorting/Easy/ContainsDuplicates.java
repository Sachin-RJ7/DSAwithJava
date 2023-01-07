package com.Sachin.Sorting.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Question Link:
// https://leetcode.com/problems/contains-duplicate/description/

public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(containsDuplicates(arr));
    }


    public static boolean containsDuplicates(int[] nums) {
        // using HashSet -> because it does not contain duplicates values and time complexity is (1)
        Set<Integer> set = new HashSet<>();
        for( int num : nums) {
            if (set.contains(num)) { // if set found same values, then it will return true
                return true;
            }
            set.add(num); // adding values to set
        }
        return false; // if not found same value, return false


//        Brute force approach

//        if(nums.length == 1){
//            return false;
//        }
//
//        Arrays.sort(nums);
//        for(int i = 1; i < nums.length; i++){
//            if(nums[i] == nums[i - 1]){
//                return true;
//            }
//        }
//        return false;
    }

}

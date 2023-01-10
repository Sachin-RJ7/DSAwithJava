package com.Sachin.Sorting.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Question Link:
// https://leetcode.com/problems/intersection-of-two-arrays/

public class Intersection {

    public static void main(String[] args) {
        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(findIntersection(arr1, arr2)));
    }

    public static int[] findIntersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> al = new ArrayList<>();

        // create two Hashset because it does not contain duplicate values
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Adding first array and second array values in the set1 and set2 respectively
        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            set2.add(num);
        }

        // Now, we will check whether the set2 contains the same values as set1, if it is true then we will add the same
        // values in the new arrayList
        for (int x : set1) {
            if (set2.contains(x)){
                al.add(x);
            }
        }

        // Now we will create a new array which will contains the common values and return
        int[] arr = new int[al.size()];
        for(int k=0;k<al.size();k++){
            arr[k]=al.get(k);
        }

        return arr;
    }
}

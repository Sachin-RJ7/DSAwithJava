package com.Sachin.Sorting.Easy;

import java.util.Arrays;

// Question Link:
// https://leetcode.com/problems/squares-of-a-sorted-array/description/

public class SortedSquares {
    public static void main(String[] args) {
        int[] arr = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }

    public static int[] sortedSquares(int[] nums){

        int length = nums.length;
        // case 1:
        // if the length of the array is = 0, then it will return empty array
        if (length == 0) return new int[0];

        int[] result = new int[length]; // creating new array for storing the arrays value.

        // Logic is that we will check first between first and last values square and try to find which is greater.
        // that's why, here left = 0 and right = length-1 which is pointing to the last.
        int left = 0;           // this is pointing to the first value means starting value of array
        int right = length - 1; // this is pointing to the last value means end value of array.


        // here i=length-1, means this loop is running from the end till first.
        // Intitution is that we will check which square value of left and right is greater, the greater value will be pushed
        // to the end, that's why i is starting from end.

        for (int i = length - 1; i >= 0; i--) {
            int start = nums[left] * nums[left]; // putting square in the new variable start of left pointer
            int end = nums[right] * nums[right]; // last value square in the new variable end of the right pointer

            // if start value is greater than end value, we will put that value in the last and move left pointer one
            // step ahead
            if (start > end) {
                result[i] = start;
                left++;
            }
            // else put end value in the last because it is greater and decrease the value of right pointer
            else {
                result[i] = end;
                right--;
            }
        }
        return result;


//        if (nums.length == 0){
//            return new int[0];
//        }
//
//        int left = 0;
//        int right = nums.length-1;
//        int k = nums.length -1;
//        int ans[]= new int[nums.length];
//
//        while (left <= right){
//            int max = (Math.abs(nums[left]) < Math.abs(nums[right])?nums[right] : nums[left]);
//            if (max == nums[right]){
//                right--;
//            }
//            else{
//                left++;
//            }
//            ans[k] = max * max;
//            k--;
//        }
//        return ans;


//
    }

}

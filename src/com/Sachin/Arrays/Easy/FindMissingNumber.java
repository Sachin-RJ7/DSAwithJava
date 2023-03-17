package com.Sachin.Arrays.Easy;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 4, 5, 6, 7};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {

             int i = 0;
             while (i < nums.length) {
                 int correctIndex = nums[i];
                 if (nums[i]  < nums.length && nums[i] != nums[correctIndex]) {
                     swap(nums, i , correctIndex);
                 }
                 else {
                     i++;
                 }
             }

             // search for first missing number
             for (int index = 0; index < nums.length; index++) {
                 if (nums[index] != index) {
                     return index;
                 }
             }
             return nums.length;

         }

         public static void swap(int[] arr, int first, int second) {
             int temp = arr[first];
             arr[first] = arr[second];
             arr[second] = temp;
         }
}


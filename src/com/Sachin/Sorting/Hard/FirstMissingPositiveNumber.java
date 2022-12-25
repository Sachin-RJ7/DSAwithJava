package com.Sachin.Sorting.Hard;

// Question Link:
// https://leetcode.com/problems/first-missing-positive/description/

public class FirstMissingPositiveNumber {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(firstMissingPositiveNumber(nums));
    }

    public static int firstMissingPositiveNumber(int[] nums){

        int i = 0;

        if (nums.length == 1 && nums[i] == 1){
            return nums[i]+1;
        }

        while (i < nums.length) {
            if (nums[i] < nums.length && nums[i] > 0){
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i , correct);
                } else {
                    i++;
                }
            }
            else {
                i++;
            }
        }

        //just find missing numbers
        for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index+1) {
                    return index+1;
                }
        }
        return nums.length + 1;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

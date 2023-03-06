package com.Sachin.Arrays.Hard;

public class FirstMIssing {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 10, 12};
        System.out.println(firstMissingPositive(arr));
    }

    static public int firstMissingPositive(int[] nums) {
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
        return nums[nums.length - 1] + 1;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

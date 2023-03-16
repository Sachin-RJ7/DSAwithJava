package com.Sachin.Arrays.Easy;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 3};
        moveZeroes(arr);

        for (int j : arr) {
            System.out.print(" " + j);
        }
    }

    public static void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                swap(nums, i, j);
                j++;
            }
        }
    }

    public static void swap(int[] arr, int i, int k){
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
}

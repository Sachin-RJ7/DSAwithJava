package com.Sachin.Arrays.Easy;

public class FindConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 1 && nums[0] == 1){
            return 1;
        }

        int count = 0;
        int newCount = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                newCount++;
                if(newCount > count){
                    count = newCount;
                }
            }
            else{
                newCount = 0;
            }
        }

        return count;
    }
}

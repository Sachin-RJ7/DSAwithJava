package com.Sachin.Sorting.Easy;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 1};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {
        int i = 0;

        if (nums.length == 1){
            return nums[i];
        }

        int n = nums.length;
        int m = n/2;

        int count = 0;

        while (i < n ){
            count++;
            if (nums[i] != nums[i+1]){
                if (count > m) {
                    return nums[i];
                }
                else{
                    count = 0;
                }
            }
            else if(i == n - 2){
                return nums[i];
            }
            i++;
        }
        return -1;
    }
}

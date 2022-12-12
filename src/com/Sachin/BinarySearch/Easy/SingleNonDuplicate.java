package com.Sachin.BinarySearch.Easy;

public class SingleNonDuplicate {
    public static void main(String[] args) {
        int[] arr = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(arr));
    }

    public static int singleNonDuplicate(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while(start < end) {
            int mid = start + (end - start)/2;

            if(mid%2 == 0 && nums[mid] == nums[mid+1] || mid%2 == 1 && nums[mid] == nums[mid-1]) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return nums[start];

    }
}

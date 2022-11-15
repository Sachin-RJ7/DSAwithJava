package com.Sachin.BinarySearch.Hard;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {2,2,2,0,1};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {
        int lo = 0, hi = nums.length - 1;

        if (nums[lo] < nums[hi]) return nums[lo];

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] > nums[hi]) {
                lo = mid + 1;
            } else if (nums[mid] < nums[hi]) {
                hi = mid;
            } else {
                hi--;
            }
        }

        return nums[hi];
    }

}

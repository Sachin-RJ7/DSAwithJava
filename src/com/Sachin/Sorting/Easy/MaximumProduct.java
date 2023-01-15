package com.Sachin.Sorting.Easy;

// Question Link:
// https://leetcode.com/problems/maximum-product-of-three-numbers/

public class MaximumProduct {
    public static void main(String[] args) {
        int[] arr = {7, 3, 1, 5, 4, 2};
        System.out.println(maximumProduct(arr));
    }

    public static int maximumProduct(int[] nums){
        // Initialize Maximum, second maximum
        // and third maximum element
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;

        // Initialize Minimum and
        // second minimum element
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;

        for (int num : nums) {
            // Update Maximum, second maximum
            // and third maximum element
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            }
            // Update second maximum and
            // third maximum element
            else if (num > max2) {
                max3 = max2;
                max2 = num;
            }
            // Update third maximum element
            else if (num > max3) {
                max3 = num;
            }

            // Update Minimum and second
            // minimum element
            if (num < min1) {
                min2 = min1;
                min1 = num;
            }

            // Update second minimum element
            else if (num < min2) {
                min2 = num;
            }
        }
        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }

}

package com.Sachin.Sorting.Easy;

import java.util.Arrays;

// Question Link:
// https://leetcode.com/problems/largest-perimeter-triangle/description/

// Explanation:
//  Before diving into code.. Let us recall the basic rule for lengths of sides of a triangle
//  i.e, sum of any two sides of a triangle should be greater than its third side.
//  Simply, a + b > c
//  where a, b, c are sides of triangle.

// Approach:
//  Since we need the largest perimeter from the given nums. We sort the array and traverse from the end
//  if nums[i] < nums[i-1] + nums[i-2], then
//  we Stop and return the perimeter==> nums[i] + nums[i-1] + nums[i-2]
//  if there is no values that satisfies the given condition then
//  we return 0

public class LargestPerimeter {
    public static void main(String[] args) {
        int[] arr = {1,2,1,10};
        System.out.println(largestPerimeter(arr));
    }

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >1; i--){
            if(nums[i] < nums[i-1] + nums[i-2]){
                return nums[i] + nums[i-1] + nums[i-2];
            }
        }
        return 0;
    }
}

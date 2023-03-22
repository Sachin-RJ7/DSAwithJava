package com.Sachin.Arrays.Easy;

public class LongestSubArrWithSumK_BF {
    public static void main(String[] args) {
        int[] arr = {7,1,6,0};
        int n = arr.length, k = 7;

        System.out.println("Length of the longest subarray with sum K is " +
                longestSubArrWithSumK_BF(arr, n, k));
    }

    public static int longestSubArrWithSumK_BF(int[] arr, int n, int k) {
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k)
                    maxLength = Math.max(maxLength, (j - i + 1));
            }

        }
        return maxLength;
    }
}

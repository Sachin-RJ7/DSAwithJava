package com.Sachin.BinarySearch.Hard;

import java.util.Arrays;

// Question link:-
// https://www.geeksforgeeks.org/chocolate-distribution-problem/

// Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a
// variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:
// Each student gets one packet.
// The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum
// chocolates given to the students is minimum.

// Examples:
// Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3
// Output: Minimum Difference is 2

// Explanation:
// We have seven packets of chocolates and we need to pick three packets for 3 students
// If we pick 2, 3 and 4, we get the minimum difference between maximum and minimum packet sizes.

public class chocolateDistribution {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int M = 5;
        System.out.println(chocolateDivide(arr,M));
    }

    public static int chocolateDivide(int[] arr, int M) {
        int ans = Integer.MAX_VALUE;
        System.out.println("ans ->" + ans);

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - M; i++) {
            int minw = arr[i];
            int maxw = arr[i+M-1];
            int gap = maxw - minw;

            if (gap < ans) {
                ans = gap;
            }
        }
        return ans;
    }

}

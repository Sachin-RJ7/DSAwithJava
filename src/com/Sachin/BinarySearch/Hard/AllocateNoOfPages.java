package com.Sachin.BinarySearch.Hard;

// Question Link:
// https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

// You are given N number of books. Every ith book has Ai number of pages.
// You have to allocate contiguous books to M number of students. There can be many ways or permutations to do so. In each permutation, one of the M students will be allocated the maximum number of pages. Out of all these permutations, the task is to find that particular permutation in which the maximum number of pages allocated to a student is the minimum of those in all the other permutations and print this minimum value.
// Each book will be allocated to exactly one student. Each student has to be allocated at least one book.
// Note: Return -1 if a valid assignment is not possible, and allotment should be in contiguous order (see the explanation for better understanding).

// Example 1:
// Input:
// N = 4
// A[] = {12,34,67,90}
// M = 2
// Output:113

// Explanation:Allocation can be done in
// following ways:{12} and {34, 67, 90}
// Maximum Pages = 191{12, 34} and {67, 90}
// Maximum Pages = 157{12, 34, 67} and {90}
// Maximum Pages =113. Therefore, the minimum of these cases is 113, which is selected as the output.

public class AllocateNoOfPages {
    public static void main(String[] args) {
        int[] arr = {20, 10, 30, 40};
        int student = 3;
        System.out.println(findPages(arr, student));
    }

    public static int findPages(int[] arr, int N) {

        if (N > arr.length) {
            return -1;
        }

        int sum = 0;
        int max = 0;

        for(int i : arr) {
            sum += i;
            max = Math.max(max, i);
        }

        int low = max;
        int high = sum;
        int ans = 0;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(arr, N, mid)) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;

    }

    private static boolean isPossible(int[] arr, int n, int maxPageLoad) {
        int sum = 0;
        int student = 1;
        for (int j : arr) {
            sum += j;
            if (sum > maxPageLoad) {
                student++;
                sum = j;
            }
        }
        return student <= n;
    }
}

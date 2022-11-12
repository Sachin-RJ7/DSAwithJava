package com.Sachin.BinarySearch.Medium;

public class MinimumNoOfPages {
    public static void main(String[] args) {
        int[] arr = {12,34,67,90};
        int M = 2;
        int N = arr.length;
        System.out.println(noOfPages(arr, M, N));
    }

    public static int noOfPages(int[] arr, int M, int N) {

        if(N<M) return -1;
        int sum = 0;
        int max = 0;

        for(int val : arr) {
            sum += val;
            max = Math.max(max,val);
        }

        int low = max;
        int high = sum;
        int ans = 0;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(isPossible(arr, mid, M)) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] arr, int mid, int M) {
        int st = 1;
        int sum = 0;

        for (int j : arr) {
            sum += j;
            if (sum > mid) {
                st += 1;
                sum = j;
            }

        }
        return st <= M;
    }

}

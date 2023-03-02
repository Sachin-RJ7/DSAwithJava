package com.Sachin.Recursion.Easy;

import java.util.ArrayList;
import java.util.List;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = { 28, 43, 26, 65, 60, 54, 51, 35, 42, 48, 33, 40 };
        System.out.println(arraySortedOrNot(arr, arr.length));
    }

    public static boolean arraySortedOrNot(int[] arr, int n) {
        int i = 0;

        int ans = helper(arr, n, i);

        return ans == 1;
    }

    public static int helper(int[] arr,int n, int i){
        if(i == n - 1){
            return 1;
        }

        if(arr[i] <= arr[i + 1]){
            helper(arr, n, ++i);
        }

        return 0;
    }
}

package com.Sachin.Arrays.Easy;

import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int s = 5;
        System.out.println(pairSum(arr, s));
    }

    public static List<List<Integer>> pairSum(int[] arr, int s) {
        // Write your code here.
        List<List<Integer>> listOfArrays = new ArrayList<List<Integer>>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == s) {
                    List<Integer> array = Arrays.asList(arr[i], arr[j]);
                    listOfArrays.add(array);
                }
            }

        }
        return listOfArrays;

    }

}

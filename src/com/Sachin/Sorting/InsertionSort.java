package com.Sachin.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 0, 1, -77};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // insertion sort
    public static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                // if the current value of j is less than previous value of j, then swapping will occure
                if (arr[j] < arr[j-1]){
                    swap(arr,j, j-1);
                }
                else {
                    // if current value is greater than previous value, then no swapping will occur because the
                    // value is already sorted
                    // And if values are already sorted it means there is no need to check in the left hand side of the current value
                    // because all the values are already sorted
                    break;
                }
            }
        }
    }

    // swapping will occure if the current value is smaller than its previous value.
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

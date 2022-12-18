package com.Sachin.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // bubble sort algorithm
    public static void bubbleSort(int[] arr) {
        // if the array is already sorted
        boolean swapped;

        for(int i = 0; i < arr.length -1; i++){
            for (int j = 1; j < arr.length - i ; j++) {
                swapped = false;
               // swapping if the item is smaller than its previous item
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

                if (!swapped){
                    break;
                }
            }
        }
    }
}

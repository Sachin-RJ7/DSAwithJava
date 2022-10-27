package com.Sachin.BinarySearch.Medium;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {8, 9, 10, 1, 2, 3, 5, 6, 7};
        int key = 5;
        System.out.println(search(arr, 0, arr.length-1, key));
        System.out.println(findPivot(arr));
    }

    public static int search(int A[], int l, int h, int key){
        int mid = l + (h - l) / 2;

        int pivot = findPivot(A);
        if (pivot == -1)
            return binarySearch(A, key, 0, A.length - 1);

        if (key == A[pivot])
            return pivot;

        if (key >= A[0])
            return binarySearch(A, key, 0,pivot - 1);
        else
            return binarySearch(A, key, pivot + 1, h);

    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid])
                return mid;
            if (target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
           int mid = start + (end - start) / 2;

           if(end > mid && arr[mid] > arr[mid+1])
               return mid;
           if(mid > start && arr[mid] < arr[mid - 1])
               return mid - 1;

           if (arr[start] >= arr[mid])
                end = mid - 1;
           else
               start = mid + 1;
        }
        return -1;
    }
}

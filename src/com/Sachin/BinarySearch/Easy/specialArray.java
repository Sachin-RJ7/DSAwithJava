package com.Sachin.BinarySearch.Easy;

public class specialArray {
    public static void main(String[] args) {
        int[] arr = {0,4,3,0,4};
        System.out.println(special(arr));
    }

    public static int special(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= mid)
                    count++;
            }
            if (count == mid)
                return mid;
            if (count > mid)
                start = mid + 1;
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

package com.Sachin.BinarySearch.Easy;

public class CountNumberOfOccurrence {
    public static void main(String[] args) {
        int[] arr = {4, 4, 8, 8, 8, 15, 16, 23, 23, 42};
        int target = 1;
        System.out.println(count(arr, target));
    }

    public static int count(int[] arr, int target) {
        int firstOccurrence;
        int secondOccurrence = 0;

         firstOccurrence = search(arr, target, true);
         if (firstOccurrence != -1) {
             secondOccurrence = search(arr, target, false);
         }
         if (firstOccurrence == -1) {
             return 0;
         }
         else {
             return secondOccurrence - firstOccurrence + 1 ;
         }

    }

    public static int search(int[] arr, int target, boolean firstIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                if (target == arr[mid]) {
                    ans = mid;
                    if (firstIndex) {
                        end = mid - 1;
                    }
                    else {
                        start = mid + 1;
                    }
                }
            }
        }
        return ans;
    }

}

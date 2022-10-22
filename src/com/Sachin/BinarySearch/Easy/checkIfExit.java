package com.Sachin.BinarySearch.Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class checkIfExit {
    public static void main(String[] args) {
        int[] arr = {-20, 8, -6, -14, 0, -19, 14, 4};
//        int[] arr = {3,1,7,11};
        System.out.println(checkExitOrNot(arr));
        System.out.println(checkExit(arr));
        System.out.println(check(arr));
    }

    // optimised code... using HashMap
    public static boolean check(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i : arr) {
            if (set.contains(2 * i) || set.contains(i / 2 == 0 && set.contains(i/2))) {
                return true;
            }
            set.add(i);
        }
        return false;
    }

    // Noob bruteforce code...
    public static boolean checkExitOrNot(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int temp = arr[i] * 2;
            for(int j = 0; j < arr.length; j++){
                if(i == j) {
                    j++;
                }
                while(i == arr.length -1) {
                    for(int k = 0; k < arr.length-1; k++){
                        if(temp == arr[k]) {
                            return true;
                        }
                    }
                    return false;
                }
                if(temp == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Bruteforce code
    public static boolean checkExit(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] * 2 == arr[j])
                    return true;
            }
        }
        return false;
    }

}

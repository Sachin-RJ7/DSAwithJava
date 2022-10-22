package com.Sachin.BinarySearch.Easy;

public class checkIfExit {
    public static void main(String[] args) {
        int[] arr = {-20, 8, -6, -14, 0, -19, 14, 4};
        System.out.println(checkExitOrNot(arr));
        System.out.println(checkExit(arr));
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

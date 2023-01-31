package com.Sachin.Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 8, 9,8, 22, 8, 12, 14};
        int target = 8;
        System.out.println(find(arr, target, 0));
        System.out.println(findTarget(arr, target, 0));
        System.out.println(findTargetLast(arr, target, arr.length-1));

        findAllTarget(arr, target, 0);
        System.out.println(list);

        ArrayList<Integer> ans = findAllTarget2(arr, target, 0, new ArrayList<>());
        System.out.println(ans);

        System.out.println(findAllTarget3(arr, target, 0));
    }

    public static boolean find(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }

        return arr[index] == target || find(arr, target, index + 1);
    }

    public static int findTarget(int[] arr, int target, int index) {

        if (index == arr.length){
            return -1;
        }

        if (arr[index] == target){
            return index;
        }

        return  findTarget(arr, target, index+1);
    }

    // finding the target from the last element
    public static int findTargetLast(int[] arr, int target,int index ) {
        if (index == -1){
            return -1;
        }

        if (arr[index] == target){
            return index;
        }

        return findTargetLast(arr, target, --index);
    }


    static ArrayList<Integer> list = new ArrayList<>();
    public static void findAllTarget(int[] arr, int target, int index) {
        if (index == arr.length){
            return;
        }

        if (arr[index] == target){
            list.add(index);
        }

        findAllTarget(arr, target, index+1);
    }

    public static ArrayList<Integer> findAllTarget2(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length){
            return list;
        }

        if (arr[index] == target){
            list.add(index);
        }

        return findAllTarget2(arr, target, index+1, list);
    }

    // not optimised, don't use mostly
    public static ArrayList<Integer> findAllTarget3(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length){
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllTarget3(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }


}

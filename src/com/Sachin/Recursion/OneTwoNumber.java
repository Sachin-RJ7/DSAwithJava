package com.Sachin.Recursion;

public class OneTwoNumber {
    public static void main(String[] args) {
        fun(5);
    }

    public static void oneTwoNumber(int num) {

        if (num == 0){
            return;
        }

        oneTwoNumber(num - 1);
        System.out.println(num);

    }

    public static void fun(int num) {
        if (num == 0)
            return;

        System.out.println(num);
        fun(num - 1);
        System.out.println(num);
    }
}

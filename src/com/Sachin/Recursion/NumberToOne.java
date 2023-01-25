package com.Sachin.Recursion;

public class NumberToOne {
    public static void main(String[] args) {
        numberToOne(5);
    }

    public static void numberToOne(int num){

        System.out.println(num);
        if (num == 1) {
            return;
        }
        numberToOne(num - 1);

    }
}

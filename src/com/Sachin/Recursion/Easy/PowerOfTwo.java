package com.Sachin.Recursion.Easy;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }
}

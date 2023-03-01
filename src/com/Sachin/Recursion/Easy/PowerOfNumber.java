package com.Sachin.Recursion.Easy;

// https://leetcode.com/problems/power-of-four/description/
// https://leetcode.com/problems/power-of-three/description/


public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(32));
        System.out.println(isPowerOfFourRecursive(70));
        System.out.println(isPowerOfThree(27));
    }

    public static boolean isPowerOfFour(int n){
        if (n == 0) return false;

        if (n == 1) return true;   // 4 ^ 1 == 4

        // if n%4 == 0, it means it is divisible by four
        while(n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }

    public static boolean isPowerOfFourRecursive(int n){
        // if n == 0, it means 4 ^ 0 == 0, which is not power four or multiple of four
        if (n == 0) return false;

        return (( n == 1) || ( n % 2 == 0 && isPowerOfFourRecursive(n / 2)));

    }

    public static boolean isPowerOfThree(int n){
        if (n == 0) return false;

        if (n == 1) return true;

        while(n % 3 == 0) n /= 3;

        return n == 1;
    }

}

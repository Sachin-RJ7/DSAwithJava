package com.Sachin.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int ans = factorial(-5);
        System.out.println(ans);
    }

    public static int factorial(int n) {

        if (n < 0){
            n = n * -1;
        }

        if (n <= 1){
            return 1;
        }

        return n * factorial(n-1);

    }
}

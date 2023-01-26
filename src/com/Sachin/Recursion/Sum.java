package com.Sachin.Recursion;

public class Sum {
    public static void main(String[] args) {
        int ans = sum(4);
        System.out.println(ans);
    }

    // Sum of first n numbers
    public static int sum(int n)  {
        if (n == 1){
            return 1;
        }
        return n + sum(n - 1);
    }

}

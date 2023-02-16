package com.Sachin.Recursion.Medium;

public class Power {
    public static void main(String[] args) {
        System.out.println(pow(2.00000, 10));
        System.out.println(myPow(2.00000, 10));
    }

    public static double pow(double x, int n){
        if(n < 0){
            n = -n;
            x = 1 / x;
        }

        double pow = 1;

        while(n != 0){
            if((n & 1) != 0){
                pow *= x;
            }

            x *= x;
            n >>>= 1;

        }

        return pow;
    }

    public static double myPow(double x, int n){
        if (n==0) return 1;
        else if (n%2==0) return myPow(x*x, n/2);
        else if (n%2==1) return x*myPow(x, n-1);
        return 1/myPow(x, -n);
    }
}

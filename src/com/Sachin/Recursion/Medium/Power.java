package com.Sachin.Recursion.Medium;

public class Power {
    public static void main(String[] args) {
        System.out.println(pow(2, 5));
    }

    public static double pow(double x, long n){
        if(n==0 || x==1)
            return 1;
        if(x==0)
            return 0;

        if(n<0)
            return pow(1/x,Math.abs(n));

        return (n%2==0 ? pow(x*x,n/2) : x*pow(x*x,n/2));

    }
}

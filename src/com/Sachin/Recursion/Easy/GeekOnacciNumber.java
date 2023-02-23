package com.Sachin.Recursion.Easy;

import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/geek-onacci-number/0

public class GeekOnacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int n=sc.nextInt();
            int ans = geek_onacciNumber(n,a,b,c);
            System.out.println(ans);
        }
    }

    static int geek_onacciNumber(int n, int a, int b, int c){
        if(n==3){
            return c;
        }
        if(n==2){
            return b;
        }
        if(n==1){
            return a;
        }
        return geek_onacciNumber(n-1,a,b,c)+ geek_onacciNumber(n-2,a,b,c)+ geek_onacciNumber(n-3,a,b,c);
    }
    
}

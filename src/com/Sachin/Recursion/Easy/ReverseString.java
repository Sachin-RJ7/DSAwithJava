package com.Sachin.Recursion.Easy;

// https://leetcode.com/problems/reverse-string/description/

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', '0' };
        PrintReverseString(s);

        reverseString(s);
        System.out.println(s);

        // using stack
        reverseTheString(s);
        System.out.println(s);
    }

    public static void PrintReverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        helper(s, i, j);
    }

    public static void helper(char[] s, int i, int j){
        System.out.println(s[j]);

        if (j == 0){
            return;
        }

         helper(s, i, --j);
    }


    public static void reverseString(char[] s){
        int i = 0;
        int j = s.length - 1;

        solve(s, i, j);
    }

    public static void solve(char[] s, int i, int j){
        if (i >= j){
            return;
        }

        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;

        solve(s, ++i, --j);

    }

    // reversing the string using Stack
    public static void reverseTheString(char[] s){
        Stack<Character> st = new Stack<>();
        String str = new String(s);
        for(int i = 0; i < str.length(); i++){
            st.push(s[i]);
        }

        int i = 0;
        while(st.size() > 0){
            s[i++] = st.pop();
        }
    }
}

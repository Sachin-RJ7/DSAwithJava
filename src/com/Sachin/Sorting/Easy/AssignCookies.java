package com.Sachin.Sorting.Easy;

import java.util.Arrays;

// Question Link:
// https://leetcode.com/problems/assign-cookies/description/

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};
        System.out.println(assignCookies(g,s));
    }

    // To assign cookies to children optimally we should give for each child the closest higher cookie.
    // By using this greedy approach overall sum of wasted cookies will be minimum among all.
    // To use this greedy solution in effective way we can sort both arrays and use two pointers.
    // We should move pointer of children only if there is enough cookies to make that child content.
    // In each step we will try to make content child at position pointer greed by searching the closes higher cookie value.

    public static int assignCookies(int[] g, int[] s){
        int greed = 0;
        int cookie = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        while(greed < g.length && cookie < s.length){
            if (s[cookie] >= g[greed]){
                greed++;
            }
            cookie++;
        }
        return greed;
    }


}

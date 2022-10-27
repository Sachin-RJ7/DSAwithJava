package com.Sachin.BinarySearch.Medium;

//  https://leetcode.com/problems/koko-eating-bananas/

//  Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and
//  will come back in h hours.
//  Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas
//  from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas
//  during this hour.
//  Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
//  Return the minimum integer k such that she can eat all the bananas within h hours.

//  Example 1:
//  Input: piles = [3,6,7,11], h = 8
//  Output: 4

public class kokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int hour = 8;
        System.out.println(minEatingBananasTimes(piles,hour));
    }

    public static int minEatingBananasTimes(int[] piles, int hour) {
        int low = 1;
        int high = 1;
        for(int i=0;i<piles.length;i++){
            high = Math.max(high,piles[i]);
        }
        while(low<high){
            int m = (low+high)/2;
            int k=0;
            for(var i : piles){
                k+=Math.ceil((double)i/m);
            }
            if(k<=hour) high = m;
            else low = m+1;
        }
        return high;
    }

}

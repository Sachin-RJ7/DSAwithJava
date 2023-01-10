package com.Sachin.Sorting.Easy;

// Question link:
// https://leetcode.com/problems/third-maximum-number/

public class ThirdMax {
    public static void main(String[] args) {
        int[] arr = {2,2,3,1};
        System.out.println(thirdMax(arr));
    }

    public static int thirdMax(int[] nums){

        // three variables to store maximum three numbers till now
        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for (int currentValue : nums) {

            Integer max1 = null;
            Integer max2 = null;
            Integer max3 = null;
            for (Integer n : nums) {
                if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
                if (max1 == null || n > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = n;
                } else if (max2 == null || n > max2) {
                    max3 = max2;
                    max2 = n;
                } else if (max3 == null || n > max3) {
                    max3 = n;
                }
            }
            return max3 == null ? max1 : max3;

            // ***********************************************************************************************

//            // if number is already used, then we will skip it
//            if(firstMax == currentValue || secondMax == currentValue || thirdMax == currentValue){
//                continue;
//            }
//
//            // if current number is greater than first max;
//            // it means, current number is the greater number and first max and
//            // second max will become the next two greater numbers
//            if (firstMax < currentValue){
//                thirdMax = secondMax;
//                secondMax = firstMax;
//                firstMax = currentValue;
//            }
//            // when current number is greater than second maximum,
//            // it means that this is the second-greatest number
//            else if (secondMax < currentValue){
//                thirdMax = secondMax;
//                secondMax = currentValue;
//            }
//            // it is the third-greatest number;
//            else{
//                thirdMax = currentValue;
//            }
//
//        }
//        // If third max was never updated, it means we don't have 3 distinct numbers.
//        if (thirdMax == Long.MIN_VALUE){
//            int ans = (int) firstMax;
//            return ans;
        }

        int ans = (int) thirdMax;
        return ans;

    }

}

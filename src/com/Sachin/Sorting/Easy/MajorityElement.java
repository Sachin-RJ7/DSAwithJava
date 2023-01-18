package com.Sachin.Sorting.Easy;

// Question Link:
// https://leetcode.com/problems/majority-element/solutions/

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 5, 5, 5, 5};
        System.out.println(majorityElement(arr));
    }

    // 🟡 Boyer-Moore Voting Algorithm (linear time complexity)

    // 💡 In this solution, We will consider the first element as the majority value, and we assign the candidate = current majority
    //    value, simultaneously going to increase the count value till the candidate is equal to current candidate.
    //    If the current candidate is not equal to the previous candidate then decrease the value of the count.


    public static int majorityElement(int[] nums) {

        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {  // if count = 0, we will assign the candidate, means majority element
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1; // if current candidate is equal to previous candidate(num) then we will increase the value
                                                  // otherwise deacrease the value
        }

        return candidate;


//        int i = 0;
//
//        if (nums.length == 1){
//            return nums[i];
//        }
//
//        int n = nums.length;
//        int m = n/2;
//
//        int count = 0;
//
//        while (i < n ){
//            count++;
//            if (nums[i] != nums[i+1]){
//                if (count > m) {
//                    return nums[i];
//                }
//                else{
//                    count = 0;
//                }
//            }
//            else if(i == n - 2){
//                return nums[i];
//            }
//            i++;
//        }
//        return -1;
    }
}

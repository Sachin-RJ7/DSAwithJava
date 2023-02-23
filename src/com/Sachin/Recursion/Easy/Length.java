package com.Sachin.Recursion.Easy;

// https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/

public class Length {
    public static void main(String[] args) {
        System.out.println(stringLength(""));
    }

    public static int stringLength(String str){
        if (str.isEmpty()){
            return 0;
        }

        return stringLength(str.substring(1)) + 1;
    }

}

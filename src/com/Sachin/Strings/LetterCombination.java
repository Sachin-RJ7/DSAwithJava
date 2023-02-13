package com.Sachin.Strings;

public class LetterCombination {
    public static void main(String[] args) {
        letterCombination("", "79");
    }

    public static void letterCombination(String p, String up){

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        int i = (digit - 2) * 3;

        if (digit > 7){
            i+=1;
        }

        int length = i + 3;

        if (digit == 7 || digit == 9){
            length+=1;
        }

        for ( ; i < length; i++){
            char ch = (char) ('a' + i);
            letterCombination(p + ch, up.substring(1));
        }
    }
}

package com.Sachin.Strings;

import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {
        letterCombination("", "79");
        System.out.println(letterCombinationList("", "79"));
        System.out.println(letterCombinationCount("", "79"));
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

    public static ArrayList<String> letterCombinationList(String p, String up){

        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';

        ArrayList<String> list = new ArrayList<>();

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
            list.addAll(letterCombinationList(p + ch, up.substring(1)));
        }

        return list;
    }

    static int letterCombinationCount(String p, String up){
        if (up.isEmpty()){
            return 1;
        }

        int digit = up.charAt(0) - '0';

       int count = 0;

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
            count = count + letterCombinationCount(p + ch, up.substring(1));
        }

        return count;
    }
}

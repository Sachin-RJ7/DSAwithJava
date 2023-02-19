package com.Sachin.Recursion.Easy;

public class FirstCapitalLetter {
    public static void main(String[] args) {
        findFirstCapitalLetter("gEekS", 0);

        findFirstCapitalLetter2("gEekS", 0);

        char res = returnFirstCapitalLetter("geeks", 0);

        if (res == 0)
            System.out.println("No uppercase letter");
        else
            System.out.println (res );
    }

    public static void findFirstCapitalLetter(String str, int i){
        if (str.length() == i){
            return;
        }

        if (Character.isUpperCase(str.charAt(i))){
            System.out.println(str.charAt(i));
            return;
        }

        findFirstCapitalLetter(str, i+1);
    }

    public static void findFirstCapitalLetter2(String str, int i){
        if (str.length() == i){
            return;
        }

        int asciiValue = (int)str.charAt(i);

        if ( asciiValue >= 65 && asciiValue <= 90){
            System.out.println(str.charAt(i));
            return;
        }

        findFirstCapitalLetter2(str, i+1);
    }


    public static char returnFirstCapitalLetter(String str, int i){

        if (str.length() == i){
            return 0;
        }

        int asciiValue = (int)str.charAt(i);

        if ( asciiValue >= 65 && asciiValue <= 90){
            return str.charAt(i);
        }

        return returnFirstCapitalLetter(str, i+1);

    }

}

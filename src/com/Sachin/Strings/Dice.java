package com.Sachin.Strings;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice("", 6);
        System.out.println(diceRet("", 6));
        System.out.println(diceCount("", 4));
    }

    public static void dice(String p, int target){
        if (target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++){
            dice(p + i, target - i);
        }
    }

    public static ArrayList<String> diceRet(String p, int target){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++){
            ans.addAll(diceRet(p + i, target - i));
        }

        return ans;
    }

    public static int diceCount(String p, int target){
        if (target == 0){
            return 1;
        }

        int count = 0;
        for (int i = 1; i <= 6 && i <= target; i++){
            count = count + diceCount(p + i, target - i);
        }

        return count;
    }

    public static void diceFace(String p, int target, int face){
        if (target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= target; i++){
            diceFace(p + i, target - i, face);
        }
    }
}

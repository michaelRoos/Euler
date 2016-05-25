package com.company;

import java.util.ArrayList;

/**
 * Created by mr767 on 4/27/16.
 */
public class ProblemTwentyFour {
    private static ArrayList<Integer> numberSet;
    private static String answer;
    public static void problemTwentyFour() {
        numberSet=new ArrayList<>();
        answer="";
        for(int count=0; count<=9; count++){
            numberSet.add(count);
        }
        int numberGoal=1000000;
        numberGoal=numberGoal-1;
        picknumber(numberSet, numberGoal);
        System.out.println(answer);
    }

    private static void picknumber(ArrayList<Integer> numberSet, int numberGoal) {
        if(numberSet.size()!=0) {
            int spot = (int) Math.floor(numberGoal / factorial(numberSet.size()-1));
            answer = answer + numberSet.get(spot);
            numberGoal=numberGoal%factorial(numberSet.size()-1);
            numberSet.remove(spot);
            picknumber(numberSet,numberGoal);
        }
    }
    private static int factorial(int x){
        int answer=1;
        for(int count=1; count<=x; count++){
            answer*=count;
        }
        return answer;
    }
}

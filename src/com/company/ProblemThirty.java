package com.company;

import java.util.ArrayList;

/**
 * Created by mr767 on 5/12/16.
 */
public class ProblemThirty
{
    public static void problemThirty() {
        ArrayList<Integer> solutions = new ArrayList<>();
        for(int count=1; count<999999; count++){
            String temp= String.valueOf(count);
            int sum=0;
            for(int step=0; step<temp.length(); step++){
                int dig=(new Integer(temp.substring(step,step+1)));
                sum+=(int)(Math.pow(dig,5));
            }
            if(sum==count){
                solutions.add(count);
            }
        }
        int total=0;
        System.out.println(solutions);
        for(int spot: solutions){
            total+=spot;
        }
        System.out.println(total);
    }//1 doesnt count

}

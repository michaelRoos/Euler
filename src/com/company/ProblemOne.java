package com.company;

import java.util.ArrayList;

/**
 * Created by mr767 on 12/14/15.
 */
public class ProblemOne {
    public static void problemOne(){
        ArrayList<Integer> num=new ArrayList<Integer>();
        for(int count = 1; count<1000; count++){
            if(count%3==0||count%5==0){
                num.add(count);
            }
        }

        int total=0;
        for(int number: num){
            total+=number;
        }
        System.out.println(total);
    }
}

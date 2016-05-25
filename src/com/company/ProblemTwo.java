package com.company;

import java.util.ArrayList;

/**
 * Created by mr767 on 12/14/15.
 */
public class ProblemTwo {
    public static void problemTwo(){
        ArrayList<Integer> fib = new ArrayList<>();
        fib.add(1);
        fib.add(1);
        int newnum=fib.get(fib.size()-1)+fib.get(fib.size()-2);
        while(newnum<4000000){
            fib.add(newnum);
            newnum=fib.get(fib.size()-1)+fib.get(fib.size()-2);
        }
        System.out.println(newnum);
        for(int count=fib.size()-1; count>=0; count--){
            if(fib.get(count)%2==1){
                fib.remove(count);

            }
        }
        int total=0;
        for(int num: fib){
            total+=num;
        }
        System.out.println(total);
    }
}

package com.company;

import java.util.ArrayList;

/**
 * Created by mr767 on 2/2/16.
 */
public class ProblemTwentyOne {
    public static void ProblemtwentyOne(){
        ArrayList<Integer>  amNum= new ArrayList<>();
        for(int count=1; count<10000; count++){
            if(count == sumFactors(sumFactors(count))&&count!=sumFactors(count)){
                amNum.add(count);
            }
        }

        int sum=0;
        for(int count=0; count<amNum.size(); count++){
            //System.out.println(amNum.get(count));

            sum+=amNum.get(count);
        }

        System.out.println(sum);
    }
    public static int sumFactors(int a){
        int sum = 0;
        for(int count = 1; count<a; count++){
            if(a%count==0){
                sum+=count;
            }
        }
        return sum;
    }
}

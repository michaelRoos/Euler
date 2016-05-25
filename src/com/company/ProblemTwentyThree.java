package com.company;

import java.util.ArrayList;

/**
 * Created by mr767 on 4/27/16.
 */
public class ProblemTwentyThree {
    private static ArrayList<Integer> abundantNumbers;
    public static void problemTwentyThree() {
        long totalSum=0;
        createAbundant();
        for(int count=1; count<28123; count++){
            boolean contains=false;
            for(int step=0; step<abundantNumbers.size(); step++){

                if(abundantNumbers.get(step)>count){
                    break;
                }
                else {
                    if (abundantNumbers.contains(count - (abundantNumbers.get(step)))){
                        contains=true;
                        step=abundantNumbers.size();
                    }
                }
            }
            if(!contains){
                totalSum+=count;
            }
        }
        System.out.println(totalSum);
    }


    private static void createAbundant() {
        abundantNumbers=new ArrayList<Integer>();
        for(int count=1; count<28123; count++){
            if(isAbundant(count)){
                abundantNumbers.add(count);
            }
        }
    }

    public static boolean isAbundant(int num) {
        int sum=0;
        for(int count=1; count<num; count++){
            if(num%count==0){
                sum+=count;
            }
        }
        return (sum>num);
    }
}

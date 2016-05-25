package com.company;

/**
 * Created by mr767 on 12/18/15.
 */
public class ProblemFourteen {
    public static void problemFourteen(){
        double start=0;
        double longStep=0;
        for(int count=0; count<1000000; count++){
            if(numSteps(count)>longStep){
                longStep=numSteps(count);
                start=count;
            }
        }
        System.out.print(start);


    }
    public static double numSteps(double a){
        double steps=1;
        while(a>1){
            if(a%2==0){
                a=a/2;
            }
            else{
                a=3*a+1;
            }
            steps++;
        }
        return steps;

    }
}

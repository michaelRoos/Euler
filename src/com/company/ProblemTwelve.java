package com.company;

/**
 * Created by mr767 on 12/17/15.
 */
public class ProblemTwelve {
    public static void problemTwelve(){
        int n=0;
        while(numDividers(trianglenum(n))<=500){
            n++;
        }
        System.out.println(trianglenum(n));
    }

    public static int numDividers(int a){
        int numDividers = 0;
        for(int count=1; count<Math.sqrt(a); count++){
            if(a%count==0){
                numDividers+=2;
            }
        }
        return numDividers;
    }
    public static int trianglenum(int a){
        int triag = 0;
        for (int count=1; count<=a; count++){
            triag+=count;
        }
        return triag;
    }
}

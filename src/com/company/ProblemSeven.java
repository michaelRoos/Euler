package com.company;

/**
 * Created by mr767 on 12/15/15.
 */
public class ProblemSeven {
    public static void problemSeven() {
        int primenum = 2;
        int answer = 0;
        for(int x = 3; primenum<=10001; x++){
            if(isPrime(x)){
                primenum++;
                answer=x;
            }

        }
        System.out.println(answer);



    }
    public static boolean isPrime(int a){
        for(int count=2; count<a; count++){
            if(a%count==0){
                return false;
            }
        }
        return true;
    }
}

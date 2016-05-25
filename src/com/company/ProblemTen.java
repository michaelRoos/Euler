package com.company;

import java.util.ArrayList;

/**
 * Created by mr767 on 12/15/15.
 */
public class ProblemTen {
    public static void problemTen(){
        int [] primes = generatePrime(2000000);
        long total=0;
        for(int num: primes){
            total+=num;
        }
        System.out.println(total);
    }

    public static int[] generatePrime(int a){
        int[] primes = new int[a+1];
        for(int x=0; x<=a; x++){
            primes[x]=x;
        }
        primes[1]=0;
        for(int count=2; count<=Math.sqrt(a); count++){
            if(primes[count]!=0){
                for(int x=2*count; x<=a; x+=count){
                    primes[x]=0;
                }
            }
        }

        return primes;









    }
}

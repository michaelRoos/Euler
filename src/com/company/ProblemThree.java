package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by mr767 on 12/14/15.
 */
public class ProblemThree {
    public static void problemThree(){
        ArrayList<Double> primes = new ArrayList<>();
        double num = 600851475143.0;
        boolean factored = false;
        while (!factored) {
            for (double count = 2; count<=num; count++){
                if(num%count==0){
                    if(count==num){
                        factored=true;
                    }
                    primes.add(count);
                    num=num/count;

                    break;
                }


            }
        }
        for(double a: primes){
            System.out.println(a);
        }
    }
}

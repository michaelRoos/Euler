package com.company;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by mr767 on 4/28/16.
 */
public class ProblemTwentyFive {
    public static void problemTwentyFive() {
        ArrayList<BigInteger> fibNum=new ArrayList<>();
        fibNum.add(BigInteger.ZERO);
        fibNum.add(BigInteger.ONE);
        for(int count=0; count<9999; count++){
            fibNum.add(fibNum.get(count).add(fibNum.get(count+1)));
        }
        for(int count=0; count<=9999; count++){
            int dig = fibNum.get(count).toString().length();
            if(dig==1000){
                System.out.println(count);
                break;
            }
        }

    }
}

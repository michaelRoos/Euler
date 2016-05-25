package com.company;

import java.math.BigInteger;

/**
 * Created by mr767 on 1/6/16.
 */
public class ProblemTwenty {
    public static void problemTwenty(){
        BigInteger number=new BigInteger("1");

        for(int mag=1; mag<9; mag++) {
            long startTime = System.currentTimeMillis();
            for (int count = 1; count < Math.pow(10, mag); count++) {
                number = number.multiply(BigInteger.valueOf(new Integer(count).intValue()));


            }
            System.out.println(number);
            System.out.println(mag+": "+(System.currentTimeMillis() - startTime)+" ms");

        }
    }
    public static int digSum(BigInteger num){
        String temp = num.toString();
        int digSum = 0;
        for(int count=0; count<temp.length(); count++){
            digSum+=new Integer(temp.substring(count, count+1));
        }
        return digSum;
    }
}

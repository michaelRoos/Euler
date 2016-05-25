package com.company;

import java.math.BigInteger;

/**
 * Created by mr767 on 12/21/15.
 */
public class ProblemSixteen {
    public static void problemSixteen(){
        BigInteger num = new BigInteger("2");
        BigInteger num2 = new BigInteger("2");
        for(int count=1; count<1000; count++){
            num=num.multiply(num2);
        }
        String finalnumber = new String(num.toString());

        System.out.println(finalnumber);
        int total = 0;
        for(int count=0; count<finalnumber.length(); count++){
            String digit = finalnumber.substring(count,count+1);
            total+= new Integer(digit);
        }
        System.out.println(total);

    }
}

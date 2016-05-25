package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 * Created by mr767 on 4/29/16.
 */
public class ProblemTwentySix {

    public static void problemTwentySix() {
        BigDecimal top = new BigDecimal(1);
        BigDecimal bottom = new BigDecimal(7);
        int max=-1;
        int pos=0;
        for(int count=2; count<999; count++){
            bottom = new BigDecimal(count);
            if(repeatLength(bottom)>max){
                max=repeatLength(bottom);
                pos=count;
            }
            //System.out.println(repeatLength(bottom));
            //System.out.println(count+": \t\t"+top.divide(bottom,15, RoundingMode.DOWN).toString());
        }
        //System.out.println(repeatLength(new BigDecimal(17)));
        System.out.println(pos+" "+max);


    }

    public static int repeatLength(BigDecimal num){
        String numString=new BigDecimal(1).divide(num,10000,RoundingMode.DOWN).toString();
        numString=trim(numString);
        int length=-1;
        for(int count = 1;count<=numString.length()/2; count++){
            if(numString.substring(0,count).equals(numString.substring(count,2*count))){
                length=count;
                break;
            }
        }
        return length;
    }
    public static String trim(String num){
        num=num.substring(2);
        int pos= 0;
        for(int count=0; count<100; count++){
            if(num.charAt(count)=='0'){
                pos++;
            }
            else break;
        }
        return num.substring(pos);
    }
}

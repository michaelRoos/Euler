package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by mr767 on 5/11/16.
 */
public class ProblemTwentyNine {
    public static void problemTwentyNine() {
        ArrayList<BigInteger> powers = generatePowers();
        Collections.sort(powers);
        for(int count=1; count<powers.size(); count++){
            if(powers.get(count).equals(powers.get(count-1))){
                powers.remove(count);
                count--;
            }
        }
        System.out.println(powers.size());
    }

    public static ArrayList<BigInteger> generatePowers(){
        ArrayList<BigInteger> powers = new ArrayList<>();
        for(int a=2; a<=100; a++){
            for(int b=2; b<=100; b++){
                BigInteger answer = new BigInteger(new Integer(a).toString());
                answer = answer.pow(b);
                powers.add(answer);
            }
        }
        return powers;
    }
}

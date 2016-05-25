package com.company;

/**
 * Created by mr767 on 5/13/16.
 */
public class ProblemThirtyThree {
    public static void problemThirtyThree() {
        double sum = 0;
        for(double den=10; den<100; den++) {
            if(den%10==0){
                den++;
            }
            for (double num = 10; num < den; num++) {
                if(num/den==fakeSimplify(num,den)){
                    System.out.println(num+" "+den);
                    sum+=num/den;
                }
            }
        }
        System.out.println(sum);
    }

    private static double fakeSimplify(double num, double den) {
        String top = String.valueOf(num);
        String bot = String.valueOf(den);
        return (new Double(top.substring(0,1))*new Double(top.substring(1,2)))/(new Double(bot.substring(0,1))*new Double(bot.substring(1,2)));
    }
}

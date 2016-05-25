package com.company;

import java.util.ArrayList;

/**
 * Created by mr767 on 5/12/16.
 */
public class ProblemThirtyTwo {
    public static void problemThirtyTwo() {
        ArrayList<Integer> sol = new ArrayList<>();
        int sum=0;
        for(int a=1; a<100; a++){
            for(int b=1; b<9999; b++){
                if(!sol.contains(a*b)&&isPandigital(a,b)) {
                    System.out.println("a: "+a+" b: "+b+" c: "+a*b);
                    sol.add(a * b);
                    sum+=(a*b);
                }

            }
        }
        System.out.println(sum);

    }

    private static boolean isPandigital(int a, int b) {
        int c = a*b;
        String a1=String.valueOf(a);
        String b1=String.valueOf(b);
        String c1=String.valueOf(c);
        String total = a1+b1+c1;
        if(String.valueOf(a).length()+String.valueOf(b).length()+String.valueOf(c).length()==9){
            for(int count=1; count<=9; count++){
                if(!total.contains(String.valueOf(count))){
                    return false;
                }
            }
            return true;
        }
        return false;

    }
}

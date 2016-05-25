package com.company;

import java.util.ArrayList;

/**
 * Created by mr767 on 12/15/15.
 */
public class ProblemFour {
    public static void problemFour(){
        System.out.println(ProblemFour.palindrome(123321));
        int[] pali = new int[3];
        for(int a=100; a<1000; a++){
            for(int b=100; b<1000; b++){
                if(palindrome(a*b)){
                    if(a*b>pali[0]){
                        pali[0]=a*b;
                        pali[1]=a;
                        pali[2]=b;
                    }
                }
            }
        }
        for(int result: pali){
            System.out.println(result);
        }
    }
    public static boolean palindrome(int a){
        String num = ""+a;
        ArrayList <String> letters=new ArrayList<>();
        for(int count=0; count<num.length(); count++){
            letters.add(num.substring(count, count+1));
        }

        boolean palindrome = true;
        for(int count=0; count<num.length()/2; count++){
            if(letters.get((count)).equals(letters.get(letters.size()-1-count))){
                palindrome=true;
            }
            else{
                palindrome=false;
            break;}
        }



        return palindrome;
    }

}

package com.company;

import java.util.ArrayList;

/**
 * Created by mr767 on 12/21/15.
 */
public class ProblemSeventeen {
    public static void problemSeventeen() {
        int total = 0;
        for(int count = 1; count<=1000; count++){
            total+=wordlength(answer(count));
            System.out.println(answer(count));
            //System.out.println(wordlength(answer(count)));
           System.out.println(total);

        }

    }
    public static String answer(int num){
        ArrayList<Integer> Digit = numberInWord(num);
        String name = "";
        if (Digit.size() > 2) {
            name += zeroDigit[Digit.get(Digit.size() - 3)];
            name += " hundred ";
            if(!(Digit.get(Digit.size() - 2).equals(0)&&Digit.get(Digit.size() - 1).equals(0))){
                name+="and ";
            }
        }
        if (Digit.size() > 1) {
            if (Digit.get(Digit.size() - 2) == 1) {
                name += teens[Digit.get(Digit.size() - 1)];
                Digit.clear();
            } else {
                if (Digit.get(Digit.size() - 2) != 0)
                    name += tenDigit[Digit.get(Digit.size() - 2)];
            }
        }
        if (Digit.size() > 0) {
            name += " ";
            name += zeroDigit[Digit.get(Digit.size() - 1)];
        }
        return name;
    }
    public static ArrayList<Integer> numberInWord(int a){
        String num = (Integer.toString(a));
        ArrayList<Integer> digit = new ArrayList<>();
        for(int count=0; count<num.length(); count++){

            digit.add(new Integer(num.substring(count,count+1)));
        }

        return digit;
    }

    public static String[] zeroDigit={"","one","two","three","four","five","six","seven","eight","nine"};
    public static String[] tenDigit={"","one","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    public static String[] teens={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    public static int wordlength(String name){
        int length = 0;
        for(int count=0; count<name.length(); count++){
            if(!name.substring(count,count+1).equals(" "))
                length++;
        }
        return length;
    }
}

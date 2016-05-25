package com.company;

/**
 * Created by mr767 on 5/11/16.
 */
public class ProblemTwentySeven {
    public static void problemTwentySeven() {
        int finala=0;
        int finalb=0;
        int max=0;
        for(int a=-100000;a<100000; a++){
            for (int b=-100000;b<100000; b++){
                if(findprimeLength(a,b)>max){
                    max=findprimeLength(a,b);
                    finala=a;
                    finalb=b;
                }
            }
        }
        System.out.println(finala*finalb+" "+finala+" "+finalb+" "+findprimeLength(finala,finalb));
    }



    public static int findprimeLength(int a, int b){
        int size=0;
        for(int count=0; count<100; count++){
            int num = (count*count)+(a*count)+(b);
            if (num>0&&isPrime(num)){
                size++;
            }
            else{
                break;
            }
        }
        return size;

    }
    public static boolean isPrime(int a){
        for(int count=2; count<=Math.sqrt(a); count++){
            if(a%count==0){
                return false;
            }
        }
        return true;
    }
}

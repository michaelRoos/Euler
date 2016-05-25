package com.company;

/**
 * Created by mr767 on 12/15/15.
 */
public class ProblemNine {
    public static void problemNine() {
       long start = System.currentTimeMillis();

        for(int a=1; a<1000; a++){
            for(int b=1; b<1000; b++){
                for(int c=1; c<1000; c++){
                    if(test(a,b,c)){
                        if(a+b+c==1000){
                            System.out.println(a*b*c);
                            a=1000;
                            b=1000;
                            c=1000;
                        }
                    }
                }
            }
        }
    long end = System.currentTimeMillis();
        long total = end-start;
        System.out.println("time: "+total);

    }
    public static void problemNine2(){
        long start = System.currentTimeMillis();
        for(double m=1; m<23; m++){


            //2m(m+n)=1000
            double n=(500/m)-m;
            if(n%1==0&&m>n)
                System.out.println((m*m-n*n)*(2*m*n)*(m*m+n*n));
        }
        long end = System.currentTimeMillis();
        long total = end-start;
        System.out.println("time: "+total);
    }
    public static boolean test(int a, int b, int c){
        a=a*a;
        b=b*b;
        c=c*c;
        return(a+b==c);
    }

}

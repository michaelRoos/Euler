package com.company;

import java.util.ArrayList;

/**
 * Created by mr767 on 5/11/16.
 */
public class ProblemTwentyEight {
    public static void problemTwentyEight() {
        int sum=1;
        for(int count=3; count<=1001; count+=2){
            for(int step=0; step<4; step++){
                sum+=fourCorners(count).get(step);
            }
        }
        System.out.println(sum);
    }
    public static ArrayList<Integer> fourCorners(int sidelength){
        ArrayList<Integer> corners=new ArrayList<>();
        int num=(int)(Math.pow(sidelength-2,2));
        for(int count=0; count<4; count++) {
            num += (sidelength - 1);
            corners.add(num);
        }
        return corners;
    }
}

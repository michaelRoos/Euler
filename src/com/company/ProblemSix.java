package com.company;

/**
 * Created by mr767 on 12/15/15.
 */
public class ProblemSix {
    public static void problemSix(){
        int squareOfSum = 0;
        int sumOfSquares = 0;

        for(int count=0; count<=100; count++) {
            sumOfSquares += count * count;
            squareOfSum+=count;
        }
        squareOfSum=squareOfSum*squareOfSum;
        System.out.println(squareOfSum-sumOfSquares);
    }
}

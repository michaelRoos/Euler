package com.company;

/**
 * Created by mr767 on 5/12/16.
 */
public class ProblemThirtyOne {
    public static void problemThirtyOne() {
        //1,2,5,10,20,50,100,200

        int target = 200;
        int[] coinSizes = { 1, 2, 5, 10, 20, 50, 100, 200 };
        int[] ways = new int[target+1];
        ways[0] = 1;

        for (int i = 0; i < coinSizes.length; i++) {
            for (int j = coinSizes[i]; j <= target; j++) {
                ways[j] += ways[j - coinSizes[i]];
            }
        }
        System.out.println(ways[200]);


/*
        int target  = 200;
        int ways = 0;

        for (int a = target; a >= 0; a -= 200) {
            for (int b = a; b >= 0; b -= 100) {
                for (int c = b; c >= 0; c -= 50) {
                    for (int d = c; d >= 0; d -= 20) {
                        for (int e = d; e >= 0; e -= 10) {
                            for (int f = e; f >= 0; f -= 5) {
                                for (int g = f; g >= 0; g -= 2) {
                                    ways++;
                                }
                            }
                        }
                    }
                }
            }
        }*/
    }
}

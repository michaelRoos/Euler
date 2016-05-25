package com.company;

/**
 * Created by mr767 on 5/13/16.
 */
public class ProblemThirtyFour {
    public static void problemThirtyFour() {
        int sum = 0;
        for (int count = 3; count < 100000; count++) {
            if (isSumFactorial(count)) {
                sum += count;
            }

        }
        System.out.println(sum);
    }

    private static boolean isSumFactorial(int num) {
        String temp = String.valueOf(num);
        int sum = 0;
        for (int count = 0; count < temp.length(); count++) {
            sum += factorial(new Integer(temp.substring(count,count+1)));
        }
        return num==sum;
    }

    private static int factorial(int a) {
        int sum = 1;
        for (int count = 1; count <= a; count++) {
            sum *= count;
        }
        return sum;
    }
}

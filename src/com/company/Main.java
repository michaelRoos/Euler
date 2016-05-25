package com.company;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        long time= System.currentTimeMillis();
        ProblemThirtyFour.problemThirtyFour();
        System.out.println("This solution took "+(System.currentTimeMillis()-time)+" ms to complete");


    }
}

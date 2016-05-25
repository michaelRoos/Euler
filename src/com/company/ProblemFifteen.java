package com.company;

import java.util.ArrayList;

/**
 * Created by mr767 on 12/18/15.
 */
public class ProblemFifteen {
    static final long n = 20;
    public static void problemFifteen(){
        long row = 2*n;
        ArrayList<long[]> pascal = makePascal(row);
        //printArray(pascal);
        long[] finalRow = pascal.get(pascal.size()-1);
            long answer = finalRow[finalRow.length/2];
        System.out.println(answer);


    }
    public static ArrayList makePascal(long a){
        ArrayList <long[]> pascal = new ArrayList<>();
        long[] row = new long[]{1};
        pascal.add(row);
        for(int count=0;count<a;count++){
            pascal.add(factorialRow(pascal.get(pascal.size()-1)));
        }
        return pascal;

    }
    public static void printArray(ArrayList<long[]> board) {
        for(int count=0; count<board.size(); count++){

            for(long num: board.get(count)){
                System.out.print(num+" \t");
            }
            System.out.println();
        }
    }

    public static long[] factorialRow(long[] row){
    long[] newRow = new long[row.length+1];
        newRow[0]=1;
        newRow[row.length]=1;
    for(int count=1; count<row.length; count++){
        newRow[count]=row[count-1]+row[count];
    }





        return newRow;
    }







}

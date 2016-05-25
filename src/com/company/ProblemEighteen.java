package com.company;

import java.util.ArrayList;

/**
 * Created by mr767 on 1/4/16.
 */
public class ProblemEighteen {
    public static void problemeighteen(){

String triange =
        "75\n" +
        "95 64\n" +
        "17 47 82\n" +
        "18 35 87 10\n" +
        "20 04 82 47 65\n" +
        "19 01 23 75 03 34\n" +
        "88 02 77 73 07 63 67\n" +
        "99 65 04 28 06 16 70 92\n" +
        "41 41 26 56 83 40 80 70 33\n" +
        "41 48 72 33 47 32 37 16 94 29\n" +
        "53 71 44 65 25 43 91 52 97 51 14\n" +
        "70 11 33 28 77 73 17 78 39 68 17 57\n" +
        "91 71 52 38 17 14 91 43 58 50 27 29 48\n" +
        "63 66 04 68 89 53 67 30 73 16 69 87 40 31\n" +
        "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23 ";
        System.out.println("\n\n");

        Integer[][] triArray = new Integer[15][];
        ArrayList <ArrayList>Tri = new ArrayList();
        ArrayList <Integer> lvl = new ArrayList();
        String level="";
        for(int count = 0; count<=15; count++) {
            if(triange.indexOf("\n")>0) {
                level = triange.substring(0, triange.indexOf("\n"));
                triange = triange.substring(triange.indexOf("\n") + 1);
                level+=" ";
                lvl=new ArrayList<Integer>();

                while (level.indexOf(" ") > 0) {
                    lvl.add(new Integer(level.substring(0, triange.indexOf(" "))));
                    level = level.substring(triange.indexOf(" ")+1);
                }
                triArray[count]=lvl.toArray(new Integer[lvl.size()]);

            }



        }
        level=triange+" ";
        lvl=new ArrayList<Integer>();

        while (level.indexOf(" ") > 0) {
            lvl.add(new Integer(level.substring(0, triange.indexOf(" "))));
            level = level.substring(triange.indexOf(" ")+1);
        }
        triArray[14]=lvl.toArray(new Integer[lvl.size()]);

        for(int count=13; count>=0; count--){

            for(int x=0; x<triArray[count].length; x++){
                if(triArray[count+1][x]>triArray[count+1][x+1]){
                    triArray[count][x]+=triArray[count+1][x];
                }
                else{
                    triArray[count][x]+=triArray[count+1][x+1];
                }
            }

        }
        printArray(triArray);
    }
    public static void printArray(Integer[][] triArray){
        for(Integer[] row: triArray){
            for(int num : row){
                System.out.print(num+"\t");
            }
            System.out.println();

        }
    }


}

class numObject{
    public int value=0;
    boolean Left = false;
    public numObject(int val, boolean left){
        value=val;
        Left=left;
    }

}
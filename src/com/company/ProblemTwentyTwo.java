package com.company;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by mr767 on 2/2/16.
 */
public class ProblemTwentyTwo {
    public static String everything;
    public static void problemTwentyTwo() throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("src/names.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();


        }

        ArrayList<String> names = new ArrayList();
        while (everything.indexOf(",")>0){
               // System.out.println(everything);
            String temp = everything.substring(1, everything.indexOf(",")-1);
            names.add(temp);
           // System.out.println(temp);
            if(everything.length()>10)
            everything=everything.substring(everything.indexOf(",", 1)+1);
        }
        names.add(everything.substring(1, everything.length()-2));
        Collections.sort(names);
        long sum=0;
        for(int count=0; count<names.size(); count++){
            sum+=((count+1)*stringSum(names.get(count)));
        }
        System.out.println(sum);



    }
    public static int stringSum(String a){
        int sum = 0;
        for(int count=0; count<a.length(); count++){
            int temp = (int) a.charAt(count);
            sum+=(temp-64);

        }


        return sum;
    }
}

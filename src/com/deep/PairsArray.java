package com.deep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairsArray {


    public static void main(String args[]) {

        int[] base = {1,2, 3, 4, 3, 5, 7};

        //sum=6, [3,3],[2,4], [4,2], [3,3], [1,5], [5,1]

        //1, 2, 3, 3, 4, 5, 7

        int sum=6;
        Arrays.sort(base);

        for(int i=0;i<base.length-1;i++){
            for(int j=i+1;j<base.length;j++){

                if(base[i]+base[j]==sum){

                    System.out.println("["+base[i]+","+base[j]+"]");
                    System.out.println("["+base[j]+","+base[i]+"]");
                }

            }

        }

    }

}

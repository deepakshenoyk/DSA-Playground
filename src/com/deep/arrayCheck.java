package com.deep;

import java.util.Arrays;

public class arrayCheck {

    public static void main(String[] args){
        Integer[] data = {0,1,2,3,4,5,6,7};
        int sum=6;


        System.out.println("***********Brute Force***********");

        for(int i=0;i<data.length;i++){
            for(int j=i+1;j<data.length;j++){
                if(data[i]+data[j]==sum){
                    System.out.println(data[i]+" "+data[j]);
                }
            }
        }


        System.out.println("***********Binary Search***********");


        for(int e:data){

            if(Arrays.binarySearch(data,sum-e)>0){
                System.out.println(e+" "+(sum-e));
            }

        }


        System.out.println("**********List***********");


        for(int e:data){

            if(Arrays.asList(data).contains(sum-e)){
                System.out.println(e+" "+(sum-e));
            }

        }

    }

}

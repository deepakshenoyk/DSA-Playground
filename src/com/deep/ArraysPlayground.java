package com.deep;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class ArraysPlayground {

    public static void main(String args[]) {

        int num[]={10,11,15,2, 3, 4, 5, 6, 7, 8,9};

        int largest =num[0];
        int smallest=num[0];


        for(int i=1;i<num.length;i++){

            if(num[i]>largest)
                largest=num[i];
            else if(num[i]<smallest)
                smallest=num[i];
        }
        System.out.println("max number: "+Arrays.stream(num).max().getAsInt());
        System.out.println("min number: "+Arrays.stream(num).min().getAsInt());
        System.out.println("smallest number is: "+smallest);
        System.out.println("largest number is: "+largest);

    }


}

package com.deep;

import javax.naming.PartialResultException;
import java.util.Arrays;

public class Arrays_FindSecondLargestNumber {

    public static void main(String args[]) {

        int num[]={10,11,15,11, 2, 3, 4, 5, 6, 7, 8,9};

        int highestNum= Integer.MIN_VALUE;
        int secondHighest= Integer.MIN_VALUE;

        System.out.println(highestNum);
        System.out.println(secondHighest);


        for(int i=1;i<num.length;i++){

            if(num[i]>highestNum){
                secondHighest=highestNum;

                highestNum=num[i];
            }

            else if(num[i]>secondHighest && num[i]!=highestNum){
                secondHighest=num[i];
            }


        }

        System.out.println(secondHighest);

    }




}

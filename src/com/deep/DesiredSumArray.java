package com.deep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class DesiredSumArray {

    public static void main(String args[]) {


        int[] givenArray = {6, 10, 8, 9, 7, 6, 11, 2,2};

        HashMap<Integer, Integer> finalArray= new HashMap<Integer, Integer>();

        int[] sortedArray= Arrays.stream(givenArray).sorted().toArray();

        int desiredSum=12;
        int left=0;
        int right = sortedArray.length-1;

        while(left<right){

            int sum=sortedArray[left]+sortedArray[right];

            if(sum==desiredSum) {
                if(!finalArray.containsKey(sortedArray[left])){
                System.out.println(sortedArray[left]+","+sortedArray[right]);
                left++;
                }
                left++;
            }
            else if(sum>desiredSum)
                right--;
            else
                left++;
        }


    }
}

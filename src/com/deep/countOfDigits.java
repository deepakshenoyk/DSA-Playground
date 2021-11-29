package com.deep;

import java.security.Key;
import java.util.HashMap;
import java.util.Set;

public class countOfDigits {

    public static void main(String args[]) {

        int a = 1235312;

        HashMap<Integer, Integer> digitMap = new HashMap<Integer,Integer>();


        while(a!=0){

            int lastNumber=a%10;

            if(digitMap.containsKey(lastNumber)){
                digitMap.put(lastNumber,digitMap.get(lastNumber)+1);
            }
            else
            {
                digitMap.put(lastNumber,1);
            }

            a=a/10;

        }


        Set<Integer> keys=digitMap.keySet();

        for(int key:keys){
            System.out.println(key+":"+digitMap.get(key));
        }


    }

}

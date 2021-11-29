package com.deep;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DuplicatesUsingHashSet {


    public static void main(String args[]){

        String[] name= {"Deepak","1","Suresh","Vidya","Deepak","1","1",null,null};

        Map<String,Integer> mp = new HashMap<>();

        for(String e:name){

            if(mp.containsKey(e)==false){
                mp.put(e,1);
            }
            else
                mp.put(e,mp.get(e)+1);

        }

        for( Map.Entry<String, Integer> e:mp.entrySet()){
            if(e.getValue()%2==0){
                System.out.println(e);
            }


        }



    }

}

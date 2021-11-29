package com.deep;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class PlayWithStrings {

    public static void main(String args[]) {


        String name = "Deepak is Good Deepak is iS Deep";

        String sub = "iS";

        boolean abc = name.matches("(.*)"+sub+"(.*)");

        System.out.println(abc);

        String[] splitName = name.split(" ");

        Map<String,Integer> mapValue = new HashMap<String,Integer>();


        for(String e: splitName){

            if(mapValue.containsKey(e)){

                mapValue.put(e,mapValue.get(e)+1);

            }
            else
            {
                mapValue.put(e,1);
            }

        }


        for(Map.Entry<String, Integer> e:mapValue.entrySet()){

                System.out.println(e);

        }

        }

    }

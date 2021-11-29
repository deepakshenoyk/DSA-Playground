package com.deep;

import java.util.HashMap;
import java.util.Map;

public class StringCharacterArray {


    public static void main(String args[]) {


        String name = "Deeeeeeepppppaaaaak Deepak";

        char[] charName = name.toCharArray();

        Map<Character,Integer> mp = new HashMap<>();
        mp.put('a',0);
        mp.put('e',0);
        mp.put('i',0);
        mp.put('o',0);
        mp.put('u',0);

        for(char e:charName){
            if(isVowel(e)){
                mp.put(e,mp.get(e)+1);
            }
        }

        for(Map.Entry<Character, Integer> e:mp.entrySet()){
            if(e.getValue()!=0){
            System.out.println(e);
        }
        }

    }

    public static Boolean isVowel(char c){

        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            return true;
        else
            return false;
    }


}

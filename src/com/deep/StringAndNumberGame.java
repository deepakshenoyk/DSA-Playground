package com.deep;

public class StringAndNumberGame {

    public static void main(String args[]) {

        String name = "Deepak1 and2 Goa3";

        String[] splitName = name.split(" ");


        for(String e:splitName){

            System.out.print(new StringBuffer(e).reverse().deleteCharAt(0)+" ");

        }


    }


}

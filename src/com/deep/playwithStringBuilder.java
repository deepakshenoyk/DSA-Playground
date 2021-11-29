package com.deep;

public class playwithStringBuilder {

    public static void main(String[] args){


        String name= "malaYalam";

        StringBuilder sb = new StringBuilder();

       char[] nameArray=name.toCharArray();

       for(int i=nameArray.length-1;i>=0;i--){

           sb.append(nameArray[i]);

       }
        if(name.equalsIgnoreCase(sb.toString())){
            System.out.println("Palindrome");
        }
        else
            System.out.println("not palindrome");

    }


}

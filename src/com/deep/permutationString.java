package com.deep;

public class permutationString {

    public static void main(String[] args){

        //Dee@pak.cm
        //Pratheek@abc.com
//        mo@ccb.a1a

        String name="a23@abc.com";

        int value1 = name.indexOf('@');
        int value2= name.indexOf('.');

        System.out.println(name);

//        mck@ape.ed;

        String reversedName=new StringBuffer(name).reverse().toString();



        String[] arr1=reversedName.split("\\.");

        String[] arr2=arr1[1].split("@");

        String abc= new String(arr1[0]+arr2[0]+arr2[1]);

        char[] abcChar= abc.toCharArray();

        StringBuilder sb= new StringBuilder();

        for( int i=0; i<abcChar.length;i++){

            if(i==value1){
                sb.append("@"+abcChar[i]);
            }
            else
                if(i==value2-1){
                    sb.append("."+abcChar[i]);
                }
                else
                    sb.append(abcChar[i]);

        }

        System.out.println(sb);


    }
}

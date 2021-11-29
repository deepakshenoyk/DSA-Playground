package com.deep;

public class ReversingString {

    public static void main(String args[]) {


        String sent= "Deepak is good";

//        String sentReverse= new StringBuffer(sent).reverse().toString();
//
//        System.out.println(sentReverse);

      String abc= new StringBuilder(sent).reverse().toString();

        System.out.println("abc "+abc);

        StringBuffer stbuffer = new StringBuffer();

        System.out.println("print STB "+stbuffer);

        char[] strChars = sent.toCharArray();

//        for(int i=strChars.length-1;i>=0;i--){
//
//            stb.append(strChars[i]);
//            System.out.println("Printing Char String "+strChars[i]);
//        }


        for(int i=strChars.length-1;i>=0;i--){
            stbuffer.append(strChars[i]);

        }



        System.out.println("printing final "+stbuffer);

    }


}
